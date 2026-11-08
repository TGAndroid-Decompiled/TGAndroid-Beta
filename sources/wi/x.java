package wi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import bi.h4;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.ui.Cells.f1;
public final class x {
    public final File f58239a;
    public final int f58240b;
    public final boolean f58241c;
    public final o d;
    public final org.telegram.ui.web.a0 f58242e;
    public MP4Builder f58245i;
    public MediaFormat f58246j;
    public MediaFormat f58247k;
    public long f58250n;
    public long f58251o;
    public long f58252p;
    public long f58254r;
    public int f58255s;
    public ByteBuffer f58256t;
    public boolean v;
    public boolean f58258w;
    public boolean f58259x;
    public final ArrayList f58243f = new ArrayList();
    public final w f58244g = new w(33333);
    public final w h = new w(21333);
    public int f58248l = -1;
    public int f58249m = -1;
    public long f58253q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f58257u = new MediaCodec.BufferInfo();

    public x(File file, int i7, boolean z9, o oVar, org.telegram.ui.web.a0 a0Var) {
        this.f58239a = file;
        this.f58240b = i7;
        this.f58241c = z9;
        this.d = oVar;
        this.f58242e = a0Var;
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

    public final MediaCodec.BufferInfo b(boolean z9, MediaCodec.BufferInfo bufferInfo, long j3) {
        w wVar;
        long max;
        w wVar2 = this.h;
        w wVar3 = this.f58244g;
        if (z9) {
            wVar = wVar3;
        } else {
            wVar = wVar2;
        }
        if (j3 < 0) {
            max = Math.max(0L, j3 + bufferInfo.presentationTimeUs);
        } else {
            if (this.f58253q != j3) {
                this.f58253q = j3;
                this.f58254r = Math.max(j3, Math.max(wVar3.a(), wVar2.a()));
                wVar3.f58236a = Long.MIN_VALUE;
                wVar3.f58237b = Long.MIN_VALUE;
                wVar2.f58236a = Long.MIN_VALUE;
                wVar2.f58237b = Long.MIN_VALUE;
            }
            if (wVar.f58236a == Long.MIN_VALUE) {
                wVar.f58236a = bufferInfo.presentationTimeUs;
            }
            max = this.f58254r + Math.max(0L, bufferInfo.presentationTimeUs - wVar.f58236a);
        }
        long j10 = bufferInfo.presentationTimeUs;
        long j11 = wVar.f58237b;
        if (j11 != Long.MIN_VALUE) {
            long j12 = j10 - j11;
            if (j12 > 0 && j12 < 1000000) {
                wVar.d = j12;
            }
        }
        wVar.f58237b = j10;
        wVar.f58238c = Math.max(wVar.f58238c, max);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, max, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.f58245i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f58245i.finishMovie(file);
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
        if (this.f58259x) {
            return;
        }
        if (this.f58245i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f58245i.finishMovie();
                this.f58259x = true;
                l(this.f58239a.length());
                o oVar = this.d;
                oVar.b("MP4 finalized: file=" + this.f58239a.getName() + ", size=" + this.f58239a.length() + ", videoSamples=" + this.f58251o + ", audioSamples=" + this.f58252p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
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
            a10 = this.f58244g.a();
            if (this.f58241c) {
                a10 = Math.max(a10, this.h.a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a10 / 1000;
    }

    public final synchronized int i() {
        return this.f58255s;
    }

    public final void j() {
        ArrayList arrayList = this.f58243f;
        if (this.f58246j != null) {
            boolean z9 = this.f58241c;
            if (!z9 || this.f58247k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f58239a;
                mp4Movie.setCacheFile(file);
                int i7 = this.f58240b;
                mp4Movie.setSize(i7, i7);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f58245i = createMovie;
                    this.f58248l = createMovie.addTrack(this.f58246j, false);
                    if (z9) {
                        this.f58249m = this.f58245i.addTrack(this.f58247k, true);
                    }
                    o oVar = this.d;
                    oVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i7 + "x" + i7 + ", includeAudio=" + z9 + ", pendingSamples=" + arrayList.size());
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        v vVar = (v) arrayList.get(i10);
                        r(vVar.f58221a, vVar.f58222b, vVar.f58223c);
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
            ByteBuffer byteBuffer2 = this.f58256t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i13) {
                this.f58256t = ByteBuffer.allocateDirect(i13);
            }
            this.f58256t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f58256t.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f58256t.flip();
                this.f58257u.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
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
            ByteBuffer byteBuffer3 = this.f58256t;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i16) {
                this.f58256t = ByteBuffer.allocateDirect(i16);
            }
            this.f58256t.clear();
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
                        this.f58256t.putInt(i7 - o10);
                        byteBuffer.position(o10);
                        byteBuffer.limit(i7);
                        this.f58256t.put(byteBuffer);
                    }
                    f10 = f11;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.f58256t.flip();
            this.f58257u.set(0, this.f58256t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        throw new IOException("Annex-B video sample contains no NAL units");
    }

    public final void l(long j3) {
        if (j3 > this.f58250n) {
            this.f58250n = j3;
            if (this.f58258w) {
                return;
            }
            org.telegram.ui.web.a0 a0Var = this.f58242e;
            t0 t0Var = (t0) a0Var.f51086b;
            p0 p0Var = (p0) a0Var.f51087c;
            synchronized (t0Var.f58199g) {
                try {
                    long j10 = p0Var.f58127c;
                    long j11 = j3 - j10;
                    if (j11 > 0 && !p0Var.d) {
                        p0Var.f58127c = j3;
                        t0Var.f58202k.execute(new h4(t0Var, p0Var, j10, j11, 8));
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void n(MediaFormat mediaFormat, boolean z9) {
        MediaFormat mediaFormat2;
        String str;
        try {
            if (this.f58259x) {
                return;
            }
            if (this.f58245i != null) {
                if (z9) {
                    mediaFormat2 = this.f58246j;
                } else {
                    mediaFormat2 = this.f58247k;
                }
                if ((z9 && !m(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z9 && this.f58241c && !m(mediaFormat2, mediaFormat, "csd-0"))) {
                    StringBuilder sb2 = new StringBuilder();
                    if (z9) {
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
            if (z9) {
                this.f58246j = mediaFormat;
            } else if (this.f58241c) {
                this.f58247k = mediaFormat;
            }
            j();
        } finally {
        }
    }

    public final synchronized void q(boolean z9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f58259x) {
                if (!z9) {
                    if (this.f58241c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z9, bufferInfo, j3);
                    if (this.f58245i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        b10.offset = 0;
                        this.f58243f.add(new v(z9, allocateDirect, b10));
                        return;
                    }
                    r(z9, byteBuffer, b10);
                }
            }
        } finally {
        }
    }

    public final void r(boolean z9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String str;
        String d;
        int i7;
        o oVar = this.d;
        String str2 = null;
        if (z9) {
            try {
                if (!this.v) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.f58256t;
                bufferInfo2 = this.f58257u;
                if (!this.v) {
                    this.v = true;
                    oVar.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e10) {
                if (z9) {
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
                if (!z9) {
                    str = "audio";
                } else {
                    str = "video";
                }
                oVar.a(f1.n(str, ", ", str2, sb2), e10);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z9) {
                    str3 = "video";
                }
                throw new IOException(f1.n(str3, " MP4 sample: ", str2, sb3), e10);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.f58245i;
        if (z9) {
            i7 = this.f58248l;
        } else {
            i7 = this.f58249m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i7, byteBuffer2, bufferInfo2, false);
        if (z9) {
            this.f58251o++;
        } else {
            this.f58252p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
