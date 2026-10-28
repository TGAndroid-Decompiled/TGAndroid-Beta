package rb;

import a3.d;
import a8.a1;
import a8.b1;
import a8.h0;
import ai.f1;
import ai.z0;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import androidx.biometric.g;
import androidx.biometric.p;
import androidx.biometric.x;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import androidx.fragment.app.o;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b8.e;
import bh.x0;
import bi.dd;
import bi.p7;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.cast.w4;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.d0;
import d6.e0;
import d7.v;
import di.s3;
import di.s4;
import di.u9;
import di.v9;
import fi.m;
import fi.m6;
import fi.o6;
import h6.f;
import h6.i;
import h6.q;
import h6.s;
import h6.w;
import hb.n;
import ii.q0;
import ii.r0;
import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import l6.h;
import m.i1;
import o7.l1;
import o7.m1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dz0;
import org.telegram.ui.e20;
import org.telegram.ui.wn;
import org.telegram.ui.yz0;
public final class c implements a0, androidx.activity.result.b, r, fl0, jw0, u9, OnCompleteListener, eb0, q81, i1, g6.a, n, fb.n, q0 {
    public final int f47357a;
    public Object f47358b;

    public c(j jVar, Object obj, int i10) {
        this.f47357a = i10;
        this.f47358b = obj;
    }

