package ph;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.r5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vp;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yv0;
import rh.e6;
import th.o7;
import vh.f5;
import vh.k4;
import vh.k7;
import vh.m5;
import vh.n5;
import vh.o8;
import vh.s7;
import vh.t5;
public final class h1 implements q20 {
    public final int f45087a;
    public final Object f45088b;

    public h1(Object obj, int i10) {
        this.f45087a = i10;
        this.f45088b = obj;
    }

    @Override
    public final void a(Object obj) {
        String K;
        String str;
        String str2;
        boolean z10;
        int i10;
        float f7;
        TLRPC.User user = null;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        switch (this.f45087a) {
            case 0:
                Boolean bool = (Boolean) obj;
                ((i1) this.f45088b).a();
                return;
            case 1:
                ((r3) this.f45088b).i0(((Boolean) obj).booleanValue());
                return;
            case 2:
                ((Boolean) obj).getClass();
                l3 l3Var = ((p3) this.f45088b).d;
                if (l3Var != null) {
                    l3Var.run();
                    return;
                }
                return;
            case 3:
                mg.p.j(((g4) this.f45088b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 4:
                qh.r rVar = (qh.r) this.f45088b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (rVar.D == null) {
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                        rVar.D = tL_messages_stickerSet;
                    } else {
                        rVar.F = true;
                    }
                    rVar.e();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f45088b;
                Long l4 = (Long) obj;
                if (!k2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        k2Var.presentFragment(ProfileActivity.z4(l4.longValue()), true);
                        return;
                    } else {
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(29));
                        return;
                    }
                }
                return;
            case 6:
                qh.m0 m0Var = (qh.m0) this.f45088b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                qh.x0 x0Var = m0Var.f45688b;
                if (!m0Var.E && tL_exportedContactToken != null) {
                    m0Var.f45692r = tL_exportedContactToken;
                    m0Var.f45693s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = m0Var.f45689c.f45673b;
                    if (!TextUtils.equals(x0Var.f45848f, str4) || x0Var.h) {
                        x0Var.f45848f = str4;
                        x0Var.h = false;
                        x0Var.H5 = null;
                        x0Var.I5 = 0;
                    }
                    if (!TextUtils.equals(x0Var.d, str3)) {
                        x0Var.d = str3;
                        Utilities.e.c(new org.telegram.utils.twidget.h0(str3, new qh.o0(x0Var, str3, 0)));
                    }
                    x0Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            case 7:
                qh.x0 x0Var2 = (qh.x0) this.f45088b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    x0Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        x0Var2.f45953p8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                x0Var2.invalidate();
                return;
            case 8:
                rh.b0 b0Var = (rh.b0) this.f45088b;
                int i13 = rh.b0.f46657p2[((Integer) obj).intValue()];
                if (b0Var.f46663g2 != i13) {
                    b0Var.f46663g2 = i13;
                    b0Var.Y1.setText(cd.G(i13 / 3600, "GiftOfferHours", new Object[0]));
                }
                b0Var.e1(true);
                return;
            case 9:
                rh.t0 t0Var = (rh.t0) this.f45088b;
                Integer num = (Integer) obj;
                t0Var.a2.g();
                t0Var.f47472c2.O(true);
                return;
            case 10:
                rh.n2 n2Var = (rh.n2) this.f45088b;
                n2Var.getClass();
                n2Var.f47230s = new Matrix();
                n2Var.f47231w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                n2Var.f47229r = bitmapShader;
                Paint paint = n2Var.f47226c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 11:
                e6.a((e6) this.f45088b, (TL_stars.StarGifts) obj);
                return;
            case 12:
                ((org.telegram.ui.ActionBar.z2) this.f45088b).a(((Boolean) obj).booleanValue());
                return;
            case 13:
                TextView textView = (TextView) this.f45088b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str = cd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = cd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + cd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        return;
                    }
                    int i14 = starGift.availability_remains;
                    if (i14 <= 0) {
                        K = cd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        K = cd.K("Gift2Availability4Value", i14, ',', cd.E(starGift.availability_total, ','));
                    }
                    textView.setText(K);
                    return;
                }
                return;
            case 14:
                th.s0 s0Var = (th.s0) this.f45088b;
                if (((Boolean) obj).booleanValue() && !s0Var.f49427x) {
                    s0Var.f49423n = true;
                    s0Var.I = true;
                    s0Var.u(false);
                    th.s0.W = s0Var;
                    s0Var.J = NativeInstance.createVideoCapturer(s0Var.H, s0Var.I ? 1 : 0);
                    if (s0Var.E != null) {
                        r5 r5Var = Utilities.e;
                        NativeInstance nativeInstance = s0Var.E;
                        Objects.requireNonNull(nativeInstance);
                        r5Var.c(new org.telegram.messenger.voip.v0(nativeInstance, 3));
                        s0Var.M.clear();
                        s0Var.E = null;
                    }
                    s0Var.c();
                    s0Var.k();
                    zs.f(s0Var.e).k(176, Long.valueOf(s0Var.f49422f.f19810id));
                    return;
                }
                return;
            case 15:
                o7 o7Var = (o7) this.f45088b;
                Boolean bool2 = (Boolean) obj;
                o7Var.f49315k1 = false;
                o7Var.d0();
                return;
            case 16:
                th.y3 y3Var = (th.y3) obj;
                th.f4 f4Var = ((th.c4) this.f45088b).e;
                while (true) {
                    ArrayList arrayList2 = f4Var.G;
                    if (i11 < arrayList2.size()) {
                        if (y3Var != arrayList2.get(i11)) {
                            ((th.y3) arrayList2.get(i11)).getClass();
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            case 17:
                th.e6 e6Var = (th.e6) this.f45088b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                e6Var.f48939p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    e6Var.f48936m = true;
                    e6Var.f48935l = str2;
                    e6Var.f48930f = TextUtils.isEmpty(str2);
                    View view = e6Var.f48941r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = e6Var.f48942s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                uh.m mVar = (uh.m) this.f45088b;
                String str5 = (String) obj;
                ArrayList arrayList3 = mVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    mVar.i(true);
                }
                org.telegram.messenger.i0.h3(new th.o0(27, mVar, str5), 120L);
                return;
            case 19:
                ((vh.k) this.f45088b).x(((Integer) obj).intValue());
                return;
            case 20:
                vh.x xVar = (vh.x) this.f45088b;
                xVar.f52134j0.f52081n.P = ((Float) obj).floatValue();
                vh.w wVar = xVar.f52134j0;
                kg.j2 j2Var = wVar.d;
                if (j2Var != null) {
                    j2Var.setVolume(wVar.f52081n.P);
                    return;
                }
                return;
            case 21:
                vh.k0 k0Var = (vh.k0) this.f45088b;
                x20 x20Var = (x20) obj;
                jj jjVar = k0Var.f51369c;
                if (jjVar != null) {
                    jjVar.f16356p0 = x20Var;
                    MediaController.B().h0(k0Var.f51369c, false, true, false);
                    return;
                }
                return;
            case 22:
                vh.z1 z1Var = (vh.z1) this.f45088b;
                z1Var.h(-1.0f);
                org.telegram.messenger.i0.h3(new vh.d1(1, z1Var, (Runnable) obj), 80L);
                return;
            case 23:
                ((vh.k2) this.f45088b).f51395s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.i0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.f20561w).start();
                return;
            case 24:
                vh.y2 y2Var = (vh.y2) this.f45088b;
                View view2 = (View) obj;
                ii iiVar = y2Var.f52192b;
                if (view2 instanceof vh.x2) {
                    iiVar.getClass();
                    int R = RecyclerView.R(view2);
                    a51 G = iiVar.f30819f3.G(R);
                    if (G != null) {
                        vh.x2 x2Var = (vh.x2) view2;
                        x2Var.setPosition(y2Var.b(R));
                        if (y2Var.f52194f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x2Var.b(z10, true);
                        boolean contains = y2Var.e.contains(Integer.valueOf(G.d));
                        if (x2Var.h != contains) {
                            x2Var.h = contains;
                            x2Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ii iiVar2 = (ii) this.f45088b;
                View view3 = (View) obj;
                if (view3 instanceof vh.x2) {
                    k7 k7Var = (k7) iiVar2.f26982n3;
                    k7Var.f52192b.getClass();
                    ((vh.x2) view3).setPosition(k7Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 26:
                s7 s7Var = (s7) ((vh.b4) this.f45088b);
                o8 o8Var = s7Var.f51935j2;
                o8Var.X0.p((jj) obj);
                n5 n5Var = o8Var.K1;
                if (n5Var != null && o8Var.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(n5Var.f51562y);
                    boolean z12 = !isEmpty;
                    ((kf0) o8Var.f51635j1.f11064c).a(!o8Var.X0.k(), false);
                    o8Var.f51635j1.setVisibility(0);
                    ViewPropertyAnimator animate = o8Var.f51635j1.animate();
                    if (!isEmpty) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).withEndAction(new yv0(14, s7Var, z12)).start();
                }
                if (o8Var.A0.j()) {
                    ArrayList arrayList4 = o8Var.A0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList4.get(i12);
                            i12++;
                            n5 n5Var2 = ((vh.w) obj2).f52081n;
                            if (n5Var2 != null && n5Var2.K) {
                                if (!TextUtils.isEmpty(o8Var.K1.f51562y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                o8Var.k0(i10, true, true);
                return;
            case 27:
                m5 m5Var = (m5) obj;
                k61 k61Var = ((k4) this.f45088b).f51417n;
                if (k61Var != null) {
                    k61Var.setHDRInfo(m5Var);
                    return;
                }
                return;
            case 28:
                f5 f5Var = (f5) this.f45088b;
                Long l10 = (Long) obj;
                f5Var.f51159w2 = false;
                if (l10 != null) {
                    user = vp.r1(f5Var.f21583a).Z1(l10);
                }
                f5Var.f51158v2 = user;
                if (user == null) {
                    z11 = true;
                }
                f5Var.f51160x2 = z11;
                if (user != null) {
                    f5Var.g1();
                    return;
                }
                return;
            default:
                t5 t5Var = (t5) this.f45088b;
                jg.s0 s0Var2 = (jg.s0) obj;
                if (s0Var2 == null) {
                    t5Var.e1();
                    return;
                }
                t5Var.f51970g2 = s0Var2.e;
                t5Var.f51969f2 = s0Var2.f10209f;
                return;
        }
    }
}
