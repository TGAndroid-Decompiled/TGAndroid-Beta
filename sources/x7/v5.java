package x7;

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
public abstract class v5 {
    public static int a(MediaExtractor mediaExtractor) {
        for (int i3 = 0; i3 < mediaExtractor.getTrackCount(); i3++) {
            String string = mediaExtractor.getTrackFormat(i3).getString("mime");
            if (string != null && string.startsWith("video/")) {
                return i3;
            }
        }
        return -1;
    }

    public static int b(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2, wi.v0 v0Var, long j10, long j11, wi.w0 w0Var) {
        long j12;
        boolean z10;
        long j13;
        long j14;
        boolean z11;
        boolean z12;
        long j15;
        int i3;
        boolean z13;
        boolean z14;
        int i10;
        int dequeueOutputBuffer;
        boolean z15;
        int dequeueInputBuffer;
        int i11;
        int readSampleData;
        MediaCodec mediaCodec3 = mediaCodec;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        int i12 = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z16 = false;
        int i13 = 0;
        boolean z17 = false;
        boolean z18 = false;
        int i14 = 0;
        while (!z16) {
            if (!z17 && (dequeueInputBuffer = mediaCodec3.dequeueInputBuffer(10000L)) >= 0) {
                long sampleTime = mediaExtractor.getSampleTime();
                if ((mediaExtractor.getSampleFlags() & 1) != 0) {
                    i11 = 1;
                } else {
                    i11 = i12;
                }
                if (sampleTime < 0 || (sampleTime >= j11 && i11 != 0)) {
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
                        readSampleData = mediaExtractor.readSampleData(inputBuffer, i12);
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
                    synchronized (v0Var.f58089b) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() + 2500;
                        while (!v0Var.f58098m) {
                            long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                            if (elapsedRealtime3 > j14) {
                                try {
                                    v0Var.f58089b.wait(elapsedRealtime3);
                                    j14 = 0;
                                } catch (InterruptedException e10) {
                                    Thread.currentThread().interrupt();
                                    throw new IOException("Video re-encoding was interrupted", e10);
                                }
                            } else {
                                throw new IOException("Decoded frame did not arrive");
                            }
                        }
                        v0Var.f58098m = false;
                    }
                    v0Var.f58096k.updateTexImage();
                    v0Var.f58096k.getTransformMatrix(v0Var.f58090c);
                    int i15 = v0Var.f58088a;
                    GLES20.glViewport(0, 0, i15, i15);
                    GLES20.glUseProgram(v0Var.f58094i);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, v0Var.f58095j);
                    int glGetAttribLocation = GLES20.glGetAttribLocation(v0Var.f58094i, "aPosition");
                    int glGetAttribLocation2 = GLES20.glGetAttribLocation(v0Var.f58094i, "aTextureCoord");
                    FloatBuffer floatBuffer = v0Var.d;
                    floatBuffer.position(0);
                    GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 16, (Buffer) v0Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                    floatBuffer.position(2);
                    GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 16, (Buffer) v0Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                    z12 = true;
                    GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(v0Var.f58094i, "uTextureMatrix"), 1, false, v0Var.f58090c, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    EGLExt.eglPresentationTimeANDROID(v0Var.f58092f, v0Var.h, j16 * 1000);
                    if (!EGL14.eglSwapBuffers(v0Var.f58092f, v0Var.h)) {
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
            int i16 = i14;
            z16 = z10;
            while (true) {
                if (dequeueOutputBuffer2 != -1) {
                    if (dequeueOutputBuffer2 == -2) {
                        MediaFormat outputFormat = mediaCodec2.getOutputFormat();
                        i16 = wi.m.f(outputFormat);
                        w0Var.x(outputFormat);
                    } else if (dequeueOutputBuffer2 >= 0) {
                        ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(dequeueOutputBuffer2);
                        int i17 = bufferInfo2.flags;
                        if ((i17 & 2) != 0) {
                            z13 = z12;
                        } else {
                            z13 = false;
                        }
                        if (outputBuffer != null && (i10 = bufferInfo2.size) > 0 && !z13) {
                            if (i16 > 0 && (i17 & 1) != 0 && i10 > i16) {
                                bufferInfo2.offset += i16;
                                bufferInfo2.size = i10 - i16;
                            }
                            w0Var.r(outputBuffer, bufferInfo2);
                            i13++;
                        }
                        if ((bufferInfo2.flags & 4) != 0) {
                            z14 = z12;
                        } else {
                            z14 = false;
                        }
                        i3 = 0;
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
                    i3 = 0;
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
            i14 = i16;
            i12 = i3;
        }
        return i13;
    }

    public static void c(java.io.File r3, long r4, long r6, long r8, int r10, int r11, int r12, wi.w0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: x7.v5.c(java.io.File, long, long, long, int, int, int, wi.w0):void");
    }
}
