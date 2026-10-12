package qi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import qg.x1;
public final class s {
    public final File f46893a;
    public final int f46894b;
    public final boolean f46895c;
    public final l d;
    public final x1 f46896e;
    public MP4Builder f46899i;
    public MediaFormat f46900j;
    public MediaFormat f46901k;
    public long f46904n;
    public long f46905o;
    public long f46906p;
    public long f46908r;
    public ByteBuffer f46909s;
    public boolean f46911u;
    public final ArrayList f46897f = new ArrayList();
    public final r f46898g = new r(33333);
    public final r h = new r(21333);
    public int f46902l = -1;
    public int f46903m = -1;
    public long f46907q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f46910t = new MediaCodec.BufferInfo();

    public s(File file, int i10, boolean z10, l lVar, x1 x1Var) {
        this.f46893a = file;
        this.f46894b = i10;
        this.f46895c = z10;
        this.d = lVar;
        this.f46896e = x1Var;
    }

    public static IOException b(String str, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        return new IOException(str, exc);
    }

    public static int c(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        if (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) {
            return 3;
        }
        return 0;
    }

    public static int f(ByteBuffer byteBuffer, int i10, int i11) {
        int i12;
        while (true) {
            int i13 = i10 + 2;
            if (i13 < i11) {
                if (byteBuffer.get(i10) != 0 || byteBuffer.get(i10 + 1) != 0 || (byteBuffer.get(i13) != 1 && ((i12 = i10 + 3) >= i11 || byteBuffer.get(i13) != 0 || byteBuffer.get(i12) != 1))) {
                    i10++;
                }
            } else {
                return -1;
            }
        }
        return i10;
    }

