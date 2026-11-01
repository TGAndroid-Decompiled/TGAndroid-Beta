package w7;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
public abstract class r {
    public static int a(MediaExtractor mediaExtractor) {
        for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (string != null && string.startsWith("video/")) {
                return i10;
            }
        }
        return -1;
    }

    public static int b(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2, li.z0 z0Var, long j10, long j11, li.a1 a1Var) {
        long j12;
        boolean z10;
        long j13;
        long j14;
        boolean z11;
        boolean z12;
        long j15;
        int i10;
        boolean z13;
        boolean z14;
        int i11;
        int dequeueOutputBuffer;
        boolean z15;
        int dequeueInputBuffer;
        int i12;
        int readSampleData;
        MediaCodec mediaCodec3 = mediaCodec;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        int i13 = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z16 = false;
        int i14 = 0;
        boolean z17 = false;
        boolean z18 = false;
        int i15 = 0;
        while (!z16) {
            if (!z17 && (dequeueInputBuffer = mediaCodec3.dequeueInputBuffer(10000L)) >= 0) {
                long sampleTime = mediaExtractor.getSampleTime();
                if ((mediaExtractor.getSampleFlags() & 1) != 0) {
                    i12 = 1;
                } else {
                    i12 = i13;
                }
                if (sampleTime < 0 || (sampleTime >= j11 && i12 != 0)) {
                    j12 = elapsedRealtime;
                    z10 = z16;
                    j14 = 0;
                    j13 = 10000;
                    mediaCodec3 = mediaCodec;
                    mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                } else {
                    ByteBuffer inputBuffer = mediaCodec3.getInputBuffer(dequeueInputBuffer);
                    if (inputBuffer == null) {
                        readSampleData = -1;
                    } else {
                        readSampleData = mediaExtractor.readSampleData(inputBuffer, i13);
                    }
                    if (readSampleData < 0) {
                        j12 = elapsedRealtime;
                        z10 = z16;
                        j14 = 0;
                        j13 = 10000;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        mediaCodec3 = mediaCodec;
                    } else {
                        j12 = elapsedRealtime;
                        z10 = z16;
                        j14 = 0;
                        j13 = 10000;
                        mediaCodec3 = mediaCodec;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, 0);
                        mediaExtractor.advance();
                        z11 = true;
                    }
                }
                z17 = true;
                z11 = true;
            } else {
                j12 = elapsedRealtime;
                z10 = z16;
                j13 = 10000;
                j14 = 0;
                z11 = false;
            }
            if (!z18 && (dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, j13)) >= 0) {
                long j16 = bufferInfo.presentationTimeUs;
                if (bufferInfo.size > 0 && j16 >= j10 && j16 < j11) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, z15);
                if (z15) {
                    synchronized (z0Var.f12358b) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() + 2500;
                        while (!z0Var.f12366m) {
                            long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                            if (elapsedRealtime3 > j14) {
                                try {
                                    z0Var.f12358b.wait(elapsedRealtime3);
                                    j14 = 0;
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    throw new IOException("Video re-encoding was interrupted", e);
                                }
                            } else {
                                throw new IOException("Decoded frame did not arrive");
                            }
                        }
                        z0Var.f12366m = false;
                    }
                    z0Var.f12364k.updateTexImage();
                    z0Var.f12364k.getTransformMatrix(z0Var.f12359c);
                    int i16 = z0Var.f12357a;
                    GLES20.glViewport(0, 0, i16, i16);
                    GLES20.glUseProgram(z0Var.f12362i);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, z0Var.f12363j);
                    int glGetAttribLocation = GLES20.glGetAttribLocation(z0Var.f12362i, "aPosition");
                    int glGetAttribLocation2 = GLES20.glGetAttribLocation(z0Var.f12362i, "aTextureCoord");
                    FloatBuffer floatBuffer = z0Var.d;
                    floatBuffer.position(0);
                    GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 16, (Buffer) z0Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                    floatBuffer.position(2);
                    GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 16, (Buffer) z0Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                    z12 = true;
                    GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(z0Var.f12362i, "uTextureMatrix"), 1, false, z0Var.f12359c, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    EGLExt.eglPresentationTimeANDROID(z0Var.f12360f, z0Var.h, j16 * 1000);
                    if (!EGL14.eglSwapBuffers(z0Var.f12360f, z0Var.h)) {
                        throw new IllegalStateException("eglSwapBuffers failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    }
                } else {
                    z12 = true;
                }
                if ((bufferInfo.flags & 4) != 0) {
                    mediaCodec2.signalEndOfInputStream();
                    z18 = z12;
                }
                z11 = z12;
            } else {
                z12 = true;
            }
            if (z18) {
                j15 = 10000;
            } else {
                j15 = 0;
            }
            int dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, j15);
            int i17 = i15;
            z16 = z10;
            while (true) {
                if (dequeueOutputBuffer2 != -1) {
                    if (dequeueOutputBuffer2 == -2) {
                        MediaFormat outputFormat = mediaCodec2.getOutputFormat();
                        i17 = li.o.f(outputFormat);
                        a1Var.w(outputFormat);
                    } else if (dequeueOutputBuffer2 >= 0) {
                        ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(dequeueOutputBuffer2);
                        int i18 = bufferInfo2.flags;
                        if ((i18 & 2) != 0) {
                            z13 = z12;
                        } else {
                            z13 = false;
                        }
                        if (outputBuffer != null && (i11 = bufferInfo2.size) > 0 && !z13) {
                            if (i17 > 0 && (i18 & 1) != 0 && i11 > i17) {
                                bufferInfo2.offset += i17;
                                bufferInfo2.size = i11 - i17;
                            }
                            a1Var.p(outputBuffer, bufferInfo2);
                            i14++;
                        }
                        if ((bufferInfo2.flags & 4) != 0) {
                            z14 = z12;
                        } else {
                            z14 = false;
                        }
                        i10 = 0;
                        mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        z16 = z14;
                        if (z14) {
                            break;
                        }
                        dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 0L);
                        z11 = z12;
                    }
                    dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 0L);
                    z11 = z12;
                } else {
                    i10 = 0;
                    break;
                }
            }
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            if (z11) {
                elapsedRealtime = elapsedRealtime4;
            } else if (elapsedRealtime4 - j12 <= 5000) {
                elapsedRealtime = j12;
            } else {
                throw new IOException("Video re-encoding stalled");
            }
            i15 = i17;
            i13 = i10;
        }
        return i14;
    }

    public static void c(java.io.File r3, long r4, long r6, long r8, int r10, int r11, int r12, li.a1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: w7.r.c(java.io.File, long, long, long, int, int, int, li.a1):void");
    }
}
