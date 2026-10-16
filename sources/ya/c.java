package ya;

import a0.h;
import a8.e;
import a8.g;
import ad.l;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.biometric.g0;
import androidx.fragment.app.i0;
import androidx.lifecycle.a0;
import b5.p;
import bi.ob;
import bi.pb;
import bi.r4;
import bi.s5;
import bi.t5;
import c6.d0;
import c6.e0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.a7;
import di.ac;
import di.i6;
import di.k8;
import di.kc;
import di.l0;
import di.mb;
import di.oc;
import di.yb;
import e2.j;
import e2.m0;
import e2.x;
import g6.f;
import g6.i;
import g6.q;
import g6.r;
import hg.j1;
import hg.z1;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.regex.Pattern;
import ji.d2;
import ji.h1;
import ji.h2;
import ji.j0;
import ji.k3;
import ji.l4;
import ji.r3;
import ji.u3;
import ji.v3;
import ji.w3;
import ji.x3;
import ji.z;
import l.k;
import l.w;
import m.t3;
import mg.o;
import oa.d;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.p71;
import org.telegram.ui.r01;
import org.telegram.ui.xz0;
import v7.f7;
import v7.u6;
import z3.m;
import z3.n;
public final class c implements s, p71, a0, androidx.activity.result.b, p, ob, OnCompleteListener, o, oc, f6.a, w, gb.p, z1, n, ti, j0, v3 {
    public static volatile c f48729c;
    public final int f48730a;
    public final Object f48731b;

    public c(r rVar, String[] strArr) {
        this.f48730a = 20;
        this.f48731b = strArr;
    }

    @Override
    public void A() {
        ((l0) this.f48731b).e.invalidate();
    }