    public static boolean k(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int c10 = c(byteBuffer);
                    int c11 = c(byteBuffer2);
                    int limit = byteBuffer.limit() - c10;
                    if (limit == byteBuffer2.limit() - c11) {
                        for (int i10 = 0; i10 < limit; i10++) {
                            if (byteBuffer.get(c10 + i10) == byteBuffer2.get(c11 + i10)) {
                            }
                        }
                        continue;
                    }
                } else if (byteBuffer == byteBuffer2) {
                }
            }
            return true;
        }
        return false;
    }

    public static int m(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 + 3 < i11 && byteBuffer.get(i10 + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public final synchronized void a() {
        if (this.f46911u) {
            return;
        }
        this.f46911u = true;
        this.f46897f.clear();
        MP4Builder mP4Builder = this.f46899i;
        if (mP4Builder == null) {
            return;
        }
        try {
            mP4Builder.abortMovie();
            l lVar = this.d;
            lVar.b("MP4 aborted: file=" + this.f46893a.getName() + ", videoSamples=" + this.f46905o + ", audioSamples=" + this.f46906p);
        } catch (Exception e7) {
            throw b("Unable to abort MP4", e7);
        }
    }

    public final MediaCodec.BufferInfo d(boolean z10, MediaCodec.BufferInfo bufferInfo, long j3) {
        r rVar;
        long j10;
        long max;
        long max2;
        r rVar2 = this.h;
        r rVar3 = this.f46898g;
        if (z10) {
            rVar = rVar3;
        } else {
            rVar = rVar2;
        }
        long j11 = 0;
        if (j3 < 0) {
            max = Math.max(0L, j3 + bufferInfo.presentationTimeUs);
        } else {
            if (this.f46907q != j3) {
                this.f46907q = j3;
                long j12 = rVar3.f46892c;
                if (j12 != Long.MIN_VALUE) {
                    j11 = Math.max(1L, rVar3.d) + j12;
                }
                long j13 = rVar2.f46892c;
                if (j13 == Long.MIN_VALUE) {
                    max2 = 0;
                } else {
                    max2 = Math.max(1L, rVar2.d) + j13;
                }
                this.f46908r = Math.max(j3, Math.max(j11, max2));
                j10 = Long.MIN_VALUE;
                rVar3.f46890a = Long.MIN_VALUE;
                rVar3.f46891b = Long.MIN_VALUE;
                rVar2.f46890a = Long.MIN_VALUE;
                rVar2.f46891b = Long.MIN_VALUE;
            } else {
                j10 = Long.MIN_VALUE;
            }
            if (rVar.f46890a == j10) {
                rVar.f46890a = bufferInfo.presentationTimeUs;
            }
            j11 = 0;
            max = this.f46908r + Math.max(0L, bufferInfo.presentationTimeUs - rVar.f46890a);
        }
        long j14 = max;
        long j15 = bufferInfo.presentationTimeUs;
        long j16 = rVar.f46891b;
        if (j16 != Long.MIN_VALUE) {
            long j17 = j15 - j16;
            if (j17 > j11 && j17 < 1000000) {
                rVar.d = j17;
            }
        }
        rVar.f46891b = j15;
        rVar.f46892c = Math.max(rVar.f46892c, j14);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j14, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void e(File file) {
        if (this.f46899i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f46899i.finishMovie(file);
                l lVar = this.d;
                lVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e7) {
                throw b("Unable to create preview MP4", e7);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.f46911u) {
            return;
        }
        if (this.f46899i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f46899i.finishMovie();
                this.f46911u = true;
                j(this.f46893a.length());
                l lVar = this.d;
                lVar.b("MP4 finalized: file=" + this.f46893a.getName() + ", size=" + this.f46893a.length() + ", videoSamples=" + this.f46905o + ", audioSamples=" + this.f46906p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e7) {
                throw b("Unable to finish MP4", e7);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void h() {
        ArrayList arrayList = this.f46897f;
        if (this.f46900j != null) {
            boolean z10 = this.f46895c;
            if (!z10 || this.f46901k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f46893a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f46894b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f46899i = createMovie;
                    this.f46902l = createMovie.addTrack(this.f46900j, false);
                    if (z10) {
                        this.f46903m = this.f46899i.addTrack(this.f46901k, true);
                    }
                    l lVar = this.d;
                    lVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        q qVar = (q) arrayList.get(i11);
                        o(qVar.f46883a, qVar.f46884b, qVar.f46885c);
                    }
                    arrayList.clear();
                } catch (Exception e7) {
                    throw b("Unable to initialize MP4", e7);
                }
            }
        }
    }

    public final int i(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        int i11;
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 == bufferInfo.offset) {
            int m10 = m(byteBuffer, f7, i13);
            int f10 = f(byteBuffer, f7 + m10, i13);
            if (m10 == 4 && f10 < 0) {
                return 1;
            }
            int i14 = f7;
            int i15 = 0;
            int i16 = 0;
            while (i14 >= 0) {
                int m11 = m(byteBuffer, i14, i13) + i14;
                i14 = f(byteBuffer, m11, i13);
                if (i14 < 0) {
                    i11 = i13;
                } else {
                    i11 = i14;
                }
                if (i11 > m11) {
                    i15++;
                    i16 += (i11 + 4) - m11;
                }
            }
            if (i15 != 0) {
                ByteBuffer byteBuffer2 = this.f46909s;
                if (byteBuffer2 == null || byteBuffer2.capacity() < i16) {
                    this.f46909s = ByteBuffer.allocateDirect(i16);
                }
                this.f46909s.clear();
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                while (f7 >= 0) {
                    try {
                        int m12 = f7 + m(byteBuffer, f7, i13);
                        int f11 = f(byteBuffer, m12, i13);
                        if (f11 < 0) {
                            i10 = i13;
                        } else {
                            i10 = f11;
                        }
                        if (i10 > m12) {
                            this.f46909s.putInt(i10 - m12);
                            byteBuffer.position(m12);
                            byteBuffer.limit(i10);
                            this.f46909s.put(byteBuffer);
                        }
                        f7 = f11;
                    } catch (Throwable th2) {
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        throw th2;
                    }
                }
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f46909s.flip();
                this.f46910t.set(0, this.f46909s.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                return 2;
            }
        }
        return 0;
    }

    public final void j(long j3) {
        if (j3 <= this.f46904n) {
            return;
        }
        this.f46904n = j3;
        x1 x1Var = this.f46896e;
        p0 p0Var = (p0) x1Var.f46566b;
        l0 l0Var = (l0) x1Var.f46567c;
        synchronized (p0Var.f46865g) {
            try {
                long j10 = l0Var.f46809c;
                long j11 = j3 - j10;
                if (j11 > 0 && !l0Var.d) {
                    l0Var.f46809c = j3;
                    p0Var.f46869l.execute(new a3.g0(p0Var, l0Var, j10, j11, 15));
                }
            } finally {
            }
        }
    }

    public final synchronized void l(MediaFormat mediaFormat, boolean z10) {
        MediaFormat mediaFormat2;
        String str;
        try {
            if (this.f46911u) {
                return;
            }
            if (this.f46899i != null) {
                if (z10) {
                    mediaFormat2 = this.f46900j;
                } else {
                    mediaFormat2 = this.f46901k;
                }
                if ((z10 && !k(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f46895c && !k(mediaFormat2, mediaFormat, "csd-0"))) {
                    StringBuilder sb2 = new StringBuilder();
                    if (z10) {
                        str = "Video";
                    } else {
                        str = "Audio";
                    }
                    sb2.append(str);
                    sb2.append(" codec configuration changed between segments");
                    throw new IOException(sb2.toString());
                }
                return;
            }
            if (z10) {
                this.f46900j = mediaFormat;
            } else if (this.f46895c) {
                this.f46901k = mediaFormat;
            }
            h();
        } finally {
        }
    }

    public final synchronized void n(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f46911u) {
                if (!z10) {
                    if (this.f46895c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo d = d(z10, bufferInfo, j3);
                    if (this.f46899i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        d.offset = 0;
                        this.f46897f.add(new q(z10, allocateDirect, d));
                        return;
                    }
                    o(z10, byteBuffer, d);
                }
            }
        } finally {
        }
    }

    public final void o(boolean r5, java.nio.ByteBuffer r6, android.media.MediaCodec.BufferInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: qi.s.o(boolean, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):void");
    }
}
