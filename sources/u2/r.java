package u2;

import a8.b8;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import h2.j0;
import h9.a2;
import h9.h2;
import h9.t0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l2.l0;
import n2.u0;
import org.telegram.ui.Cells.f1;
public abstract class r extends l2.b {
    public static final byte[] Y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public final Context I;
    public long I0;
    public final k J;
    public boolean J0;
    public final i K;
    public boolean K0;
    public final float L;
    public boolean L0;
    public final k2.h M;
    public boolean M0;
    public final k2.h N;
    public l2.l N0;
    public final k2.h O;
    public l2.d O0;
    public final g P;
    public q P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final u0 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public e2.u U;
    public long U0;
    public e2.u V;
    public l2.c V0;
    public q2.g W;
    public l2.c W0;
    public q2.g X;
    public t0 X0;
    public l0 Y;
    public MediaCrypto Z;
    public final long f56165a0;
    public float f56166b0;
    public float f56167c0;
    public l f56168d0;
    public e2.u f56169e0;
    public MediaFormat f56170f0;
    public boolean f56171g0;
    public float f56172h0;
    public ArrayDeque f56173i0;
    public p f56174j0;
    public o f56175k0;
    public int f56176l0;
    public boolean m0;
    public boolean f56177n0;
    public boolean f56178o0;
    public boolean f56179p0;
    public boolean f56180q0;
    public long f56181r0;
    public boolean f56182s0;
    public long f56183t0;
    public int f56184u0;
    public int f56185v0;
    public ByteBuffer f56186w0;
    public boolean f56187x0;
    public boolean f56188y0;
    public boolean f56189z0;

    public r(Context context, int i7, k kVar, float f10) {
        super(i7);
        i iVar = i.f56141b;
        this.I = context.getApplicationContext();
        this.J = kVar;
        this.K = iVar;
        this.L = f10;
        this.T = new AtomicInteger();
        this.M = new k2.h(0, 0);
        this.N = new k2.h(0, 0);
        this.O = new k2.h(2, 0);
        ?? hVar = new k2.h(2, 0);
        hVar.f56138w = 32;
        this.P = hVar;
        this.Q = new MediaCodec.BufferInfo();
        this.f56166b0 = 1.0f;
        this.f56167c0 = 1.0f;
        this.f56165a0 = -9223372036854775807L;
        this.R = new ArrayDeque();
        this.P0 = q.f56159g;
        hVar.b(0);
        hVar.f17172c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f20317a = f2.n.f10922a;
        obj.f20319c = 0;
        obj.f20318b = 2;
        this.S = obj;
        this.f56172h0 = -1.0f;
        this.f56176l0 = 0;
        this.C0 = 0;
        this.f56184u0 = -1;
        this.f56185v0 = -1;
        this.f56183t0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f56181r0 = -9223372036854775807L;
        this.D0 = 0;
        this.E0 = 0;
        this.O0 = new Object();
        this.T0 = false;
        this.U0 = 0L;
        int i10 = t0.f14395c;
        this.X0 = a2.f14288s;
        l2.c cVar = l2.c.f17769b;
        this.V0 = cVar;
        this.W0 = cVar;
    }

    @Override
    public void A(float f10, float f11) {
        this.f56166b0 = f10;
        this.f56167c0 = f11;
        A0(this.f56169e0);
    }

