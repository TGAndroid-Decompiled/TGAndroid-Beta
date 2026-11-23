package zi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.ui.wc1;
public final class x {
    public final File f62401a;
    public final int f62402b;
    public final boolean f62403c;
    public final o d;
    public final wc1 f62404e;
    public MP4Builder f62407i;
    public MediaFormat f62408j;
    public MediaFormat f62409k;
    public long f62412n;
    public long f62413o;
    public long f62414p;
    public long f62416r;
    public int f62417s;
    public ByteBuffer f62418t;
    public boolean v;
    public boolean f62420w;
    public boolean f62421x;
    public final ArrayList f62405f = new ArrayList();
    public final w f62406g = new w(33333);
    public final w h = new w(21333);
    public int f62410l = -1;
    public int f62411m = -1;
    public long f62415q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f62419u = new MediaCodec.BufferInfo();

    public x(File file, int i7, boolean z10, o oVar, wc1 wc1Var) {
        this.f62401a = file;
        this.f62402b = i7;
        this.f62403c = z10;
        this.d = oVar;
        this.f62404e = wc1Var;
    }

    public static int a(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        if (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) {
            return 3;
        }
        return 0;
    }

    public static String d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        return "offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", ptsUs=" + bufferInfo.presentationTimeUs + ", flags=" + bufferInfo.flags + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity();
    }

    public static String e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i7;
        int i10;
        String str;
        p(byteBuffer, bufferInfo);
        int i11 = bufferInfo.offset;
        int i12 = bufferInfo.size + i11;
        int f10 = f(byteBuffer, i11, i12);
        if (f10 == bufferInfo.offset) {
            i7 = o(byteBuffer, f10, i12);
            i10 = 0;
            while (f10 >= 0) {
                i10++;
                f10 = f(byteBuffer, o(byteBuffer, f10, i12) + f10, i12);
            }
        } else {
            i7 = 0;
            i10 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(byteBuffer, bufferInfo));
        sb2.append(", format=");
        if (i10 > 0) {
            str = "annex-b";
        } else {
            str = "avcc";
        }
        sb2.append(str);
        sb2.append(", nalCount=");
        sb2.append(i10);
        sb2.append(", firstPrefix=");
        sb2.append(i7);
        sb2.append(", head=");
        int i13 = bufferInfo.offset;
        StringBuilder sb3 = new StringBuilder();
        int min = Math.min(16, i12 - i13);
        for (int i14 = 0; i14 < min; i14++) {
            if (i14 > 0) {
                sb3.append(' ');
            }
            int i15 = byteBuffer.get(i13 + i14) & 255;
            if (i15 < 16) {
                sb3.append('0');
            }
            sb3.append(Integer.toHexString(i15));
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i7, int i10) {
        int i11;
        while (true) {
            int i12 = i7 + 2;
            if (i12 < i10) {
                if (byteBuffer.get(i7) != 0 || byteBuffer.get(i7 + 1) != 0 || (byteBuffer.get(i12) != 1 && ((i11 = i7 + 3) >= i10 || byteBuffer.get(i12) != 0 || byteBuffer.get(i11) != 1))) {
                    i7++;
                }
            } else {
                return -1;
            }
        }
        return i7;
    }

    public static boolean m(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a10 = a(byteBuffer);
                    int a11 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a10;
                    if (limit == byteBuffer2.limit() - a11) {
                        for (int i7 = 0; i7 < limit; i7++) {
                            if (byteBuffer.get(a10 + i7) == byteBuffer2.get(a11 + i7)) {
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

    public static int o(ByteBuffer byteBuffer, int i7, int i10) {
        if (i7 + 3 < i10 && byteBuffer.get(i7 + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public static void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i7 = bufferInfo.offset;
        int i10 = bufferInfo.size;
        long j3 = i7 + i10;
        if (i7 >= 0 && i10 >= 0 && j3 <= byteBuffer.limit()) {
            return;
        }
        throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
    }

    public final MediaCodec.BufferInfo b(boolean z10, MediaCodec.BufferInfo bufferInfo, long j3) {
        w wVar;
        long max;
        w wVar2 = this.h;
        w wVar3 = this.f62406g;
        if (z10) {
            wVar = wVar3;
        } else {
            wVar = wVar2;
        }
        if (j3 < 0) {
            max = Math.max(0L, j3 + bufferInfo.presentationTimeUs);
        } else {
            if (this.f62415q != j3) {
                this.f62415q = j3;
                this.f62416r = Math.max(j3, Math.max(wVar3.a(), wVar2.a()));
                wVar3.f62386a = Long.MIN_VALUE;
                wVar3.f62387b = Long.MIN_VALUE;
                wVar2.f62386a = Long.MIN_VALUE;
                wVar2.f62387b = Long.MIN_VALUE;
            }
            if (wVar.f62386a == Long.MIN_VALUE) {
                wVar.f62386a = bufferInfo.presentationTimeUs;
            }
            max = this.f62416r + Math.max(0L, bufferInfo.presentationTimeUs - wVar.f62386a);
        }
        long j10 = bufferInfo.presentationTimeUs;
        long j11 = wVar.f62387b;
        if (j11 != Long.MIN_VALUE) {
            long j12 = j10 - j11;
            if (j12 > 0 && j12 < 1000000) {
                wVar.d = j12;
            }
        }
        wVar.f62387b = j10;
        wVar.f62388c = Math.max(wVar.f62388c, max);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, max, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.f62407i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f62407i.finishMovie(file);
                o oVar = this.d;
                oVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e10) {
                throw new IOException("Unable to create preview MP4", e10);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.f62421x) {
            return;
        }
        if (this.f62407i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f62407i.finishMovie();
                this.f62421x = true;
                l(this.f62401a.length());
                o oVar = this.d;
                oVar.b("MP4 finalized: file=" + this.f62401a.getName() + ", size=" + this.f62401a.length() + ", videoSamples=" + this.f62413o + ", audioSamples=" + this.f62414p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e10) {
                throw new IOException("Unable to finish MP4", e10);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final synchronized long h() {
        long a10;
        try {
            a10 = this.f62406g.a();
            if (this.f62403c) {
                a10 = Math.max(a10, this.h.a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a10 / 1000;
    }

    public final synchronized int i() {
        return this.f62417s;
    }

    public final void j() {
        ArrayList arrayList = this.f62405f;
        if (this.f62408j != null) {
            boolean z10 = this.f62403c;
            if (!z10 || this.f62409k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f62401a;
                mp4Movie.setCacheFile(file);
                int i7 = this.f62402b;
                mp4Movie.setSize(i7, i7);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f62407i = createMovie;
                    this.f62410l = createMovie.addTrack(this.f62408j, false);
                    if (z10) {
                        this.f62411m = this.f62407i.addTrack(this.f62409k, true);
                    }
                    o oVar = this.d;
                    oVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i7 + "x" + i7 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        v vVar = (v) arrayList.get(i10);
                        r(vVar.f62379a, vVar.f62380b, vVar.f62381c);
                    }
                    arrayList.clear();
                } catch (Exception e10) {
                    throw new IOException("Unable to initialize MP4", e10);
                }
            }
        }
    }

    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        int i7;
        int i10;
        p(byteBuffer, bufferInfo);
        int i11 = bufferInfo.offset;
        int i12 = bufferInfo.size + i11;
        int f10 = f(byteBuffer, i11, i12);
        if (f10 != bufferInfo.offset) {
            int i13 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.f62418t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i13) {
                this.f62418t = ByteBuffer.allocateDirect(i13);
            }
            this.f62418t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f62418t.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f62418t.flip();
                this.f62419u.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i14 = 0;
        int i15 = f10;
        int i16 = 0;
        while (i15 >= 0) {
            int o4 = o(byteBuffer, i15, i12) + i15;
            i15 = f(byteBuffer, o4, i12);
            if (i15 < 0) {
                i10 = i12;
            } else {
                i10 = i15;
            }
            if (i10 > o4) {
                i14++;
                i16 = ((i10 + 4) - o4) + i16;
            }
        }
        if (i14 != 0) {
            ByteBuffer byteBuffer3 = this.f62418t;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i16) {
                this.f62418t = ByteBuffer.allocateDirect(i16);
            }
            this.f62418t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            while (f10 >= 0) {
                try {
                    int o10 = f10 + o(byteBuffer, f10, i12);
                    int f11 = f(byteBuffer, o10, i12);
                    if (f11 < 0) {
                        i7 = i12;
                    } else {
                        i7 = f11;
                    }
                    if (i7 > o10) {
                        this.f62418t.putInt(i7 - o10);
                        byteBuffer.position(o10);
                        byteBuffer.limit(i7);
                        this.f62418t.put(byteBuffer);
                        byteBuffer.limit(limit);
                    }
                    f10 = f11;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.f62418t.flip();
            this.f62419u.set(0, this.f62418t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        throw new IOException("Annex-B video sample contains no NAL units");
    }

    public final void l(long j3) {
        if (j3 > this.f62412n) {
            this.f62412n = j3;
            if (this.f62420w) {
                return;
            }
            wc1 wc1Var = this.f62404e;
            u0 u0Var = (u0) wc1Var.f53077b;
            q0 q0Var = (q0) wc1Var.f53078c;
            synchronized (u0Var.f62361g) {
                try {
                    long j10 = q0Var.f62291c;
                    long j11 = j3 - j10;
                    if (j11 > 0 && !q0Var.d) {
                        q0Var.f62291c = j3;
                        u0Var.f62364k.execute(new d3.e0(u0Var, q0Var, j10, j11, 8));
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void n(MediaFormat mediaFormat, boolean z10) {
        MediaFormat mediaFormat2;
        String str;
        try {
            if (this.f62421x) {
                return;
            }
            if (this.f62407i != null) {
                if (z10) {
                    mediaFormat2 = this.f62408j;
                } else {
                    mediaFormat2 = this.f62409k;
                }
                if ((z10 && !m(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f62403c && !m(mediaFormat2, mediaFormat, "csd-0"))) {
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
                this.f62408j = mediaFormat;
            } else if (this.f62403c) {
                this.f62409k = mediaFormat;
            }
            j();
        } finally {
        }
    }

    public final synchronized void q(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f62421x) {
                if (!z10) {
                    if (this.f62403c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z10, bufferInfo, j3);
                    if (this.f62407i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        b10.offset = 0;
                        this.f62405f.add(new v(z10, allocateDirect, b10));
                        return;
                    }
                    r(z10, byteBuffer, b10);
                }
            }
        } finally {
        }
    }

    public final void r(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String str;
        String d;
        int i7;
        o oVar = this.d;
        String str2 = null;
        if (z10) {
            try {
                if (!this.v) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.f62418t;
                bufferInfo2 = this.f62419u;
                if (!this.v) {
                    this.v = true;
                    oVar.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e10) {
                if (z10) {
                    if (str2 == null) {
                        try {
                            d = e(byteBuffer, bufferInfo);
                        } catch (Exception unused) {
                            d = d(byteBuffer, bufferInfo);
                        }
                        str2 = d;
                    }
                } else {
                    str2 = d(byteBuffer, bufferInfo);
                }
                StringBuilder sb2 = new StringBuilder("MP4 sample write failed: track=");
                String str3 = "audio";
                if (!z10) {
                    str = "audio";
                } else {
                    str = "video";
                }
                oVar.a(p5.c.m(str, ", ", str2, sb2), e10);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z10) {
                    str3 = "video";
                }
                throw new IOException(p5.c.m(str3, " MP4 sample: ", str2, sb3), e10);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.f62407i;
        if (z10) {
            i7 = this.f62410l;
        } else {
            i7 = this.f62411m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i7, byteBuffer2, bufferInfo2, false);
        if (z10) {
            this.f62413o++;
        } else {
            this.f62414p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
