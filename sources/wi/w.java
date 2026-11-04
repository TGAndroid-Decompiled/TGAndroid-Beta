package wi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.na1;
public final class w {
    public final File f58099a;
    public final int f58100b;
    public final boolean f58101c;
    public final n d;
    public final na1 f58102e;
    public MP4Builder f58105i;
    public MediaFormat f58106j;
    public MediaFormat f58107k;
    public long f58110n;
    public long f58111o;
    public long f58112p;
    public long f58114r;
    public int f58115s;
    public ByteBuffer f58116t;
    public boolean v;
    public boolean f58118w;
    public boolean f58119x;
    public final ArrayList f58103f = new ArrayList();
    public final v f58104g = new v(33333);
    public final v h = new v(21333);
    public int f58108l = -1;
    public int f58109m = -1;
    public long f58113q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f58117u = new MediaCodec.BufferInfo();

    public w(File file, int i3, boolean z10, n nVar, na1 na1Var) {
        this.f58099a = file;
        this.f58100b = i3;
        this.f58101c = z10;
        this.d = nVar;
        this.f58102e = na1Var;
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
        int i3;
        int i10;
        String str;
        p(byteBuffer, bufferInfo);
        int i11 = bufferInfo.offset;
        int i12 = bufferInfo.size + i11;
        int f10 = f(byteBuffer, i11, i12);
        if (f10 == bufferInfo.offset) {
            i3 = o(byteBuffer, f10, i12);
            i10 = 0;
            while (f10 >= 0) {
                i10++;
                f10 = f(byteBuffer, o(byteBuffer, f10, i12) + f10, i12);
            }
        } else {
            i3 = 0;
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
        sb2.append(i3);
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

    public static int f(ByteBuffer byteBuffer, int i3, int i10) {
        int i11;
        while (true) {
            int i12 = i3 + 2;
            if (i12 < i10) {
                if (byteBuffer.get(i3) != 0 || byteBuffer.get(i3 + 1) != 0 || (byteBuffer.get(i12) != 1 && ((i11 = i3 + 3) >= i10 || byteBuffer.get(i12) != 0 || byteBuffer.get(i11) != 1))) {
                    i3++;
                }
            } else {
                return -1;
            }
        }
        return i3;
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
                        for (int i3 = 0; i3 < limit; i3++) {
                            if (byteBuffer.get(a10 + i3) == byteBuffer2.get(a11 + i3)) {
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

    public static int o(ByteBuffer byteBuffer, int i3, int i10) {
        if (i3 + 3 < i10 && byteBuffer.get(i3 + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public static void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i3 = bufferInfo.offset;
        int i10 = bufferInfo.size;
        long j10 = i3 + i10;
        if (i3 >= 0 && i10 >= 0 && j10 <= byteBuffer.limit()) {
            return;
        }
        throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
    }

    public final MediaCodec.BufferInfo b(boolean z10, MediaCodec.BufferInfo bufferInfo, long j10) {
        v vVar;
        long max;
        v vVar2 = this.h;
        v vVar3 = this.f58104g;
        if (z10) {
            vVar = vVar3;
        } else {
            vVar = vVar2;
        }
        if (j10 < 0) {
            max = Math.max(0L, j10 + bufferInfo.presentationTimeUs);
        } else {
            if (this.f58113q != j10) {
                this.f58113q = j10;
                this.f58114r = Math.max(j10, Math.max(vVar3.a(), vVar2.a()));
                vVar3.f58084a = Long.MIN_VALUE;
                vVar3.f58085b = Long.MIN_VALUE;
                vVar2.f58084a = Long.MIN_VALUE;
                vVar2.f58085b = Long.MIN_VALUE;
            }
            if (vVar.f58084a == Long.MIN_VALUE) {
                vVar.f58084a = bufferInfo.presentationTimeUs;
            }
            max = this.f58114r + Math.max(0L, bufferInfo.presentationTimeUs - vVar.f58084a);
        }
        long j11 = bufferInfo.presentationTimeUs;
        long j12 = vVar.f58085b;
        if (j12 != Long.MIN_VALUE) {
            long j13 = j11 - j12;
            if (j13 > 0 && j13 < 1000000) {
                vVar.d = j13;
            }
        }
        vVar.f58085b = j11;
        vVar.f58086c = Math.max(vVar.f58086c, max);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, max, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.f58105i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f58105i.finishMovie(file);
                n nVar = this.d;
                nVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e10) {
                throw new IOException("Unable to create preview MP4", e10);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.f58119x) {
            return;
        }
        if (this.f58105i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f58105i.finishMovie();
                this.f58119x = true;
                l(this.f58099a.length());
                n nVar = this.d;
                nVar.b("MP4 finalized: file=" + this.f58099a.getName() + ", size=" + this.f58099a.length() + ", videoSamples=" + this.f58111o + ", audioSamples=" + this.f58112p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
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
            a10 = this.f58104g.a();
            if (this.f58101c) {
                a10 = Math.max(a10, this.h.a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a10 / 1000;
    }

    public final synchronized int i() {
        return this.f58115s;
    }

    public final void j() {
        ArrayList arrayList = this.f58103f;
        if (this.f58106j != null) {
            boolean z10 = this.f58101c;
            if (!z10 || this.f58107k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f58099a;
                mp4Movie.setCacheFile(file);
                int i3 = this.f58100b;
                mp4Movie.setSize(i3, i3);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f58105i = createMovie;
                    this.f58108l = createMovie.addTrack(this.f58106j, false);
                    if (z10) {
                        this.f58109m = this.f58105i.addTrack(this.f58107k, true);
                    }
                    n nVar = this.d;
                    nVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i3 + "x" + i3 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        u uVar = (u) arrayList.get(i10);
                        r(uVar.f58077a, uVar.f58078b, uVar.f58079c);
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
        int i3;
        int i10;
        p(byteBuffer, bufferInfo);
        int i11 = bufferInfo.offset;
        int i12 = bufferInfo.size + i11;
        int f10 = f(byteBuffer, i11, i12);
        if (f10 != bufferInfo.offset) {
            int i13 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.f58116t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i13) {
                this.f58116t = ByteBuffer.allocateDirect(i13);
            }
            this.f58116t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f58116t.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f58116t.flip();
                this.f58117u.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i14 = 0;
        int i15 = f10;
        int i16 = 0;
        while (i15 >= 0) {
            int o10 = o(byteBuffer, i15, i12) + i15;
            i15 = f(byteBuffer, o10, i12);
            if (i15 < 0) {
                i10 = i12;
            } else {
                i10 = i15;
            }
            if (i10 > o10) {
                i14++;
                i16 = ((i10 + 4) - o10) + i16;
            }
        }
        if (i14 != 0) {
            ByteBuffer byteBuffer3 = this.f58116t;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i16) {
                this.f58116t = ByteBuffer.allocateDirect(i16);
            }
            this.f58116t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            while (f10 >= 0) {
                try {
                    int o11 = f10 + o(byteBuffer, f10, i12);
                    int f11 = f(byteBuffer, o11, i12);
                    if (f11 < 0) {
                        i3 = i12;
                    } else {
                        i3 = f11;
                    }
                    if (i3 > o11) {
                        this.f58116t.putInt(i3 - o11);
                        byteBuffer.position(o11);
                        byteBuffer.limit(i3);
                        this.f58116t.put(byteBuffer);
                    }
                    f10 = f11;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.f58116t.flip();
            this.f58117u.set(0, this.f58116t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        throw new IOException("Annex-B video sample contains no NAL units");
    }

    public final void l(long j10) {
        if (j10 > this.f58110n) {
            this.f58110n = j10;
            if (this.f58118w) {
                return;
            }
            na1 na1Var = this.f58102e;
            t0 t0Var = (t0) na1Var.f47927b;
            p0 p0Var = (p0) na1Var.f47928c;
            synchronized (t0Var.f58059g) {
                try {
                    long j11 = p0Var.f57994c;
                    long j12 = j10 - j11;
                    if (j12 > 0 && !p0Var.d) {
                        p0Var.f57994c = j10;
                        t0Var.f58062k.execute(new c3.f0(t0Var, p0Var, j11, j12, 8));
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
            if (this.f58119x) {
                return;
            }
            if (this.f58105i != null) {
                if (z10) {
                    mediaFormat2 = this.f58106j;
                } else {
                    mediaFormat2 = this.f58107k;
                }
                if ((z10 && !m(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f58101c && !m(mediaFormat2, mediaFormat, "csd-0"))) {
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
                this.f58106j = mediaFormat;
            } else if (this.f58101c) {
                this.f58107k = mediaFormat;
            }
            j();
        } finally {
        }
    }

    public final synchronized void q(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j10) {
        try {
            if (!this.f58119x) {
                if (!z10) {
                    if (this.f58101c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z10, bufferInfo, j10);
                    if (this.f58105i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        b10.offset = 0;
                        this.f58103f.add(new u(z10, allocateDirect, b10));
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
        int i3;
        n nVar = this.d;
        String str2 = null;
        if (z10) {
            try {
                if (!this.v) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.f58116t;
                bufferInfo2 = this.f58117u;
                if (!this.v) {
                    this.v = true;
                    nVar.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
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
                nVar.a(f1.r(str, ", ", str2, sb2), e10);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z10) {
                    str3 = "video";
                }
                throw new IOException(f1.r(str3, " MP4 sample: ", str2, sb3), e10);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.f58105i;
        if (z10) {
            i3 = this.f58108l;
        } else {
            i3 = this.f58109m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i3, byteBuffer2, bufferInfo2, false);
        if (z10) {
            this.f58111o++;
        } else {
            this.f58112p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