    public final boolean A0(e2.u uVar) {
        if (this.f56168d0 != null && this.E0 != 3 && this.f17761n != 0) {
            float f10 = this.f56167c0;
            uVar.getClass();
            e2.u[] uVarArr = this.f17763s;
            uVarArr.getClass();
            float P = P(f10, uVar, uVarArr);
            float f11 = this.f56172h0;
            if (f11 != P) {
                if (P == -1.0f) {
                    if (this.F0) {
                        this.D0 = 1;
                        this.E0 = 3;
                        return false;
                    }
                    n0();
                    X();
                    return false;
                } else if (f11 != -1.0f || P > this.L) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", P);
                    l lVar = this.f56168d0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.f56172h0 = P;
                }
            }
        }
        return true;
    }

    public final void B0() {
        q2.g gVar = this.X;
        gVar.getClass();
        k2.b h = gVar.h();
        if (h instanceof q2.r) {
            try {
                MediaCrypto mediaCrypto = this.Z;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((q2.r) h).f53630b);
            } catch (MediaCryptoException e10) {
                throw d(e10, this.U, false, 6006);
            }
        }
        s0(this.X);
        this.D0 = 0;
        this.E0 = 0;
    }

    @Override
    public final int C(e2.u uVar) {
        try {
            return z0(this.K, uVar);
        } catch (t e10) {
            throw d(e10, uVar, false, 4002);
        }
    }

    public final void C0(long j3) {
        e2.u uVar = (e2.u) this.P0.d.j(j3);
        if (uVar == null && this.R0 && this.f56170f0 != null) {
            uVar = (e2.u) this.P0.d.i();
        }
        if (uVar != null) {
            this.V = uVar;
        } else if (!this.f56171g0 || this.V == null) {
            return;
        }
        e2.u uVar2 = this.V;
        uVar2.getClass();
        f0(uVar2, this.f56170f0);
        this.f56171g0 = false;
        this.R0 = false;
    }

    @Override
    public final int D() {
        return 8;
    }

    public final void F(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.V0.f17770a.entrySet()) {
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
        throw new UnsupportedOperationException("Method not decompiled: u2.r.G(long, long):boolean");
    }

    public abstract l2.e H(o oVar, e2.u uVar, e2.u uVar2, boolean z9);

    public n I(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean J() {
        if (this.F0) {
            this.D0 = 1;
            if (this.f56177n0) {
                this.E0 = 3;
                return false;
            }
            this.E0 = 2;
            return true;
        }
        B0();
        return true;
    }

    public final boolean K(long j3, long j10) {
        boolean z9;
        boolean z10;
        boolean z11;
        l lVar = this.f56168d0;
        lVar.getClass();
        int i7 = this.f56185v0;
        MediaCodec.BufferInfo bufferInfo = this.Q;
        if (i7 < 0) {
            int g10 = lVar.g(bufferInfo);
            if (g10 < 0) {
                if (g10 == -2) {
                    this.H0 = true;
                    l lVar2 = this.f56168d0;
                    lVar2.getClass();
                    MediaFormat outputFormat = lVar2.getOutputFormat();
                    if (this.f56176l0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f56179p0 = true;
                        return true;
                    }
                    if (Build.VERSION.SDK_INT >= 29 && !this.X0.isEmpty()) {
                        l2.c cVar = new l2.c((HashMap) l2.c.a(outputFormat, this.X0).f13889b);
                        if (!cVar.equals(this.W0)) {
                            this.W0 = cVar;
                            c0(cVar);
                        }
                    }
                    this.f56170f0 = outputFormat;
                    this.f56171g0 = true;
                    return true;
                }
                if (this.f56180q0 && (this.J0 || this.D0 == 2)) {
                    k0();
                }
                long j11 = this.f56181r0;
                if (j11 != -9223372036854775807L) {
                    this.h.getClass();
                    if (j11 + 100 < System.currentTimeMillis()) {
                        k0();
                        return false;
                    }
                }
                return false;
            }
            bufferInfo.presentationTimeUs -= this.U0;
            if (this.f56179p0) {
                this.f56179p0 = false;
                lVar.c(g10);
                return true;
            } else if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            } else {
                this.f56185v0 = g10;
                ByteBuffer outputBuffer = lVar.getOutputBuffer(g10);
                this.f56186w0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo.offset);
                    this.f56186w0.limit(bufferInfo.offset + bufferInfo.size);
                }
                C0(bufferInfo.presentationTimeUs);
            }
        }
        if (!this.T0 && bufferInfo.presentationTimeUs >= this.f17765x) {
            z9 = false;
        } else {
            z9 = true;
        }
        long j12 = this.P0.f56164f;
        if (j12 != -9223372036854775807L && j12 <= bufferInfo.presentationTimeUs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f56187x0 = z10;
        ByteBuffer byteBuffer = this.f56186w0;
        int i10 = this.f56185v0;
        int i11 = bufferInfo.flags;
        long j13 = bufferInfo.presentationTimeUs;
        e2.u uVar = this.V;
        uVar.getClass();
        if (!l0(j3, j10, lVar, byteBuffer, i10, i11, 1, j13, z9, z10, uVar)) {
            return false;
        }
        h0(bufferInfo.presentationTimeUs);
        if ((bufferInfo.flags & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && this.G0 && this.f56187x0) {
            this.h.getClass();
            this.f56181r0 = System.currentTimeMillis();
        }
        this.f56185v0 = -1;
        this.f56186w0 = null;
        if (!z11) {
            return true;
        }
        k0();
        return false;
    }

    public final boolean L() {
        l lVar = this.f56168d0;
        if (lVar != null && this.D0 != 2 && !this.J0) {
            int i7 = this.f56184u0;
            k2.h hVar = this.N;
            if (i7 < 0) {
                int f10 = lVar.f();
                this.f56184u0 = f10;
                if (f10 >= 0) {
                    hVar.f17172c = lVar.getInputBuffer(f10);
                    hVar.clear();
                }
            }
            if (this.D0 == 1) {
                if (!this.f56180q0) {
                    this.G0 = true;
                    lVar.a(this.f56184u0, 0, 4, 0L);
                    this.f56184u0 = -1;
                    hVar.f17172c = null;
                }
                this.D0 = 2;
                return false;
            } else if (this.f56178o0) {
                this.f56178o0 = false;
                ByteBuffer byteBuffer = hVar.f17172c;
                byteBuffer.getClass();
                byteBuffer.put(Y0);
                lVar.a(this.f56184u0, 38, 0, 0L);
                this.f56184u0 = -1;
                hVar.f17172c = null;
                this.F0 = true;
                return true;
            } else {
                if (this.C0 == 1) {
                    int i10 = 0;
                    while (true) {
                        e2.u uVar = this.f56169e0;
                        uVar.getClass();
                        if (i10 >= uVar.v.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = hVar.f17172c;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.f56169e0.v.get(i10));
                        i10++;
                    }
                    this.C0 = 2;
                }
                ByteBuffer byteBuffer3 = hVar.f17172c;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                wf.b bVar = this.f17758c;
                bVar.A();
                try {
                    lVar.l(new ti.p(2, this, bVar));
                    int i11 = this.T.get();
                    if (i11 == -3) {
                        if (k()) {
                            S().f56164f = this.I0;
                            return false;
                        }
                    } else if (i11 == -5) {
                        if (this.C0 == 2) {
                            hVar.clear();
                            this.C0 = 1;
                        }
                        e0(bVar);
                        return true;
                    } else if (hVar.isEndOfStream()) {
                        S().f56164f = this.I0;
                        if (this.C0 == 2) {
                            hVar.clear();
                            this.C0 = 1;
                        }
                        this.J0 = true;
                        if (!this.F0) {
                            k0();
                            return false;
                        } else if (!this.f56180q0) {
                            this.G0 = true;
                            lVar.a(this.f56184u0, 0, 4, 0L);
                            this.f56184u0 = -1;
                            hVar.f17172c = null;
                            return false;
                        }
                    } else {
                        if (!this.F0 && !hVar.isKeyFrame()) {
                            hVar.clear();
                            if (this.C0 == 2) {
                                this.C0 = 1;
                                return true;
                            }
                        } else {
                            long j3 = hVar.f17173e;
                            if (!u0(hVar)) {
                                boolean flag = hVar.getFlag(1073741824);
                                if (flag) {
                                    k2.d dVar = hVar.f17171b;
                                    if (position == 0) {
                                        dVar.getClass();
                                    } else {
                                        if (dVar.d == null) {
                                            int[] iArr = new int[1];
                                            dVar.d = iArr;
                                            dVar.f17168i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = dVar.d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.L0) {
                                    q S = S();
                                    j0 j0Var = S.d;
                                    e2.u uVar2 = this.U;
                                    uVar2.getClass();
                                    j0Var.a(uVar2, j3);
                                    S.f56163e = true;
                                    this.L0 = false;
                                }
                                this.I0 = Math.max(this.I0, j3);
                                if (k() || hVar.isLastSample()) {
                                    S().f56164f = this.I0;
                                }
                                hVar.c();
                                if (hVar.hasSupplementalData()) {
                                    U(hVar);
                                }
                                if (this.T0) {
                                    long j10 = this.I0;
                                    if (j3 <= j10) {
                                        this.U0 = (j10 - j3) + 1 + this.U0;
                                    }
                                    this.I0 = j3;
                                    this.T0 = false;
                                }
                                j0(hVar);
                                int O = O(hVar);
                                long j11 = j3 + this.U0;
                                if (flag) {
                                    lVar.b(this.f56184u0, hVar.f17171b, j11, O);
                                } else {
                                    int i12 = this.f56184u0;
                                    ByteBuffer byteBuffer4 = hVar.f17172c;
                                    byteBuffer4.getClass();
                                    lVar.a(i12, byteBuffer4.limit(), O, j11);
                                }
                                this.f56184u0 = -1;
                                hVar.f17172c = null;
                                this.F0 = true;
                                this.C0 = 0;
                                this.O0.f17775c++;
                                return true;
                            }
                        }
                        return true;
                    }
                } catch (k2.g e10) {
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
            l lVar = this.f56168d0;
            lVar.getClass();
            lVar.flush();
        } finally {
            q0();
        }
    }

    public final List N(boolean z9) {
        e2.u uVar = this.U;
        uVar.getClass();
        i iVar = this.K;
        ArrayList Q = Q(iVar, uVar, z9);
        if (Q.isEmpty() && z9) {
            ArrayList Q2 = Q(iVar, uVar, false);
            if (!Q2.isEmpty()) {
                h2.a.l("MediaCodecRenderer", "Drm session requires secure decoder for " + uVar.f10615s + ", but no secure decoder available. Trying to proceed with " + Q2 + ".");
            }
            return Q2;
        }
        return Q;
    }

    public int O(k2.h hVar) {
        return 0;
    }

    public abstract float P(float f10, e2.u uVar, e2.u[] uVarArr);

    public abstract ArrayList Q(i iVar, e2.u uVar, boolean z9);

    public long R(long j3, long j10, boolean z9) {
        return super.g(j3, j10);
    }

    public final q S() {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            return (q) arrayDeque.getLast();
        }
        return this.P0;
    }

    public abstract b8 T(o oVar, e2.u uVar, MediaCrypto mediaCrypto, float f10);

    public abstract void U(k2.h hVar);

    public final void V(u2.o r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: u2.r.V(u2.o, android.media.MediaCrypto):void");
    }

    public final boolean W(long j3, long j10) {
        if (j10 < j3) {
            e2.u uVar = this.V;
            if (uVar == null || !Objects.equals(uVar.f10615s, "audio/opus") || j3 - j10 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: u2.r.X():void");
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z9) {
        String str;
        e2.u uVar = this.U;
        uVar.getClass();
        if (this.f56173i0 == null) {
            try {
                List N = N(z9);
                this.f56173i0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) N;
                if (!arrayList.isEmpty()) {
                    this.f56173i0.add((o) arrayList.get(0));
                }
                this.f56174j0 = null;
            } catch (t e10) {
                throw new p(uVar, e10, z9, -49998);
            }
        }
        if (!this.f56173i0.isEmpty()) {
            ArrayDeque arrayDeque = this.f56173i0;
            arrayDeque.getClass();
            while (this.f56168d0 == null) {
                o oVar = (o) arrayDeque.peekFirst();
                oVar.getClass();
                if (!Z(uVar) || !w0(oVar)) {
                    return;
                }
                try {
                    V(oVar, mediaCrypto);
                } catch (Exception e11) {
                    h2.a.m("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e11);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + oVar.f56146a + ", " + uVar;
                    String str3 = uVar.f10615s;
                    if (e11 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e11).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    p pVar = new p(str2, e11, str3, z9, oVar, str);
                    a0(pVar);
                    p pVar2 = this.f56174j0;
                    if (pVar2 == null) {
                        this.f56174j0 = pVar;
                    } else {
                        this.f56174j0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f56156a, pVar2.f56157b, pVar2.f56158c, pVar2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f56174j0;
                    }
                }
            }
            this.f56173i0 = null;
            return;
        }
        throw new p(uVar, null, z9, -49999);
    }

    public boolean Z(e2.u uVar) {
        return true;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j3, String str, long j10);

    @Override
    public void c(int i7, Object obj) {
        int i10;
        if (i7 != 11) {
            if (i7 != 21) {
                if (i7 == 22 && (i10 = Build.VERSION.SDK_INT) >= 29) {
                    obj.getClass();
                    t0 t0Var = (t0) obj;
                    if (!this.X0.equals(t0Var)) {
                        if (i10 >= 31) {
                            HashSet hashSet = new HashSet(t0Var);
                            HashSet hashSet2 = new HashSet();
                            h2 it = this.X0.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (!hashSet.remove(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            l lVar = this.f56168d0;
                            if (lVar != null) {
                                if (!hashSet2.isEmpty()) {
                                    lVar.n(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    lVar.m(new ArrayList(hashSet));
                                }
                            }
                        }
                        this.X0 = t0Var;
                        return;
                    }
                    return;
                }
                return;
            } else if (Build.VERSION.SDK_INT >= 29) {
                obj.getClass();
                l2.c cVar = (l2.c) obj;
                this.V0 = cVar;
                l lVar2 = this.f56168d0;
                if (lVar2 != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : cVar.f17770a.entrySet()) {
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
        this.Y = l0Var;
    }

    public abstract void c0(l2.c cVar);

    public abstract void d0(String str);

    public l2.e e0(wf.b r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.r.e0(wf.b):l2.e");
    }

    public abstract void f0(e2.u uVar, MediaFormat mediaFormat);

    @Override
    public final long g(long j3, long j10) {
        return R(j3, j10, this.f56182s0);
    }

    public void h0(long j3) {
        this.Q0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (!arrayDeque.isEmpty() && j3 >= ((q) arrayDeque.peek()).f56160a) {
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
        int i7 = this.E0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    this.K0 = true;
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

    public abstract boolean l0(long j3, long j10, l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z9, boolean z10, e2.u uVar);

    public final boolean m0(int i7) {
        wf.b bVar = this.f17758c;
        bVar.A();
        k2.h hVar = this.M;
        hVar.clear();
        int w10 = w(bVar, hVar, i7 | 4);
        if (w10 == -5) {
            e0(bVar);
            return true;
        } else if (w10 == -4 && hVar.isEndOfStream()) {
            this.J0 = true;
            k0();
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void n() {
        this.U = null;
        t0(q.f56159g);
        this.R.clear();
        if (this.f56188y0) {
            this.f56188y0 = false;
            p0();
        } else if (this.f56168d0 == null) {
        } else {
            if (x0()) {
                n0();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
    }

    public final void n0() {
        try {
            l lVar = this.f56168d0;
            if (lVar != null) {
                lVar.release();
                this.O0.f17774b++;
                o oVar = this.f56175k0;
                oVar.getClass();
                d0(oVar.f56146a);
            }
            this.f56168d0 = null;
            try {
                MediaCrypto mediaCrypto = this.Z;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f56168d0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.Z;
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
    public void p(long j3, boolean z9, boolean z10) {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            this.P0 = (q) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (!z10) {
            return;
        }
        this.J0 = false;
        this.K0 = false;
        this.M0 = false;
        if (this.f56188y0) {
            p0();
        } else if (this.f56168d0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
        if (this.P0.d.p() > 0) {
            this.L0 = true;
        }
        this.P0.d.c();
        this.P0.f56163e = false;
    }

    public final void p0() {
        this.I0 = -9223372036854775807L;
        S().f56164f = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.A0 = false;
        this.P.clear();
        this.O.clear();
        this.f56189z0 = false;
        u0 u0Var = this.S;
        u0Var.getClass();
        u0Var.f20317a = f2.n.f10922a;
        u0Var.f20319c = 0;
        u0Var.f20318b = 2;
    }

    public void q0() {
        this.f56184u0 = -1;
        this.N.f17172c = null;
        this.f56185v0 = -1;
        this.f56186w0 = null;
        this.I0 = -9223372036854775807L;
        S().f56164f = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f56183t0 = -9223372036854775807L;
        this.G0 = false;
        this.f56181r0 = -9223372036854775807L;
        this.F0 = false;
        this.f56178o0 = false;
        this.f56179p0 = false;
        this.f56187x0 = false;
        this.D0 = 0;
        this.E0 = 0;
        this.C0 = this.B0 ? 1 : 0;
        this.T0 = false;
        this.U0 = 0L;
    }

    public final void r0() {
        q0();
        this.N0 = null;
        this.f56173i0 = null;
        this.f56175k0 = null;
        this.f56169e0 = null;
        this.f56170f0 = null;
        this.f56171g0 = false;
        this.H0 = false;
        this.f56172h0 = -1.0f;
        this.f56176l0 = 0;
        this.m0 = false;
        this.f56177n0 = false;
        this.f56180q0 = false;
        this.f56182s0 = false;
        this.B0 = false;
        this.C0 = 0;
    }

    public final void s0(q2.g gVar) {
        f1.B(this.W, gVar);
        this.W = gVar;
    }

    public final void t0(q qVar) {
        this.P0 = qVar;
        if (qVar.f56162c != -9223372036854775807L) {
            this.R0 = true;
            g0();
        }
    }

    @Override
    public void u(e2.u[] r12, long r13, long r15, x2.g0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: u2.r.u(e2.u[], long, long, x2.g0):void");
    }

    public boolean u0(k2.h hVar) {
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
        throw new UnsupportedOperationException("Method not decompiled: u2.r.x(long, long):void");
    }

    public boolean x0() {
        int i7 = this.E0;
        if (i7 == 3 || ((this.m0 && !this.H0) || (this.f56177n0 && this.G0))) {
            return true;
        }
        if (i7 == 2) {
            try {
                B0();
                return false;
            } catch (l2.l e10) {
                h2.a.m("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                return true;
            }
        }
        return false;
    }

    public boolean y0(e2.u uVar) {
        return false;
    }

    public abstract int z0(i iVar, e2.u uVar);

    public void g0() {
    }

    public void j0(k2.h hVar) {
    }
}
