package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {
    MediaCodecWrapperFactoryImpl() {
    }

    private static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        }

        @Override
        public void start() {
            this.mediaCodec.start();
        }

        @Override
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override
        public void stop() {
            this.mediaCodec.stop();
        }

        @Override
        public void release() {
            this.mediaCodec.release();
        }

        @Override
        public int dequeueInputBuffer(long j) {
            return this.mediaCodec.dequeueInputBuffer(j);
        }

        @Override
        public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
            this.mediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        }

        @Override
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j);
        }

        @Override
        public void releaseOutputBuffer(int i, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i, z);
        }

        @Override
        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        @Override
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override
        public MediaFormat getOutputFormat(int i) {
            return this.mediaCodec.getOutputFormat(i);
        }

        @Override
        public ByteBuffer getInputBuffer(int i) {
            return this.mediaCodec.getInputBuffer(i);
        }

        @Override
        public ByteBuffer getOutputBuffer(int i) {
            return this.mediaCodec.getOutputBuffer(i);
        }

        @Override
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override
        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }
    }

    @Override
    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