    public float A0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        ec.b bVar = (ec.b) this.f48731b;
        float z02 = z0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f8703a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f7 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f8704b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (z0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + z02) - 1.0f;
    }

    @Override
    public void B(float f7, int i10) {
        ArrayList arrayList;
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) a7Var.d.T.get(i10)).P = f7;
        }
    }

    @Override
    public void C0() {
        z zVar = (z) this.f48731b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            ji.a aVar = zVar.f13123a;
            x3 x3Var = r3Var.f13500a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f13630f3.onContentChanged();
        }
    }

    @Override
    public void D(float f7) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.P = f7;
        a7Var.c();
    }

    @Override
    public void E(float f7, boolean z10) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var != null) {
            k8Var.Z = f7;
            k8Var.f7195j = true;
            i81 i81Var = a7Var.e;
            if (i81Var != null && i81Var.p() != -9223372036854775807L) {
                a7Var.m(f7 * ((float) a7Var.e.p()));
            }
        }
    }

    @Override
    public boolean E0(int i10) {
        return true;
    }

    @Override
    public boolean G0(long j10, int i10, int i11, int i12, pb pbVar) {
        ImageReceiver imageReceiver;
        t5 t5Var;
        t5 t5Var2;
        t5 t5Var3;
        t5 t5Var4;
        pbVar.f3485b = null;
        pbVar.f3486c = null;
        xz0 xz0Var = (xz0) this.f48731b;
        r01 r01Var = xz0Var.h;
        ArrayList arrayList = xz0Var.f32536w;
        if (xz0Var.N < 0.2f) {
            pbVar.f3485b = r01Var.getImageReceiver();
            pbVar.f3486c = null;
            pbVar.f3484a = r01Var;
            pbVar.h = 0.0f;
            pbVar.f3489i = AndroidUtilities.displaySize.y;
            pbVar.f3488g = (View) xz0Var.getParent();
            pbVar.d = xz0Var.f32538y;
            pbVar.f3494n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                t5 t5Var5 = (t5) arrayList.get(i13);
                if (t5Var5.e >= 1.0f && t5Var5.f3741a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        t5Var3 = (t5) arrayList.get(i14);
                    } else {
                        t5Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        t5Var4 = (t5) arrayList.get(i15);
                    } else {
                        t5Var4 = null;
                    }
                    t5 d = ProfileStoriesView.d(t5Var3, t5Var4, t5Var5);
                    imageReceiver = t5Var5.f3742b;
                    t5Var2 = d;
                    t5Var = t5Var5;
                } else {
                    i13++;
                }
            } else {
                imageReceiver = null;
                t5Var = null;
                t5Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        pbVar.f3486c = imageReceiver;
        pbVar.f3485b = null;
        pbVar.f3484a = xz0Var;
        pbVar.h = 0.0f;
        pbVar.f3489i = AndroidUtilities.displaySize.y;
        pbVar.f3488g = (View) xz0Var.getParent();
        if (t5Var != null && t5Var2 != null) {
            pbVar.f3487f = new s5(this, new RectF(t5Var.f3750m), t5Var, new RectF(t5Var2.f3750m), t5Var2);
            return true;
        }
        pbVar.f3487f = null;
        return true;
    }

    @Override
    public String[] H() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f48731b).getSupportedFeatures();
    }

    @Override
    public h K() {
        return null;
    }

    @Override
    public void L(ji.a aVar) {
        d2 d2Var = (d2) this.f48731b;
        if (aVar != null && (aVar.f13107b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(d2Var)) {
            vi viVar = new vi(d2Var.getParentActivity(), d2Var, false, false, false, d2Var.getResourceProvider());
            viVar.f29664c2 = new d(12);
            viVar.P = true;
            viVar.A1.setVisibility(8);
            viVar.f29727w2 = new androidx.car.app.utils.a(d2Var, aVar, viVar, 11);
            viVar.t1();
            viVar.show();
        }
    }

    @Override
    public void M(long j10) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f7211r0 = j10;
        k8Var.f7195j = true;
        a7Var.y(true);
    }

    @Override
    public void N(boolean z10) {
        rg.d2 d2Var;
        kc kcVar = ((yb) ((a7) this.f48731b)).C0;
        mb mbVar = kcVar.f7305v1;
        if (mbVar != null) {
            rg.d2 d2Var2 = null;
            if (!z10 && (mbVar.getSelectedEntity() instanceof rg.d2)) {
                kcVar.f7305v1.C0(null, true);
            } else if (z10 && !(kcVar.f7305v1.getSelectedEntity() instanceof rg.d2)) {
                i6 i6Var = kcVar.f7305v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < i6Var.getChildCount()) {
                        View childAt = i6Var.getChildAt(i11);
                        if (childAt instanceof rg.d2) {
                            d2Var = (rg.d2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        d2Var = null;
                        break;
                    }
                }
                if (d2Var != null) {
                    mb mbVar2 = kcVar.f7305v1;
                    i6 i6Var2 = mbVar2.R0;
                    while (true) {
                        if (i10 >= i6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = i6Var2.getChildAt(i10);
                        if (childAt2 instanceof rg.d2) {
                            d2Var2 = (rg.d2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    mbVar2.C0(d2Var2, true);
                }
            }
        }
    }

    @Override
    public void O(float f7, int i10) {
        ArrayList arrayList;
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) a7Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void O0(ArrayList arrayList) {
        j1 j1Var = (j1) this.f48731b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.f10618c0, j1Var.f10619d0, j1Var.f10616b0, j1Var.f10615a0);
        }
    }

    @Override
    public void P(float f7) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.F = f7;
        k8Var.f7195j = true;
        a7Var.w(true);
    }

    @Override
    public void Q() {
        d2 d2Var = (d2) this.f48731b;
        int i10 = 0;
        d2.Z(d2Var, false, true);
        int i11 = d2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        d2Var.x0(i10, true);
    }

    @Override
    public l80 R(View view) {
        return l80.H((d2) this.f48731b, view);
    }

    @Override
    public void R0() {
        z zVar = (z) this.f48731b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            ji.a aVar = zVar.f13123a;
            x3.P1(r3Var.f13500a);
        }
    }

    @Override
    public void S(float f7) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.E = f7;
        k8Var.f7195j = true;
        a7Var.w(true);
    }

    @Override
    public void T() {
        d2 d2Var = (d2) this.f48731b;
        d2Var.z0();
        d2Var.C0();
    }

    @Override
    public o9 W() {
        r3 r3Var = ((z) this.f48731b).O;
        if (r3Var != null) {
            return r3Var.f13500a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public int X() {
        return 2;
    }

    @Override
    public void Y(float f7, int i10) {
        ArrayList arrayList;
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) a7Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void Z(float f7) {
        k8 k8Var = ((a7) this.f48731b).d;
        if (k8Var == null) {
            return;
        }
        k8Var.f7176a0 = f7;
        k8Var.f7195j = true;
    }

    @Override
    public void a(h1 h1Var) {
        r3 r3Var = ((z) this.f48731b).O;
        if (r3Var != null) {
            x3 x3Var = r3Var.f13500a;
            x3.N1(x3Var, h1Var);
            x3Var.f13630f3.V(h1Var, true);
        }
    }

    @Override
    public void a0(CharSequence charSequence) {
        r3 r3Var = ((z) this.f48731b).O;
        if (r3Var != null) {
            r3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                r3Var.f13500a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f48730a;
        Object obj3 = this.f48731b;
        switch (i10) {
            case 1:
                e eVar = new e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = a8.a.f312a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) obj3).writeToParcel(obtain, 0);
                ((a8.c) ((g) obj).u()).F0(obtain, 2);
                return;
            case 10:
                g6.w wVar = (g6.w) obj;
                f fVar = (f) wVar.u();
                d0 d0Var = ((e0) obj3).f4468k;
                Parcel N0 = fVar.N0();
                v.d(N0, d0Var);
                fVar.S0(N0, 18);
                f fVar2 = (f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 20:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((g6.s) obj).u();
                Parcel N02 = iVar.N0();
                v.d(N02, qVar);
                N02.writeStringArray((String[]) obj3);
                iVar.S0(N02, 5);
                return;
            default:
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.f43067a;
                obtain2.writeStrongBinder(fVar3);
                q7.a.b(obtain2, (GetCredentialRequest) obj3);
                q7.a.b(obtain2, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).F0(obtain2, 1);
                return;
        }
    }

    @Override
    public boolean c(float f7) {
        boolean z10;
        int[] iArr;
        d2 d2Var = (d2) this.f48731b;
        FrameLayout frameLayout = d2Var.f13227v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= iArr[1]) {
                z10 = true;
                d2.Z(d2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        d2.Z(d2Var, z10, true);
        return z10;
    }

    @Override
    public void c0() {
        ((a7) this.f48731b).q(null);
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) androidx.activity.result.c.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f48731b).createWebView(webView));
    }

    @Override
    public void d(k kVar, boolean z10) {
        ((g.r) this.f48731b).g(kVar);
    }

    @Override
    public void e(int i10) {
        di.e0 e0Var = ((a7) this.f48731b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                di.d0 d0Var = (di.d0) obj;
                if (d0Var.f6768a == i10) {
                    d0Var.f6769b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void e0(float f7) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f7215t0 = f7;
        k8Var.f7195j = true;
        a7Var.y(true);
    }

    @Override
    public void f(int i10) {
        ((j1) this.f48731b).l();
    }

    @Override
    public void f0(int i10, long j10) {
        ArrayList arrayList;
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) a7Var.d.T.get(i10)).X = j10;
        }
    }

    @Override
    public void g(float f7) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f7217u0 = f7;
        k8Var.f7195j = true;
        a7Var.c();
    }

    @Override
    public n9 g0() {
        return (z) this.f48731b;
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) androidx.activity.result.c.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f48731b).getStatics());
    }

    @Override
    public void h() {
        z zVar = (z) this.f48731b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            x3.Q1(r3Var.f13500a, zVar.f13123a);
        }
    }

    @Override
    public void i(u3 u3Var, View view) {
        d2 d2Var = (d2) this.f48731b;
        l80 H = l80.H(d2Var, view);
        H.Q = true;
        d2Var.f13231x0 = l4.c(H, d2Var, d2Var.getParentActivity(), d2Var.getResourceProvider(), u3Var, false);
    }

    @Override
    public void i0(ji.i6 i6Var, String str) {
        d2 d2Var = (d2) this.f48731b;
        if (d2Var.f13234z0 == null) {
            d2Var.f13234z0 = new t3(new f1.a(this, 24), d2Var.getResourceProvider());
        }
        d2Var.f13234z0.f(i6Var, str);
    }

    @Override
    public Object i2() {
        Type type = (Type) this.f48731b;
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
    public void j(Object obj) {
        int i10;
        Bundle extras;
        switch (this.f48730a) {
            case 5:
                Map map = (Map) obj;
                i0 i0Var = (i0) this.f48731b;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((Boolean) arrayList.get(i11)).booleanValue()) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    iArr[i11] = i10;
                }
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = e0Var.f1563a;
                if (i0Var.f1577c.f(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f48731b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f1065b;
                int i12 = u.e("ProxyBillingActivityV2", intent).f4384a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i12, extras);
                }
                int i13 = aVar.f1064a;
                if (i13 != -1 || i12 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i13 + " and billing's responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public ji.a j0() {
        return ((z) this.f48731b).f13123a;
    }

    @Override
    public void k(float f7) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.G = f7;
        k8Var.f7195j = true;
        a7Var.c();
    }

    @Override
    public h k0() {
        return null;
    }

    @Override
    public void l(w3 w3Var, View view) {
        d2 d2Var = (d2) this.f48731b;
        l80 H = l80.H(d2Var, view);
        H.Q = true;
        d2Var.getParentActivity();
        d2Var.getResourceProvider();
        d2Var.f13231x0 = l4.b(H, d2Var, w3Var, false);
    }

    @Override
    public void l0(long j10) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.D = j10;
        k8Var.f7195j = true;
        a7Var.w(true);
    }

    @Override
    public void m(int i10) {
        ((d2) this.f48731b).o0(74, i10);
    }

    @Override
    public void m0(byte[] bArr, int i10, int i11, m mVar, j jVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        x xVar = (x) this.f48731b;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            if (xVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.f("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i12 = m10 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u6.f("Incomplete vtt cue box header found.", z11);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i13 = m11 - 8;
                    byte[] bArr2 = xVar.f8414a;
                    int i14 = xVar.f8415b;
                    String str = m0.f8375a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    xVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (m12 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f6279a = charSequence;
                    aVar.f6280b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.f11314a;
                    i4.g gVar2 = new i4.g();
                    gVar2.f11308c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new z3.b(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public void n(long j10, boolean z10) {
        a7 a7Var = (a7) this.f48731b;
        if (!z10) {
            a7Var.m(j10);
            return;
        }
        i81 i81Var = a7Var.e;
        if (i81Var != null) {
            i81Var.L(j10, true);
        } else if (a7Var.j()) {
            a7Var.E.m(j10, true);
        } else {
            i81 i81Var2 = a7Var.f6628y;
            if (i81Var2 != null) {
                i81Var2.L(j10, false);
            }
        }
    }

    @Override
    public void n0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        g0 g0Var = (g0) this.f48731b;
        Handler handler = g0Var.A0;
        androidx.activity.i iVar = g0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = g0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override
    public void o() {
        int i10;
        d2 d2Var = (d2) this.f48731b;
        k3 k3Var = d2Var.P.f13642l3;
        if (k3Var != null && k3Var.x() && d2Var.P.D4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        d2Var.x0(i10, true);
        d2Var.y0();
        d2Var.w0();
    }

    public float o0(jc.c cVar, jc.c cVar2) {
        int i10 = (int) cVar.f6487b;
        int i11 = (int) cVar2.f6487b;
        float A0 = A0((int) cVar.f6486a, i10, (int) cVar2.f6486a, i11);
        float A02 = A0((int) cVar2.f6486a, i11, (int) cVar.f6486a, i10);
        if (Float.isNaN(A0)) {
            return A02 / 7.0f;
        }
        if (Float.isNaN(A02)) {
            return A0 / 7.0f;
        }
        return (A0 + A02) / 14.0f;
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f48731b).f6414c, "joinApplication", task);
    }

    @Override
    public void onContentChanged() {
        d2 d2Var = (d2) this.f48731b;
        if (d2Var.f13233y0 != null) {
            boolean n32 = d2Var.P.n3();
            d2Var.L0 = n32;
            d2Var.f13233y0.h(n32);
            d2Var.f13233y0.invalidate();
        }
        d2Var.C0();
        Runnable runnable = d2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void p(long j10, int i10, r4 r4Var) {
        int i11 = ProfileStoriesView.f32511s0;
        ((xz0) this.f48731b).f(true, false);
        r4Var.run();
    }

    @Override
    public boolean p0() {
        z zVar = (z) this.f48731b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            ji.a aVar = zVar.f13123a;
            if (r3Var.f13500a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean q(k kVar) {
        Window.Callback callback = ((g.r) this.f48731b).f9803f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    public void q0() {
        ArrayList arrayList = (ArrayList) this.f48731b;
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
                    l.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    @Override
    public void r() {
        a7 a7Var = (a7) this.f48731b;
        a7Var.s(null, null, true);
        kc kcVar = ((yb) a7Var).C0;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.s(null, null, true);
        }
        mb mbVar = kcVar.f7305v1;
        if (mbVar != null) {
            mbVar.p0();
        }
        ac acVar = kcVar.f7246c1;
        if (acVar != null) {
            acVar.setHasRoundVideo(false);
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null) {
            File file = k8Var.f7205o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.K1.f7205o0 = null;
            }
            if (kcVar.K1.f7207p0 != null) {
                try {
                    new File(kcVar.K1.f7207p0).delete();
                } catch (Exception unused2) {
                }
                kcVar.K1.f7207p0 = null;
            }
        }
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public void s(float f7) {
        a7 a7Var = (a7) this.f48731b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f7213s0 = f7;
        k8Var.f7195j = true;
        a7Var.y(true);
    }

    @Override
    public void t(Bitmap bitmap) {
        g6.b bVar = f6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a1.g.B(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (B - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, B, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.h) this.f48731b).e(bitmap2, 0);
    }

    @Override
    public void t0(int i10, int i11) {
        z zVar = (z) this.f48731b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            ji.a aVar = zVar.f13123a;
            h2 h2Var = r3Var.f13500a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void u() {
        d2 d2Var = (d2) this.f48731b;
        d2Var.I0 = d2Var.K0;
        d2.Z(d2Var, false, false);
        d2Var.x0(2, true);
    }

    public int u0(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        gc.a aVar = (gc.a) this.f48731b;
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
                int i17 = aVar.f10082a[aVar.f10086g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            gc.a aVar2 = gc.a.h;
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
            gc.b bVar = new gc.b(aVar, iArr5);
            gc.b a2 = aVar.a(i10, 1);
            gc.b bVar2 = aVar.f10084c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            gc.b bVar3 = aVar.d;
            gc.b bVar4 = a2;
            gc.b bVar5 = bVar;
            gc.b bVar6 = bVar4;
            gc.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    gc.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    gc.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        gc.b bVar9 = bVar5;
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
                gc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                gc.b bVar10 = bVarArr[0];
                gc.b bVar11 = bVarArr[1];
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
                    if (aVar.f10086g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f10083b[i26];
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
    public void v(hh hhVar) {
        NotificationCenter.getInstance(ig.m.a0((ig.m) this.f48731b)).doOnIdle(hhVar);
    }

    public synchronized void v0() {
        ((SharedPreferences) this.f48731b).edit().clear().commit();
    }

    @Override
    public boolean w() {
        return false;
    }

    public jc.a w0(float f7, float f10, int i10, int i11) {
        int i12;
        jc.a b10;
        jc.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        ec.b bVar = (ec.b) this.f48731b;
        int min = Math.min(bVar.f8703a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f8704b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                ec.b bVar2 = (ec.b) this.f48731b;
                jc.b bVar3 = new jc.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.e;
                int i15 = bVar3.f12962c;
                int i16 = i14 + i15;
                int i17 = bVar3.f12963f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f12961b;
                if (!arrayList.isEmpty()) {
                    return (jc.a) arrayList.get(0);
                }
                throw dc.e.a();
            }
            throw dc.e.a();
        }
        throw dc.e.a();
    }

    @Override
    public z3.e x(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    public Set x0() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f48731b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f48731b);
        }
        return unmodifiableSet;
    }

    @Override
    public void y(boolean z10) {
        a7 a7Var = (a7) this.f48731b;
        if (a7Var.j()) {
            a7Var.E.getClass();
        }
        a7Var.x(-4, z10);
    }

    public boolean y0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.f48731b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    public float z0(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        c cVar;
        int i22;
        boolean z12 = true;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i23 = 2;
        int i24 = (-abs) / 2;
        int i25 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i25 = 1;
        }
        int i26 = i16 + i18;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 != i26) {
                if (z10) {
                    i20 = i28;
                } else {
                    i20 = i27;
                }
                if (z10) {
                    i21 = i27;
                } else {
                    i21 = i28;
                }
                boolean z13 = z10;
                if (i29 == z12) {
                    z11 = z12;
                    i22 = abs;
                    cVar = this;
                } else {
                    z11 = false;
                    cVar = this;
                    i22 = abs;
                }
                if (z11 == ((ec.b) cVar.f48731b).b(i20, i21)) {
                    if (i29 == 2) {
                        return f7.b(i27, i28, i14, i15);
                    }
                    i29++;
                }
                i24 += abs2;
                if (i24 > 0) {
                    if (i28 == i17) {
                        i19 = 2;
                        break;
                    }
                    i28 += i25;
                    i24 -= i22;
                }
                i27 += i18;
                abs = i22;
                z10 = z13;
                z12 = true;
                i23 = 2;
            } else {
                i19 = i23;
                break;
            }
        }
        if (i29 == i19) {
            return f7.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    public c(Object obj, int i10) {
        this.f48730a = i10;
        this.f48731b = obj;
    }

    public c(int i10) {
        this.f48730a = i10;
        switch (i10) {
            case 2:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f48731b = new ArrayList();
                return;
            case 6:
                this.f48731b = new LinkedHashMap(0, 0.75f, true);
                return;
            case 25:
                this.f48731b = new x();
                return;
            default:
                this.f48731b = new HashSet();
                return;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.f48730a = 12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f48731b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                v0();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    @Override
    public void C() {
    }

    @Override
    public void F() {
    }

    @Override
    public void h0() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void z() {
    }

    @Override
    public void G(int i10) {
    }

    @Override
    public void I(boolean z10) {
    }

    @Override
    public void J(Object obj) {
    }

    @Override
    public void U(TLRPC.User user) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void d0(boolean z10) {
    }

    @Override
    public void V(h1 h1Var, boolean z10) {
    }

    @Override
    public void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
