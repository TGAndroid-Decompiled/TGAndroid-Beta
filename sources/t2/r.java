package t2;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import g2.k0;
import g9.g2;
import g9.t0;
import g9.z1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k2.l0;
import m2.w0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.hc1;
public abstract class r extends k2.b {
    public static final byte[] Z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public final Context J;
    public long J0;
    public final k K;
    public boolean K0;
    public final i L;
    public boolean L0;
    public final float M;
    public boolean M0;
    public final j2.h N;
    public boolean N0;
    public final j2.h O;
    public k2.l O0;
    public final j2.h P;
    public k2.d P0;
    public final g Q;
    public q Q0;
    public final MediaCodec.BufferInfo R;
    public long R0;
    public final ArrayDeque S;
    public boolean S0;
    public final w0 T;
    public boolean T0;
    public final AtomicInteger U;
    public boolean U0;
    public d2.v V;
    public long V0;
    public d2.v W;
    public k2.c W0;
    public p2.g X;
    public k2.c X0;
    public p2.g Y;
    public t0 Y0;
    public l0 Z;
    public MediaCrypto f54871a0;
    public final long f54872b0;
    public float f54873c0;
    public float f54874d0;
    public l f54875e0;
    public d2.v f54876f0;
    public MediaFormat f54877g0;
    public boolean f54878h0;
    public float f54879i0;
    public ArrayDeque f54880j0;
    public p f54881k0;
    public o f54882l0;
    public int m0;
    public boolean f54883n0;
    public boolean f54884o0;
    public boolean f54885p0;
    public boolean f54886q0;
    public boolean f54887r0;
    public long f54888s0;
    public boolean f54889t0;
    public long f54890u0;
    public int f54891v0;
    public int f54892w0;
    public ByteBuffer f54893x0;
    public boolean f54894y0;
    public boolean f54895z0;

    public r(Context context, int i3, k kVar, float f10) {
        super(i3);
        i iVar = i.f54847b;
        this.J = context.getApplicationContext();
        this.K = kVar;
        this.L = iVar;
        this.M = f10;
        this.U = new AtomicInteger();
        this.N = new j2.h(0, 0);
        this.O = new j2.h(0, 0);
        this.P = new j2.h(2, 0);
        ?? hVar = new j2.h(2, 0);
        hVar.f54844w = 32;
        this.Q = hVar;
        this.R = new MediaCodec.BufferInfo();
        this.f54873c0 = 1.0f;
        this.f54874d0 = 1.0f;
        this.f54872b0 = -9223372036854775807L;
        this.S = new ArrayDeque();
        this.Q0 = q.f54865g;
        hVar.b(0);
        hVar.f16157c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f19029a = e2.m.f9358a;
        obj.f19031c = 0;
        obj.f19030b = 2;
        this.T = obj;
        this.f54879i0 = -1.0f;
        this.m0 = 0;
        this.D0 = 0;
        this.f54891v0 = -1;
        this.f54892w0 = -1;
        this.f54890u0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.f54888s0 = -9223372036854775807L;
        this.E0 = 0;
        this.F0 = 0;
        this.P0 = new Object();
        this.U0 = false;
        this.V0 = 0L;
        int i10 = t0.f12149c;
        this.Y0 = z1.f12178s;
        k2.c cVar = k2.c.f16457b;
        this.W0 = cVar;
        this.X0 = cVar;
    }

    @Override
    public void A(float f10, float f11) {
        this.f54873c0 = f10;
        this.f54874d0 = f11;
        A0(this.f54876f0);
    }

