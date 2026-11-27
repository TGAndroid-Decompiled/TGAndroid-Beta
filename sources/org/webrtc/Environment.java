package org.webrtc;
public final class Environment implements AutoCloseable {
    private final long webrtcEnv;

    public static class Builder {
        private String fieldTrials;

        public Environment build() {
            return new Environment(this.fieldTrials, 0);
        }

        public Builder setFieldTrials(String str) {
            this.fieldTrials = str;
            return this;
        }
    }

    public interface Natives {
        long create(String str);

        long currentTimeNanos(long j);

        void free(long j);
    }

    private Environment(String str) {
        this.webrtcEnv = EnvironmentJni.get().create(str);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public void close() {
        EnvironmentJni.get().free(this.webrtcEnv);
    }

    public long getCurrentTimeNanos() {
        return EnvironmentJni.get().currentTimeNanos(this.webrtcEnv);
    }

    public long ref() {
        return this.webrtcEnv;
    }

    public Environment(String str, int i) {
        this(str);
    }
}