    public static int A(long j10) {
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

    public static int C(int i10) {
        return E(i10 << 3);
    }

    public static int E(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        if ((i10 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int r(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int w(int i10, String str) {
        int C = C(i10);
        int r6 = r(str);
        return E(r6) + r6 + C;
    }

    public static void y(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c10 = 57343;
            int i11 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i12 = remaining + arrayOffset;
                    while (i11 < length) {
                        int i13 = i11 + arrayOffset;
                        if (i13 >= i12 || (charAt = charSequence.charAt(i11)) >= 128) {
                            break;
                        }
                        array[i13] = (byte) charAt;
                        i11++;
                    }
                    if (i11 == length) {
                        i10 = arrayOffset + length;
                    } else {
                        i10 = arrayOffset + i11;
                        while (i11 < length) {
                            char charAt2 = charSequence.charAt(i11);
                            if (charAt2 < 128 && i10 < i12) {
                                array[i10] = (byte) charAt2;
                                i10++;
                            } else if (charAt2 < 2048 && i10 <= i12 - 2) {
                                int i14 = i10 + 1;
                                array[i10] = (byte) ((charAt2 >>> 6) | 960);
                                i10 += 2;
                                array[i14] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c10 < charAt2) && i10 <= i12 - 3) {
                                array[i10] = (byte) ((charAt2 >>> '\f') | 480);
                                int i15 = i10 + 2;
                                array[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i10 += 3;
                                array[i15] = (byte) ((charAt2 & '?') | 128);
                            } else if (i10 <= i12 - 4) {
                                int i16 = i11 + 1;
                                if (i16 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i16);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i10] = (byte) ((codePoint >>> 18) | 240);
                                        array[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i17 = i10 + 3;
                                        array[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i10 += 4;
                                        array[i17] = (byte) ((codePoint & 63) | 128);
                                        i11 = i16;
                                    } else {
                                        i11 = i16;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11 - 1);
                                throw new IllegalArgumentException(sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt2);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i11++;
                            c10 = 57343;
                        }
                    }
                    byteBuffer.position(i10 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i11 < length2) {
                char charAt4 = charSequence.charAt(i11);
                char c11 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c11 = (charAt4 & '?') | 128;
                    } else {
                        if (charAt4 >= 55296 && 57343 >= charAt4) {
                            int i18 = i11 + 1;
                            if (i18 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i18);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i11 = i18;
                                } else {
                                    i11 = i18;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c11);
                i11++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    @Override
    public void B(boolean z10) {
        dd ddVar = (dd) this.f47358b;
        oe.b bVar = ddVar.Y;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        e20 e20Var = ddVar.f39135s;
        if (e20Var != null) {
            e20Var.invalidate();
        }
    }

    @Override
    public Paint.FontMetricsInt D() {
        return ((m) this.f47358b).f11198f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void G0(long j10, int i10, s3 s3Var) {
        int i11 = ProfileStoriesView.f36256s0;
        ((dz0) this.f47358b).f(true, false);
        s3Var.run();
    }

    @Override
    public void Q(Object obj) {
        switch (this.f47357a) {
            case 3:
                p pVar = (p) this.f47358b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131689613));
                    }
                    x xVar = pVar.f2283l0;
                    if (!xVar.f2299n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = xVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new g(pVar, 0));
                    }
                    x xVar2 = pVar.f2283l0;
                    if (xVar2.f2306u == null) {
                        xVar2.f2306u = new z();
                    }
                    x.h(xVar2.f2306u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                o oVar = (o) this.f47358b;
                if (tVar != null && oVar.f2691r0) {
                    oVar.getClass();
                    throw new IllegalStateException("Fragment " + oVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public Object U1() {
        Type type = (Type) this.f47358b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public float V0() {
        return org.telegram.messenger.t.c(9.0f, ((k.getCurrentActionBarHeight() / 2) * 2) + ((dd) this.f47358b).f4514b0, 0);
    }

    @Override
    public void X(int i10, int i11, CharSequence charSequence, boolean z10) {
        fi.g gVar = ((m) this.f47358b).f11198f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void a(long j10) {
        ((ii.r) this.f47358b).presentFragment(wn.ea(j10));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f47357a) {
            case 7:
                e eVar = new e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = b8.a.f3673a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((m8.a) this.f47358b).writeToParcel(obtain, 0);
                ((b8.c) ((b8.g) obj).u()).F0(obtain, 2);
                return;
            case 12:
                c7.b bVar = new c7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.f19238b);
                int i11 = o7.j.f19224a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((v) this.f47358b).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    m1Var.f19237a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
            case 16:
                w wVar = (w) obj;
                f fVar = (f) wVar.u();
                d0 d0Var = ((e0) this.f47358b).f8064k;
                Parcel N0 = fVar.N0();
                com.google.android.gms.internal.cast.t.d(N0, d0Var);
                fVar.S0(N0, 18);
                f fVar2 = (f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            default:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((s) obj).u();
                Parcel N02 = iVar.N0();
                com.google.android.gms.internal.cast.t.d(N02, qVar);
                N02.writeStringArray((String[]) this.f47358b);
                iVar.S0(N02, 5);
                return;
        }
    }

    @Override
    public int b1() {
        return ((dd) this.f47358b).f4515c0;
    }

    @Override
    public void c() {
        boolean z10;
        ii.r rVar = (ii.r) this.f47358b;
        oe.b bVar = rVar.f14404a;
        r0 r0Var = rVar.v;
        if (r0Var.f14422n && r0Var.f14420l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        rVar.d.f32504g3.O(true);
    }

    @Override
    public void close() {
        ((ii.r) this.f47358b).finishFragment();
    }

    @Override
    public void d(Object obj) {
        Bundle extras;
        switch (this.f47357a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.f47358b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = e0Var.f2624a;
                int i10 = e0Var.f2625b;
                androidx.fragment.app.r g7 = i0Var.f2638c.g(str);
                if (g7 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                g7.x(i10, aVar.f2133a, aVar.f2134b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f47358b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f2134b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f7985a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f2133a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public void e(k6.m mVar, androidx.biometric.t tVar) {
        j0 j0Var = (j0) this.f47358b;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            j0 j0Var2 = (j0) this.f47358b;
            p pVar = (p) j0Var2.D("androidx.biometric.BiometricFragment");
            if (pVar == null) {
                pVar = new p();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
                aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                j0Var2.A(true);
                j0Var2.E();
            }
            androidx.fragment.app.u k10 = pVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            x xVar = pVar.f2283l0;
            xVar.f2292f = mVar;
            int i10 = mVar.f16422a;
            if (i10 == 0) {
                if (tVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i10 == 15 && tVar == null) {
                xVar.f2293g = b1.a();
            } else {
                xVar.f2293g = tVar;
            }
            if (pVar.Q()) {
                pVar.f2283l0.f2296k = pVar.q(2131689576);
            } else {
                pVar.f2283l0.f2296k = null;
            }
            if (pVar.Q() && new h0(new h(k10, 1)).h(255) != 0) {
                pVar.f2283l0.f2299n = true;
                pVar.S();
            } else if (pVar.f2283l0.f2301p) {
                pVar.f2282k0.postDelayed(new androidx.biometric.o(pVar), 600L);
            } else {
                pVar.X();
            }
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    public void g() {
        ArrayList arrayList = (ArrayList) this.f47358b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e) {
                    bd.k.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public int h(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        hc.a aVar = (hc.a) this.f47358b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z10 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f12763a[aVar.f12767g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            hc.a aVar2 = hc.a.h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return 0;
            }
            hc.b bVar = new hc.b(aVar, iArr5);
            hc.b a2 = aVar.a(i10, 1);
            hc.b bVar2 = aVar.f12765c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            hc.b bVar3 = aVar.d;
            hc.b bVar4 = a2;
            hc.b bVar5 = bVar;
            hc.b bVar6 = bVar4;
            hc.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    hc.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    hc.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        hc.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a10;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                hc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                hc.b bVar10 = bVarArr[0];
                hc.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.e && i20 < d10; i21++) {
                        if (bVar10.b(i21) == 0) {
                            iArr6[i20] = aVar.b(i21);
                            i20++;
                        }
                    }
                    if (i20 == d10) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i22 = 0; i22 < length3; i22++) {
                    int b12 = aVar.b(iArr3[i22]);
                    int i23 = 1;
                    for (int i24 = 0; i24 < length3; i24++) {
                        if (i22 != i24) {
                            int c12 = aVar.c(iArr3[i24], b12);
                            if ((c12 & 1) == 0) {
                                i11 = c12 | 1;
                            } else {
                                i11 = c12 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c13;
                    if (aVar.f12767g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f12764b[i26];
                        if (i27 >= 0) {
                            iArr[i27] = iArr[i27] ^ iArr7[i25];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean i1(long j10, int i10, int i11, int i12, v9 v9Var) {
        ImageReceiver imageReceiver;
        s4 s4Var;
        s4 s4Var2;
        s4 s4Var3;
        s4 s4Var4;
        v9Var.f9269b = null;
        v9Var.f9270c = null;
        dz0 dz0Var = (dz0) this.f47358b;
        yz0 yz0Var = dz0Var.h;
        ArrayList arrayList = dz0Var.f36281w;
        if (dz0Var.N < 0.2f) {
            v9Var.f9269b = yz0Var.getImageReceiver();
            v9Var.f9270c = null;
            v9Var.f9268a = yz0Var;
            v9Var.h = 0.0f;
            v9Var.f9273i = AndroidUtilities.displaySize.y;
            v9Var.f9272g = (View) dz0Var.getParent();
            v9Var.d = dz0Var.f36283y;
            v9Var.f9278n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                s4 s4Var5 = (s4) arrayList.get(i13);
                if (s4Var5.e >= 1.0f && s4Var5.f9144a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        s4Var3 = (s4) arrayList.get(i14);
                    } else {
                        s4Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        s4Var4 = (s4) arrayList.get(i15);
                    } else {
                        s4Var4 = null;
                    }
                    s4 d = ProfileStoriesView.d(s4Var3, s4Var4, s4Var5);
                    imageReceiver = s4Var5.f9145b;
                    s4Var2 = d;
                    s4Var = s4Var5;
                } else {
                    i13++;
                }
            } else {
                imageReceiver = null;
                s4Var = null;
                s4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        v9Var.f9270c = imageReceiver;
        v9Var.f9269b = null;
        v9Var.f9268a = dz0Var;
        v9Var.h = 0.0f;
        v9Var.f9273i = AndroidUtilities.displaySize.y;
        v9Var.f9272g = (View) dz0Var.getParent();
        if (s4Var != null && s4Var2 != null) {
            v9Var.f9271f = new p7(this, new RectF(s4Var.f9153m), s4Var, new RectF(s4Var2.f9153m), s4Var2);
            return true;
        }
        v9Var.f9271f = null;
        return true;
    }

    @Override
    public void k(Bitmap bitmap) {
        h6.b bVar = g6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int C = (int) a1.g.C(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (C - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, C, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((g6.h) this.f47358b).e(bitmap2, 0);
    }

    public void n(int i10) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        f1 f1Var = ((z0) this.f47358b).e;
        if (f1Var != null) {
            int i11 = f1Var.f1487a;
            if (f1Var.d != i10) {
                boolean z11 = true;
                if (f1Var.f1489c.d && i10 == 2) {
                    i10 = 1;
                }
                f1Var.d = i10;
                SharedPreferences.Editor edit = MessagesController.getMainSettings(i11).edit();
                if (f1Var.d == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                edit.putBoolean("qrNoPaidPermanent", z10).apply();
                int i12 = f1Var.d;
                if (i12 == 0) {
                    if (f1Var.f1491n != 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(f1Var.f1491n, true);
                        f1Var.f1491n = 0;
                        return;
                    }
                    return;
                }
                if (i12 == 2 && (c10 = f1Var.c()) != null) {
                    f1Var.f1490f = c10;
                    f1Var.f1488b.setFreeLink(f1Var.d(c10));
                }
                if (f1Var.d != 1) {
                    z11 = false;
                }
                f1Var.l(false, z11);
            }
        }
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        e6.c.h((e6.c) ((e6.j) this.f47358b).f9820c, "launchApplication", task);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        o6 o6Var = (o6) this.f47358b;
        m6 m6Var = o6Var.L;
        AndroidUtilities.cancelRunOnUIThread(m6Var);
        t81 t81Var = o6Var.f11392y;
        if (t81Var != null && t81Var.y()) {
            AndroidUtilities.runOnUIThread(m6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((o6) this.f47358b).i();
    }

    @Override
    public void p(View view, x0 x0Var, boolean z10, boolean z11) {
        bh.x xVar = (bh.x) this.f47358b;
        xVar.f4195a.nb(null, xVar.e, xVar.f4196b, view, 0.0f, 0.0f, x0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new d(this, 13));
    }

    public fb.i q(Object obj) {
        fb.g gVar = ((ib.a0) this.f47358b).f13905b;
        gVar.getClass();
        if (obj == null) {
            return fb.k.f10395a;
        }
        Class<?> cls = obj.getClass();
        ib.n nVar = new ib.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public void s(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f47358b;
        x(i10, 2);
        try {
            int E = E(str.length());
            if (E == E(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= E) {
                    byteBuffer.position(position + E);
                    y(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    v((position2 - position) - E);
                    byteBuffer.position(position2);
                    return;
                }
                throw new w4(position + E, byteBuffer.limit());
            }
            v(r(str));
            y(str, byteBuffer);
        } catch (BufferOverflowException e) {
            w4 w4Var = new w4(byteBuffer.position(), byteBuffer.limit());
            w4Var.initCause(e);
            throw w4Var;
        }
    }

    public void t(int i10, byte[] bArr) {
        x(i10, 2);
        v(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f47358b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new w4(byteBuffer.position(), byteBuffer.limit());
    }

    public void u(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f47358b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new w4(byteBuffer.position(), byteBuffer.limit());
    }

    public void v(int i10) {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    public void x(int i10, int i11) {
        v((i10 << 3) | i11);
    }

    public void z(long j10) {
        while (((-128) & j10) != 0) {
            u((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        u((int) j10);
    }

    public c(Object obj, int i10) {
        this.f47357a = i10;
        this.f47358b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(byte[] bArr, int i10) {
        this.f47357a = 14;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f47358b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(Set set) {
        this.f47357a = 0;
        this.f47358b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f47358b).put(a.class, bVar.f47356a);
        }
    }

    public c(int i10) {
        this.f47357a = i10;
        switch (i10) {
            case 27:
                return;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f47358b = new ArrayList();
                return;
        }
    }

    public c(LaunchActivity launchActivity, Executor executor, a1 a1Var) {
        this.f47357a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            j0 s10 = launchActivity.s();
            x xVar = (x) new h0(launchActivity).m(x.class);
            this.f47358b = s10;
            xVar.d = executor;
            xVar.e = a1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void m() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void b0(String str) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onError(t81 t81Var, Exception exc) {
    }

    @Override
    public void J(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void j(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
