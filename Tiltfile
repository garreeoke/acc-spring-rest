load('.tanzu/tanzu_tilt_extensions.py', 'tanzu_k8s_yaml')

SOURCE_IMAGE = os.getenv("SOURCE_IMAGE", default='change-registry-path/change-app-source')
LOCAL_PATH = os.getenv("LOCAL_PATH", default='.')

custom_build('change-registry-path/change-app',
    "tanzu apps workload apply -f config/workload.yaml --live-update \
      --local-path " + LOCAL_PATH + " --source-image " + SOURCE_IMAGE + " --yes && \
    .tanzu/wait.sh change-app",
  ['pom.xml', './target/classes'],
  live_update = [
    sync('./target/classes', '/workspace/BOOT-INF/classes')
  ],
  skips_local_docker=True
)

tanzu_k8s_yaml('change-app', 'change-registry-path/change-app', './config/workload.yaml')
allow_k8s_contexts('allow-k8s-contexts')