    public final boolean A0(d2.v vVar) {
        if (this.f54875e0 != null && this.F0 != 3 && this.f16448n != 0) {
            float f10 = this.f54874d0;
            vVar.getClass();
            d2.v[] vVarArr = this.f16450s;
            vVarArr.getClass();
            float P = P(f10, vVar, vVarArr);
            float f11 = this.f54879i0;
            if (f11 != P) {
                if (P == -1.0f) {
                    if (this.G0) {
                        this.E0 = 1;
                        this.F0 = 3;
                        return false;
                    }
                    n0();
                    X();
                    return false;
                } else if (f11 != -1.0f || P > this.M) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", P);
                    l lVar = this.f54875e0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.f54879i0 = P;
                }
            }
        }
        return true;
    }

    public final void B0() {
        p2.g gVar = this.Y;
        gVar.getClass();
        j2.b h = gVar.h();
        if (h instanceof p2.r) {
            try {
                MediaCrypto mediaCrypto = this.f54871a0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((p2.r) h).f53126b);
            } catch (MediaCryptoException e10) {
                throw e(e10, this.V, false, 6006);
            }
        }
        s0(this.Y);
        this.E0 = 0;
        this.F0 = 0;
    }

    @Override
    public final int C(d2.v vVar) {
        try {
            return z0(this.L, vVar);
        } catch (t e10) {
            throw e(e10, vVar, false, 4002);
        }
    }

    public final void C0(long j10) {
        d2.v vVar = (d2.v) this.Q0.d.j(j10);
        if (vVar == null && this.S0 && this.f54877g0 != null) {
            vVar = (d2.v) this.Q0.d.i();
        }
        if (vVar != null) {
            this.W = vVar;
        } else if (!this.f54878h0 || this.W == null) {
            return;
        }
        d2.v vVar2 = this.W;
        vVar2.getClass();
        f0(vVar2, this.f54877g0);
        this.f54878h0 = false;
        this.S0 = false;
    }

    @Override
    public final int D() {
        return 8;
    }

    public final void F(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.W0.f16458a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    public final boolean G(long r25, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: t2.r.G(long, long):boolean");
    }

    public abstract k2.e H(o oVar, d2.v vVar, d2.v vVar2, boolean z10);

    public n I(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean J() {
        if (this.G0) {
            this.E0 = 1;
            if (this.f54884o0) {
                this.F0 = 3;
                return false;
            }
            this.F0 = 2;
            return true;
        }
        B0();
        return true;
    }

    public final boolean K(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12;
        l lVar = this.f54875e0;
        lVar.getClass();
        int i3 = this.f54892w0;
        MediaCodec.BufferInfo bufferInfo = this.R;
        if (i3 < 0) {
            int i10 = lVar.i(bufferInfo);
            if (i10 < 0) {
                if (i10 == -2) {
                    this.I0 = true;
                    l lVar2 = this.f54875e0;
                    lVar2.getClass();
                    MediaFormat outputFormat = lVar2.getOutputFormat();
                    if (this.m0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f54886q0 = true;
                        return true;
                    }
                    if (Build.VERSION.SDK_INT >= 29 && !this.Y0.isEmpty()) {
                        k2.c cVar = new k2.c(k2.c.a(outputFormat, this.Y0).f18172a);
                        if (!cVar.equals(this.X0)) {
                            this.X0 = cVar;
                            c0(cVar);
                        }
                    }
                    this.f54877g0 = outputFormat;
                    this.f54878h0 = true;
                    return true;
                }
                if (this.f54887r0 && (this.K0 || this.E0 == 2)) {
                    k0();
                }
                long j12 = this.f54888s0;
                if (j12 != -9223372036854775807L) {
                    this.h.getClass();
                    if (j12 + 100 < System.currentTimeMillis()) {
                        k0();
                        return false;
                    }
                }
                return false;
            }
            bufferInfo.presentationTimeUs -= this.V0;
            if (this.f54886q0) {
                this.f54886q0 = false;
                lVar.c(i10);
                return true;
            } else if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            } else {
                this.f54892w0 = i10;
                ByteBuffer outputBuffer = lVar.getOutputBuffer(i10);
                this.f54893x0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo.offset);
                    this.f54893x0.limit(bufferInfo.offset + bufferInfo.size);
                }
                C0(bufferInfo.presentationTimeUs);
            }
        }
        if (!this.U0 && bufferInfo.presentationTimeUs >= this.f16452x) {
            z10 = false;
        } else {
            z10 = true;
        }
        long j13 = this.Q0.f54870f;
        if (j13 != -9223372036854775807L && j13 <= bufferInfo.presentationTimeUs) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f54894y0 = z11;
        ByteBuffer byteBuffer = this.f54893x0;
        int i11 = this.f54892w0;
        int i12 = bufferInfo.flags;
        long j14 = bufferInfo.presentationTimeUs;
        d2.v vVar = this.W;
        vVar.getClass();
        if (!l0(j10, j11, lVar, byteBuffer, i11, i12, 1, j14, z10, z11, vVar)) {
            return false;
        }
        h0(bufferInfo.presentationTimeUs);
        if ((bufferInfo.flags & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && this.H0 && this.f54894y0) {
            this.h.getClass();
            this.f54888s0 = System.currentTimeMillis();
        }
        this.f54892w0 = -1;
        this.f54893x0 = null;
        if (!z12) {
            return true;
        }
        k0();
        return false;
    }

    public final boolean L() {
        l lVar = this.f54875e0;
        if (lVar != null && this.E0 != 2 && !this.K0) {
            int i3 = this.f54891v0;
            j2.h hVar = this.O;
            if (i3 < 0) {
                int f10 = lVar.f();
                this.f54891v0 = f10;
                if (f10 >= 0) {
                    hVar.f16157c = lVar.getInputBuffer(f10);
                    hVar.clear();
                }
            }
            if (this.E0 == 1) {
                if (!this.f54887r0) {
                    this.H0 = true;
                    lVar.b(this.f54891v0, 0, 4, 0L);
                    this.f54891v0 = -1;
                    hVar.f16157c = null;
                }
                this.E0 = 2;
                return false;
            } else if (this.f54885p0) {
                this.f54885p0 = false;
                ByteBuffer byteBuffer = hVar.f16157c;
                byteBuffer.getClass();
                byteBuffer.put(Z0);
                lVar.b(this.f54891v0, 38, 0, 0L);
                this.f54891v0 = -1;
                hVar.f16157c = null;
                this.G0 = true;
                return true;
            } else {
                if (this.D0 == 1) {
                    int i10 = 0;
                    while (true) {
                        d2.v vVar = this.f54876f0;
                        vVar.getClass();
                        if (i10 >= vVar.v.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = hVar.f16157c;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.f54876f0.v.get(i10));
                        i10++;
                    }
                    this.D0 = 2;
                }
                ByteBuffer byteBuffer3 = hVar.f16157c;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                tf.b bVar = this.f16445c;
                bVar.q();
                try {
                    lVar.g(new hc1(24, this, bVar));
                    int i11 = this.U.get();
                    if (i11 == -3) {
                        if (k()) {
                            S().f54870f = this.J0;
                            return false;
                        }
                    } else if (i11 == -5) {
                        if (this.D0 == 2) {
                            hVar.clear();
                            this.D0 = 1;
                        }
                        e0(bVar);
                        return true;
                    } else if (hVar.isEndOfStream()) {
                        S().f54870f = this.J0;
                        if (this.D0 == 2) {
                            hVar.clear();
                            this.D0 = 1;
                        }
                        this.K0 = true;
                        if (!this.G0) {
                            k0();
                            return false;
                        } else if (!this.f54887r0) {
                            this.H0 = true;
                            lVar.b(this.f54891v0, 0, 4, 0L);
                            this.f54891v0 = -1;
                            hVar.f16157c = null;
                            return false;
                        }
                    } else {
                        if (!this.G0 && !hVar.isKeyFrame()) {
                            hVar.clear();
                            if (this.D0 == 2) {
                                this.D0 = 1;
                                return true;
                            }
                        } else {
                            long j10 = hVar.f16158e;
                            if (!u0(hVar)) {
                                boolean flag = hVar.getFlag(1073741824);
                                if (flag) {
                                    j2.d dVar = hVar.f16156b;
                                    if (position == 0) {
                                        dVar.getClass();
                                    } else {
                                        if (dVar.d == null) {
                                            int[] iArr = new int[1];
                                            dVar.d = iArr;
                                            dVar.f16153i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = dVar.d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.M0) {
                                    q S = S();
                                    k0 k0Var = S.d;
                                    d2.v vVar2 = this.V;
                                    vVar2.getClass();
                                    k0Var.a(vVar2, j10);
                                    S.f54869e = true;
                                    this.M0 = false;
                                }
                                this.J0 = Math.max(this.J0, j10);
                                if (k() || hVar.isLastSample()) {
                                    S().f54870f = this.J0;
                                }
                                hVar.c();
                                if (hVar.hasSupplementalData()) {
                                    U(hVar);
                                }
                                if (this.U0) {
                                    long j11 = this.J0;
                                    if (j10 <= j11) {
                                        this.V0 = (j11 - j10) + 1 + this.V0;
                                    }
                                    this.J0 = j10;
                                    this.U0 = false;
                                }
                                j0(hVar);
                                int O = O(hVar);
                                long j12 = j10 + this.V0;
                                if (flag) {
                                    lVar.a(this.f54891v0, hVar.f16156b, j12, O);
                                } else {
                                    int i12 = this.f54891v0;
                                    ByteBuffer byteBuffer4 = hVar.f16157c;
                                    byteBuffer4.getClass();
                                    lVar.b(i12, byteBuffer4.limit(), O, j12);
                                }
                                this.f54891v0 = -1;
                                hVar.f16157c = null;
                                this.G0 = true;
                                this.D0 = 0;
                                this.P0.f16465c++;
                                return true;
                            }
                        }
                        return true;
                    }
                } catch (j2.g e10) {
                    a0(e10);
                    m0(0);
                    M();
                    return true;
                }
            }
        }
        return false;
    }

    public final void M() {
        try {
            l lVar = this.f54875e0;
            lVar.getClass();
            lVar.flush();
        } finally {
            q0();
        }
    }

    public final List N(boolean z10) {
        d2.v vVar = this.V;
        vVar.getClass();
        i iVar = this.L;
        ArrayList Q = Q(iVar, vVar, z10);
        if (Q.isEmpty() && z10) {
            ArrayList Q2 = Q(iVar, vVar, false);
            if (!Q2.isEmpty()) {
                g2.a.l("MediaCodecRenderer", "Drm session requires secure decoder for " + vVar.f8489s + ", but no secure decoder available. Trying to proceed with " + Q2 + ".");
            }
            return Q2;
        }
        return Q;
    }

    public int O(j2.h hVar) {
        return 0;
    }

    public abstract float P(float f10, d2.v vVar, d2.v[] vVarArr);

    public abstract ArrayList Q(i iVar, d2.v vVar, boolean z10);

    public long R(long j10, long j11, boolean z10) {
        return super.h(j10, j11);
    }

    public final q S() {
        ArrayDeque arrayDeque = this.S;
        if (!arrayDeque.isEmpty()) {
            return (q) arrayDeque.getLast();
        }
        return this.Q0;
    }

    public abstract l2.e T(o oVar, d2.v vVar, MediaCrypto mediaCrypto, float f10);

    public abstract void U(j2.h hVar);

    public final void V(t2.o r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: t2.r.V(t2.o, android.media.MediaCrypto):void");
    }

    public final boolean W(long j10, long j11) {
        if (j11 < j10) {
            d2.v vVar = this.W;
            if (vVar == null || !Objects.equals(vVar.f8489s, "audio/opus") || j10 - j11 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: t2.r.X():void");
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z10) {
        String str;
        d2.v vVar = this.V;
        vVar.getClass();
        if (this.f54880j0 == null) {
            try {
                List N = N(z10);
                this.f54880j0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) N;
                if (!arrayList.isEmpty()) {
                    this.f54880j0.add((o) arrayList.get(0));
                }
                this.f54881k0 = null;
            } catch (t e10) {
                throw new p(vVar, e10, z10, -49998);
            }
        }
        if (!this.f54880j0.isEmpty()) {
            ArrayDeque arrayDeque = this.f54880j0;
            arrayDeque.getClass();
            while (this.f54875e0 == null) {
                o oVar = (o) arrayDeque.peekFirst();
                oVar.getClass();
                if (!Z(vVar) || !w0(oVar)) {
                    return;
                }
                try {
                    V(oVar, mediaCrypto);
                } catch (Exception e11) {
                    g2.a.m("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e11);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + oVar.f54852a + ", " + vVar;
                    String str3 = vVar.f8489s;
                    if (e11 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e11).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    p pVar = new p(str2, e11, str3, z10, oVar, str);
                    a0(pVar);
                    p pVar2 = this.f54881k0;
                    if (pVar2 == null) {
                        this.f54881k0 = pVar;
                    } else {
                        this.f54881k0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f54862a, pVar2.f54863b, pVar2.f54864c, pVar2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f54881k0;
                    }
                }
            }
            this.f54880j0 = null;
            return;
        }
        throw new p(vVar, null, z10, -49999);
    }

    public boolean Z(d2.v vVar) {
        return true;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j10, String str, long j11);

    public abstract void c0(k2.c cVar);

    @Override
    public void d(int i3, Object obj) {
        int i10;
        if (i3 != 11) {
            if (i3 != 21) {
                if (i3 == 22 && (i10 = Build.VERSION.SDK_INT) >= 29) {
                    obj.getClass();
                    t0 t0Var = (t0) obj;
                    if (!this.Y0.equals(t0Var)) {
                        if (i10 >= 31) {
                            HashSet hashSet = new HashSet(t0Var);
                            HashSet hashSet2 = new HashSet();
                            g2 it = this.Y0.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (!hashSet.remove(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            l lVar = this.f54875e0;
                            if (lVar != null) {
                                if (!hashSet2.isEmpty()) {
                                    lVar.n(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    lVar.m(new ArrayList(hashSet));
                                }
                            }
                        }
                        this.Y0 = t0Var;
                        return;
                    }
                    return;
                }
                return;
            } else if (Build.VERSION.SDK_INT >= 29) {
                obj.getClass();
                k2.c cVar = (k2.c) obj;
                this.W0 = cVar;
                l lVar2 = this.f54875e0;
                if (lVar2 != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : cVar.f16458a.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            if (value instanceof Integer) {
                                bundle.putInt(str2, ((Integer) value).intValue());
                            } else if (value instanceof Long) {
                                bundle.putLong(str2, ((Long) value).longValue());
                            } else if (value instanceof Float) {
                                bundle.putFloat(str2, ((Float) value).floatValue());
                            } else if (value instanceof String) {
                                bundle.putString(str2, (String) value);
                            } else if (value instanceof ByteBuffer) {
                                ByteBuffer byteBuffer = (ByteBuffer) value;
                                byte[] bArr = new byte[byteBuffer.remaining()];
                                byteBuffer.duplicate().get(bArr);
                                bundle.putByteArray(str2, bArr);
                            }
                        }
                    }
                    lVar2.setParameters(bundle);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        l0 l0Var = (l0) obj;
        l0Var.getClass();
        this.Z = l0Var;
    }

    public abstract void d0(String str);

    public k2.e e0(tf.b r15) {
        throw new UnsupportedOperationException("Method not decompiled: t2.r.e0(tf.b):k2.e");
    }

    public abstract void f0(d2.v vVar, MediaFormat mediaFormat);

    @Override
    public final long h(long j10, long j11) {
        return R(j10, j11, this.f54889t0);
    }

    public void h0(long j10) {
        this.R0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.S;
            if (!arrayDeque.isEmpty() && j10 >= ((q) arrayDeque.peek()).f54866a) {
                q qVar = (q) arrayDeque.poll();
                qVar.getClass();
                t0(qVar);
                i0();
            } else {
                return;
            }
        }
    }

    public abstract void i0();

    public final void k0() {
        int i3 = this.F0;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    this.L0 = true;
                    o0();
                    return;
                }
                n0();
                X();
                return;
            }
            M();
            B0();
            return;
        }
        M();
    }

    public abstract boolean l0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j12, boolean z10, boolean z11, d2.v vVar);

    public final boolean m0(int i3) {
        tf.b bVar = this.f16445c;
        bVar.q();
        j2.h hVar = this.N;
        hVar.clear();
        int w10 = w(bVar, hVar, i3 | 4);
        if (w10 == -5) {
            e0(bVar);
            return true;
        } else if (w10 == -4 && hVar.isEndOfStream()) {
            this.K0 = true;
            k0();
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void n() {
        this.V = null;
        t0(q.f54865g);
        this.S.clear();
        if (this.f54895z0) {
            this.f54895z0 = false;
            p0();
        } else if (this.f54875e0 == null) {
        } else {
            if (x0()) {
                n0();
            } else if (v0()) {
                M();
            } else {
                this.U0 = true;
            }
        }
    }

    public final void n0() {
        try {
            l lVar = this.f54875e0;
            if (lVar != null) {
                lVar.release();
                this.P0.f16464b++;
                o oVar = this.f54882l0;
                oVar.getClass();
                d0(oVar.f54852a);
            }
            this.f54875e0 = null;
            try {
                MediaCrypto mediaCrypto = this.f54871a0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f54875e0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f54871a0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public abstract void o0();

    @Override
    public void p(long j10, boolean z10, boolean z11) {
        ArrayDeque arrayDeque = this.S;
        if (!arrayDeque.isEmpty()) {
            this.Q0 = (q) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (!z11) {
            return;
        }
        this.K0 = false;
        this.L0 = false;
        this.N0 = false;
        if (this.f54895z0) {
            p0();
        } else if (this.f54875e0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.U0 = true;
            }
        }
        if (this.Q0.d.p() > 0) {
            this.M0 = true;
        }
        this.Q0.d.c();
        this.Q0.f54869e = false;
    }

    public final void p0() {
        this.J0 = -9223372036854775807L;
        S().f54870f = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.B0 = false;
        this.Q.clear();
        this.P.clear();
        this.A0 = false;
        w0 w0Var = this.T;
        w0Var.getClass();
        w0Var.f19029a = e2.m.f9358a;
        w0Var.f19031c = 0;
        w0Var.f19030b = 2;
    }

    public void q0() {
        this.f54891v0 = -1;
        this.O.f16157c = null;
        this.f54892w0 = -1;
        this.f54893x0 = null;
        this.J0 = -9223372036854775807L;
        S().f54870f = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.f54890u0 = -9223372036854775807L;
        this.H0 = false;
        this.f54888s0 = -9223372036854775807L;
        this.G0 = false;
        this.f54885p0 = false;
        this.f54886q0 = false;
        this.f54894y0 = false;
        this.E0 = 0;
        this.F0 = 0;
        this.D0 = this.C0 ? 1 : 0;
        this.U0 = false;
        this.V0 = 0L;
    }

    public final void r0() {
        q0();
        this.O0 = null;
        this.f54880j0 = null;
        this.f54882l0 = null;
        this.f54876f0 = null;
        this.f54877g0 = null;
        this.f54878h0 = false;
        this.I0 = false;
        this.f54879i0 = -1.0f;
        this.m0 = 0;
        this.f54883n0 = false;
        this.f54884o0 = false;
        this.f54887r0 = false;
        this.f54889t0 = false;
        this.C0 = false;
        this.D0 = 0;
    }

    public final void s0(p2.g gVar) {
        f1.E(this.X, gVar);
        this.X = gVar;
    }

    public final void t0(q qVar) {
        this.Q0 = qVar;
        if (qVar.f54868c != -9223372036854775807L) {
            this.S0 = true;
            g0();
        }
    }

    @Override
    public void u(d2.v[] r12, long r13, long r15, w2.g0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: t2.r.u(d2.v[], long, long, w2.g0):void");
    }

    public boolean u0(j2.h hVar) {
        return false;
    }

    public boolean v0() {
        return true;
    }

    public boolean w0(o oVar) {
        return true;
    }

    @Override
    public void x(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: t2.r.x(long, long):void");
    }

    public boolean x0() {
        int i3 = this.F0;
        if (i3 == 3 || ((this.f54883n0 && !this.I0) || (this.f54884o0 && this.H0))) {
            return true;
        }
        if (i3 == 2) {
            try {
                B0();
                return false;
            } catch (k2.l e10) {
                g2.a.m("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                return true;
            }
        }
        return false;
    }

    public boolean y0(d2.v vVar) {
        return false;
    }

    public abstract int z0(i iVar, d2.v vVar);

    public void g0() {
    }

    public void j0(j2.h hVar) {
    }
}
