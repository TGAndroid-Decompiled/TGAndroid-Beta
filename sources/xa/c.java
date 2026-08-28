package xa;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.g;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.p;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import bg.i2;
import c2.e;
import c2.n;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fh.o1;
import h3.t1;
import hg.r0;
import ih.d9;
import ih.i4;
import j3.q;
import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k7.d;
import k7.f;
import kh.a6;
import kh.a8;
import kh.ac;
import kh.e0;
import kh.kb;
import kh.mb;
import kh.r6;
import kh.wb;
import kh.ya;
import l.i;
import l.k;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ju0;
import t5.l;
import tf.m;
import u5.h;
import yf.b2;
public final class c implements a0, androidx.activity.result.b, o, y2.b, Continuation, w, tj0, ju0, q, s, m, ac, i, l0 {
    public final int f49098a;
    public Object f49099b;

    public c(Object obj, int i9) {
        this.f49098a = i9;
        this.f49099b = obj;
    }

    public static int J(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i9 += (127 - charAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) >= 65536) {
                                i10++;
                            } else {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i10);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i11 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int P(int i9, String str) {
        int V = V(i9);
        int J = J(str);
        return W(J) + J + V;
    }

    public static void S(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i9;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c10 = 57343;
            int i10 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i11 = remaining + arrayOffset;
                    while (i10 < length) {
                        int i12 = i10 + arrayOffset;
                        if (i12 >= i11 || (charAt = charSequence.charAt(i10)) >= 128) {
                            break;
                        }
                        array[i12] = (byte) charAt;
                        i10++;
                    }
                    if (i10 == length) {
                        i9 = arrayOffset + length;
                    } else {
                        i9 = arrayOffset + i10;
                        while (i10 < length) {
                            char charAt2 = charSequence.charAt(i10);
                            if (charAt2 < 128 && i9 < i11) {
                                array[i9] = (byte) charAt2;
                                i9++;
                            } else if (charAt2 < 2048 && i9 <= i11 - 2) {
                                int i13 = i9 + 1;
                                array[i9] = (byte) ((charAt2 >>> 6) | 960);
                                i9 += 2;
                                array[i13] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c10 < charAt2) && i9 <= i11 - 3) {
                                array[i9] = (byte) ((charAt2 >>> '\f') | 480);
                                int i14 = i9 + 2;
                                array[i9 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i9 += 3;
                                array[i14] = (byte) ((charAt2 & '?') | 128);
                            } else if (i9 <= i11 - 4) {
                                int i15 = i10 + 1;
                                if (i15 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i15);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i9] = (byte) ((codePoint >>> 18) | 240);
                                        array[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i16 = i9 + 3;
                                        array[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i9 += 4;
                                        array[i16] = (byte) ((codePoint & 63) | 128);
                                        i10 = i15;
                                    } else {
                                        i10 = i15;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i10 - 1);
                                throw new IllegalArgumentException(sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt2);
                                sb3.append(" at index ");
                                sb3.append(i9);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i10++;
                            c10 = 57343;
                        }
                    }
                    byteBuffer.position(i9 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e10);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i10 < length2) {
                char charAt4 = charSequence.charAt(i10);
                char c11 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c11 = (charAt4 & '?') | 128;
                    } else {
                        if (charAt4 >= 55296 && 57343 >= charAt4) {
                            int i17 = i10 + 1;
                            if (i17 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i17);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i10 = i17;
                                } else {
                                    i10 = i17;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i10 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                        i10++;
                    }
                }
                byteBuffer.put((byte) c11);
                i10++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int U(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        if ((j10 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int V(int i9) {
        return W(i9 << 3);
    }

    public static int W(int i9) {
        if ((i9 & (-128)) == 0) {
            return 1;
        }
        if ((i9 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i9) == 0) {
            return 3;
        }
        if ((i9 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public StringBuilder A() {
        ke.a aVar = (ke.a) this.f49099b;
        if (aVar instanceof fe.o) {
            StringBuilder sb2 = ((fe.o) aVar).f6122b.f6107b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void B(float f10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f14944u0 = f10;
        a8Var.f14922j = true;
        r6Var.c();
    }

    @Override
    public void E(Object obj) {
        switch (this.f49098a) {
            case 2:
                androidx.biometric.q qVar = (androidx.biometric.q) this.f49099b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(2131701349));
                    }
                    y yVar = qVar.f559h0;
                    if (!yVar.f576n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.o(1);
                        }
                        executor.execute(new g(qVar, 0));
                    }
                    y yVar2 = qVar.f559h0;
                    if (yVar2.f583u == null) {
                        yVar2.f583u = new z();
                    }
                    y.h(yVar2.f583u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                p pVar = (p) this.f49099b;
                if (tVar != null && pVar.f1008n0) {
                    pVar.getClass();
                    throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public TextureView G() {
        return null;
    }

    public Boolean H() {
        Bundle bundle = (Bundle) this.f49099b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public void H0(boolean z10) {
        r6 r6Var = (r6) this.f49099b;
        if (r6Var.j()) {
            r6Var.A.getClass();
        }
        r6Var.x(-4, z10);
    }

    public void I(c2.q qVar, n nVar, Collection collection) {
        e eVar = (e) this.f49099b;
        if (qVar == eVar.f2155y && nVar != null) {
            c2.z zVar = eVar.f2154x.f2090a;
            String d = nVar.d();
            c2.a0 a0Var = new c2.a0(zVar, d, eVar.b(zVar, d), false);
            a0Var.i(nVar);
            if (eVar.d != a0Var) {
                eVar.h(eVar, a0Var, eVar.f2155y, 3, eVar.f2154x, collection);
                eVar.f2154x = null;
                eVar.f2155y = null;
            }
        } else if (qVar == eVar.f2137e) {
            if (nVar != null) {
                eVar.n(eVar.d, nVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public void K(float f10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.G = f10;
        a8Var.f14922j = true;
        r6Var.c();
    }

    @Override
    public void K1(float f10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.E = f10;
        a8Var.f14922j = true;
        r6Var.w(true);
    }

    public void L(int i9, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f49099b;
        R(i9, 2);
        try {
            int W = W(str.length());
            if (W == W(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= W) {
                    byteBuffer.position(position + W);
                    S(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    O((position2 - position) - W);
                    byteBuffer.position(position2);
                    return;
                }
                throw new z4(position + W, byteBuffer.limit());
            }
            O(J(str));
            S(str, byteBuffer);
        } catch (BufferOverflowException e10) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e10);
            throw z4Var;
        }
    }

    public void M(int i9, byte[] bArr) {
        R(i9, 2);
        O(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f49099b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    public void N(int i9) {
        byte b10 = (byte) i9;
        ByteBuffer byteBuffer = (ByteBuffer) this.f49099b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    public void O(int i9) {
        while ((i9 & (-128)) != 0) {
            N((i9 & 127) | 128);
            i9 >>>= 7;
        }
        N(i9);
    }

    @Override
    public void P0(float f10, int i9) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i9 >= 0 && i9 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i9)).P = f10;
        }
    }

    @Override
    public void Q(long j10, boolean z10) {
        r6 r6Var = (r6) this.f49099b;
        if (!z10) {
            r6Var.m(j10);
            return;
        }
        k61 k61Var = r6Var.f15936e;
        if (k61Var != null) {
            k61Var.M(j10, true);
        } else if (r6Var.j()) {
            r6Var.A.m(j10, true);
        } else {
            k61 k61Var2 = r6Var.f15961y;
            if (k61Var2 != null) {
                k61Var2.M(j10, false);
            }
        }
    }

    public void R(int i9, int i10) {
        O((i9 << 3) | i10);
    }

    public void T(long j10) {
        while (((-128) & j10) != 0) {
            N((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        N((int) j10);
    }

    @Override
    public void X0(float f10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.P = f10;
        r6Var.c();
    }

    @Override
    public void Y1(float f10, int i9) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i9 >= 0 && i9 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i9)).W = f10;
        }
    }

    @Override
    public void Z1(float f10) {
        a8 a8Var = ((r6) this.f49099b).d;
        if (a8Var == null) {
            return;
        }
        a8Var.f14902a0 = f10;
        a8Var.f14922j = true;
    }

    @Override
    public void a(long j10) {
        j3.m access$100 = j3.a0.access$100((FfmpegAudioRenderer) this.f49099b);
        Handler handler = access$100.f13291a;
        if (handler != null) {
            handler.post(new i2(access$100, j10, 8));
        }
    }

    @Override
    public void a1(float f10, boolean z10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var != null) {
            a8Var.Z = f10;
            a8Var.f14922j = true;
            k61 k61Var = r6Var.f15936e;
            if (k61Var != null && k61Var.q() != -9223372036854775807L) {
                r6Var.m(f10 * ((float) r6Var.f15936e.q()));
            }
        }
    }

    @Override
    public void a2() {
        ((r6) this.f49099b).q(null);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        d dVar = new d(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i9 = k7.a.f14662a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        ((v7.c) this.f49099b).writeToParcel(obtain, 0);
        ((k7.c) ((f) obj).u()).E0(obtain, 1);
    }

    public void b(l lVar, u uVar) {
        k0 k0Var = (k0) this.f49099b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f49099b;
            androidx.biometric.q qVar = (androidx.biometric.q) k0Var2.D("androidx.biometric.BiometricFragment");
            if (qVar == null) {
                qVar = new androidx.biometric.q();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
                aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                k0Var2.A(true);
                k0Var2.E();
            }
            v k10 = qVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            y yVar = qVar.f559h0;
            yVar.f569f = lVar;
            int i9 = lVar.f47699a;
            if (i9 == 0) {
                if (uVar != null) {
                    i9 = 15;
                } else {
                    i9 = 255;
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && i10 < 30 && i9 == 15 && uVar == null) {
                yVar.f570g = f7.o.a();
            } else {
                yVar.f570g = uVar;
            }
            if (qVar.Q()) {
                qVar.f559h0.f573k = qVar.q(2131701339);
            } else {
                qVar.f559h0.f573k = null;
            }
            if (qVar.Q() && new a5.m(new h(k10, 1)).e(255) != 0) {
                qVar.f559h0.f576n = true;
                qVar.S();
            } else if (qVar.f559h0.f578p) {
                qVar.f558g0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    @Override
    public void c(k kVar, boolean z10) {
        boolean z11;
        int i9;
        g.p pVar;
        g.q qVar = (g.q) this.f49099b;
        k k10 = kVar.k();
        int i10 = 0;
        if (k10 != kVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            kVar = k10;
        }
        g.p[] pVarArr = qVar.Q;
        if (pVarArr != null) {
            i9 = pVarArr.length;
        } else {
            i9 = 0;
        }
        while (true) {
            if (i10 < i9) {
                pVar = pVarArr[i10];
                if (pVar != null && pVar.h == kVar) {
                    break;
                }
                i10++;
            } else {
                pVar = null;
                break;
            }
        }
        if (pVar != null) {
            if (z11) {
                qVar.f(pVar.f6995a, pVar, k10);
                qVar.h(pVar, true);
                return;
            }
            qVar.h(pVar, z10);
        }
    }

    @Override
    public void d(View view, r0 r0Var, boolean z10, boolean z11) {
        hg.v vVar = (hg.v) this.f49099b;
        vVar.f10761a.ab(null, vVar.f10764e, vVar.f10762b, view, 0.0f, 0.0f, r0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new o1(this, 26));
    }

    @Override
    public void e(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.f49099b;
        long j12 = t0Var.f2606a;
        Uri uri = t0Var.d.f2653c;
        ?? obj = new Object();
        gVar.f17304n.getClass();
        gVar.f17307q.d(obj, t0Var.f2608c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        switch (this.f49098a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f49099b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = f0Var.f936a;
                int i9 = f0Var.f937b;
                androidx.fragment.app.s q10 = j0Var.f950c.q(str);
                if (q10 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                q10.x(i9, aVar.f399a, aVar.f400b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f49099b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f400b;
                int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f18319a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.I;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i10, extras);
                }
                int i11 = aVar2.f399a;
                if (i11 != -1 || i10 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void g0() {
        r6 r6Var = (r6) this.f49099b;
        r6Var.s(null, null, true);
        wb wbVar = ((kb) r6Var).f15555y0;
        kb kbVar = wbVar.T0;
        if (kbVar != null) {
            kbVar.s(null, null, true);
        }
        ya yaVar = wbVar.f16302r1;
        if (yaVar != null) {
            yaVar.q0();
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null) {
            mbVar.setHasRoundVideo(false);
        }
        a8 a8Var = wbVar.G1;
        if (a8Var != null) {
            File file = a8Var.f14932o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                wbVar.G1.f14932o0 = null;
            }
            if (wbVar.G1.f14934p0 != null) {
                try {
                    new File(wbVar.G1.f14934p0).delete();
                } catch (Exception unused2) {
                }
                wbVar.G1.f14934p0 = null;
            }
        }
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((nc.a) this.f49099b).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public com.google.android.exoplayer2.upstream.k0 h(com.google.android.exoplayer2.upstream.n0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.h(com.google.android.exoplayer2.upstream.n0, java.io.IOException, int):com.google.android.exoplayer2.upstream.k0");
    }

    @Override
    public void h2(float f10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f14942t0 = f10;
        a8Var.f14922j = true;
        r6Var.y(true);
    }

    @Override
    public void i(Object obj) {
        ((q7.c) obj).onLocationResult((LocationResult) this.f49099b);
    }

    @Override
    public void i1(long j10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f14938r0 = j10;
        a8Var.f14922j = true;
        r6Var.y(true);
    }

    @Override
    public boolean j(k kVar) {
        Window.Callback callback;
        g.q qVar = (g.q) this.f49099b;
        if (kVar == kVar.k() && qVar.K && (callback = qVar.f7017f.getCallback()) != null && !qVar.V) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void j1(boolean z10) {
        b2 b2Var;
        wb wbVar = ((kb) ((r6) this.f49099b)).f15555y0;
        ya yaVar = wbVar.f16302r1;
        if (yaVar != null) {
            b2 b2Var2 = null;
            if (!z10 && (yaVar.getSelectedEntity() instanceof b2)) {
                wbVar.f16302r1.D0(null, true);
            } else if (z10 && !(wbVar.f16302r1.getSelectedEntity() instanceof b2)) {
                a6 a6Var = wbVar.f16302r1.N0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < a6Var.getChildCount()) {
                        View childAt = a6Var.getChildAt(i10);
                        if (childAt instanceof b2) {
                            b2Var = (b2) childAt;
                            break;
                        }
                        i10++;
                    } else {
                        b2Var = null;
                        break;
                    }
                }
                if (b2Var != null) {
                    ya yaVar2 = wbVar.f16302r1;
                    a6 a6Var2 = yaVar2.N0;
                    while (true) {
                        if (i9 >= a6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = a6Var2.getChildAt(i9);
                        if (childAt2 instanceof b2) {
                            b2Var2 = (b2) childAt2;
                            break;
                        }
                        i9++;
                    }
                    yaVar2.D0(b2Var2, true);
                }
            }
        }
    }

    @Override
    public void j2(int i9, long j10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i9 >= 0 && i9 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i9)).X = j10;
        }
    }

    @Override
    public void k(int i9) {
        kh.f0 f0Var = ((r6) this.f49099b).A;
        if (f0Var != null) {
            ArrayList arrayList = f0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                e0 e0Var = (e0) obj;
                if (e0Var.f15129a == i9) {
                    e0Var.f15130b.d(1.0f, true);
                    f0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void l(k kVar) {
        android.support.v4.media.c cVar = ((ActionMenuView) this.f49099b).G;
        if (cVar != null) {
            cVar.l(kVar);
        }
    }

    @Override
    public void m(n0 n0Var, long j10, long j11) {
        int size;
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.f49099b;
        long j12 = t0Var.f2606a;
        Uri uri = t0Var.d.f2653c;
        ?? obj = new Object();
        gVar.f17304n.getClass();
        gVar.f17307q.f(obj, t0Var.f2608c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        n4.c cVar = (n4.c) t0Var.f2610f;
        n4.c cVar2 = gVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f18400m.size();
        }
        long j13 = cVar.b(0).f18418b;
        int i9 = 0;
        while (i9 < size && gVar.H.b(i9).f18418b < j13) {
            i9++;
        }
        if (cVar.d) {
            if (size - i9 > cVar.f18400m.size()) {
                d5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.N;
                if (j14 != -9223372036854775807L && cVar.h * 1000 <= j14) {
                    d5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                } else {
                    gVar.M = 0;
                }
            }
            int i10 = gVar.M;
            gVar.M = i10 + 1;
            if (i10 < gVar.f17304n.l3(t0Var.f2608c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * 1000, 5000));
                return;
            }
            gVar.C = new IOException();
            return;
        }
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j10 - j11;
        gVar.K = j10;
        synchronized (gVar.f17310t) {
            try {
                if (t0Var.f2607b.f2585a == gVar.F) {
                    Uri uri2 = gVar.H.f18398k;
                    if (uri2 == null) {
                        uri2 = t0Var.d.f2653c;
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size == 0) {
            n4.c cVar3 = gVar.H;
            if (cVar3.d) {
                b9.c cVar4 = cVar3.f18396i;
                if (cVar4 != null) {
                    String str = cVar4.f1662b;
                    if (!d5.f0.a(str, "urn:mpeg:dash:utc:direct:2014") && !d5.f0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!d5.f0.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !d5.f0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!d5.f0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !d5.f0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!d5.f0.a(str, "urn:mpeg:dash:utc:ntp:2014") && !d5.f0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    d5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                                    gVar.u(true);
                                    return;
                                }
                                gVar.t();
                                return;
                            }
                            t0 t0Var2 = new t0(gVar.f17315z, Uri.parse(cVar4.f1663c), 5, new d7.u(15));
                            gVar.A.f(t0Var2, new m4.d(gVar), 1);
                            gVar.f17307q.k(new j4.q(t0Var2.f2607b), t0Var2.f2608c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                            return;
                        }
                        t0 t0Var3 = new t0(gVar.f17315z, Uri.parse(cVar4.f1663c), 5, new Object());
                        gVar.A.f(t0Var3, new m4.d(gVar), 1);
                        gVar.f17307q.k(new j4.q(t0Var3.f2607b), t0Var3.f2608c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                        return;
                    }
                    try {
                        gVar.L = d5.f0.K(cVar4.f1663c) - gVar.K;
                        gVar.u(true);
                        return;
                    } catch (t1 e10) {
                        d5.a.p("DashMediaSource", "Failed to resolve time offset.", e10);
                        gVar.u(true);
                        return;
                    }
                }
                gVar.t();
                return;
            }
            gVar.u(true);
            return;
        }
        gVar.O += i9;
        gVar.u(true);
    }

    @Override
    public void m2(long j10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.D = j10;
        a8Var.f14922j = true;
        r6Var.w(true);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void o(int i9, long j10, long j11) {
        j3.m access$100 = j3.a0.access$100((FfmpegAudioRenderer) this.f49099b);
        Handler handler = access$100.f13291a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(access$100, i9, j10, j11, 1));
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        j3.m access$100 = j3.a0.access$100((FfmpegAudioRenderer) this.f49099b);
        Handler handler = access$100.f13291a;
        if (handler != null) {
            handler.post(new eh.f(5, access$100, z10));
        }
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public void p1(float f10, int i9) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i9 >= 0 && i9 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i9)).V = f10;
        }
    }

    @Override
    public void q() {
        ((kh.k0) this.f49099b).d.invalidate();
    }

    @Override
    public boolean r(k kVar, MenuItem menuItem) {
        m.l lVar = ((ActionMenuView) this.f49099b).L;
        if (lVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((k5.i) lVar).f14659b).S.f13432c).iterator();
            while (it.hasNext()) {
                if (((b0) it.next()).f923a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f49099b).call();
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public void u1(float f10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.F = f10;
        a8Var.f14922j = true;
        r6Var.w(true);
    }

    @Override
    public void v0(float f10) {
        r6 r6Var = (r6) this.f49099b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f14940s0 = f10;
        a8Var.f14922j = true;
        r6Var.y(true);
    }

    @Override
    public void w(Exception exc) {
        d5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        j3.m access$100 = j3.a0.access$100((FfmpegAudioRenderer) this.f49099b);
        Handler handler = access$100.f13291a;
        if (handler != null) {
            handler.post(new j3.k(access$100, exc, 1));
        }
    }

    @Override
    public void x() {
        ((FfmpegAudioRenderer) this.f49099b).onPositionDiscontinuity();
    }

    @Override
    public void x0(MessageObject messageObject) {
        ((d9) ((i4) this.f49099b).M1).f(true);
    }

    @Override
    public void y(MessageObject messageObject) {
        ((d9) ((i4) this.f49099b).M1).f(false);
    }

    public m5.o z() {
        m5.o oVar = (m5.o) this.f49099b;
        if (oVar.f17445a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f17448e)) {
                if (!Double.isNaN(oVar.f17449f) && oVar.f17449f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(byte[] bArr, int i9) {
        this.f49098a = 10;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i9);
        this.f49099b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(MediaInfo mediaInfo) {
        this.f49098a = 28;
        m5.o oVar = new m5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f49099b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(Set set) {
        this.f49098a = 0;
        this.f49099b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f49099b).put(a.class, bVar.f49097a);
        }
    }

    public c(JSONObject jSONObject) {
        this.f49098a = 28;
        this.f49099b = new m5.o(jSONObject);
    }

    public c(Context context) {
        this.f49098a = 21;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f49099b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(int i9) {
        this.f49098a = i9;
        switch (i9) {
            case 16:
                this.f49099b = new g5.b[gf.b.values().length];
                return;
            case 17:
                return;
            case 26:
                this.f49099b = new d5.y(10);
                return;
            default:
                this.f49099b = new CopyOnWriteArrayList();
                return;
        }
    }

    @Override
    public void D() {
    }

    @Override
    public void F() {
    }

    @Override
    public void g() {
    }

    @Override
    public void t() {
    }

    public c(LaunchActivity launchActivity, Executor executor, f7.n nVar) {
        this.f49098a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new a5.m(launchActivity).n(y.class);
            this.f49099b = s10;
            yVar.d = executor;
            yVar.f568e = nVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void v(boolean z10) {
    }

    @Override
    public void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
