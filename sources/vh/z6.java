package vh;

import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.wb;
public final class z6 implements r20 {
    public final int f52273a;
    public final o8 f52274b;

    public z6(o8 o8Var, int i10) {
        this.f52273a = i10;
        this.f52274b = o8Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        String str;
        z8 z8Var;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        k7 k7Var;
        int contentHeight;
        float L;
        int i11 = this.f52273a;
        float f7 = 1.0f;
        float f10 = 0.0f;
        m4 m4Var = null;
        int i12 = 0;
        o8 o8Var = this.f52274b;
        switch (i11) {
            case 0:
                z1 z1Var = o8Var.f51676s;
                z1Var.f52256p = ((Float) obj).floatValue();
                z1Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                n5 n5Var = o8Var.K1;
                if (n5Var != null) {
                    org.telegram.messenger.i0.z2(n5Var.f51545g0);
                    o8Var.K1.f51545g0 = bitmap;
                    w6 w6Var = o8Var.f51669q0;
                    if (w6Var != null) {
                        w6Var.T0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                n5 n5Var2 = (n5) obj;
                o8Var.V(n5Var2, false);
                int i13 = o8Var.f51626c;
                th.e5 O1 = wp.r1(i13).O1();
                a0.h hVar = O1.e;
                int i14 = O1.f48918a;
                ArrayList arrayList = O1.h;
                ArrayList arrayList2 = O1.f48922g;
                th.d5 d5Var = new th.d5(O1, n5Var2);
                boolean z14 = n5Var2.f51544g;
                long j10 = d5Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(n5Var2.f51542f), d5Var);
                } else {
                    O1.d(j10, d5Var, O1.f48919b, false);
                }
                O1.d(j10, d5Var, O1.f48920c, true);
                if (j10 != e20.i(i14).f15524n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList2.get(i15)).peer) == j10) {
                                arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i15));
                                z10 = true;
                            } else {
                                i15++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < arrayList.size()) {
                                if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i16)).peer) == j10) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i16));
                                    z10 = true;
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = wp.r1(i14).y1(j10);
                        O1.e0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        O1.R(j10);
                    }
                }
                d5Var.d();
                at.f(i14).k(324, new Object[0]);
                if (n5Var2.f51535c && !n5Var2.f51544g) {
                    wp.r1(i13).O1().f48936w.c(n5Var2);
                }
                if (n5Var2.f51541e1 != 0) {
                    ConnectionsManager.getInstance(n5Var2.f51529a).cancelRequest(n5Var2.f51541e1, true);
                    return;
                }
                return;
            case 3:
                m4 m4Var2 = (m4) obj;
                if (o8Var.C0 != null) {
                    a5 a5Var = o8Var.D0;
                    if (m4Var2 == null) {
                        str = null;
                    } else {
                        str = m4Var2.f51494a;
                    }
                    a5Var.setLink(str);
                    c8 c8Var = o8Var.A0;
                    if (c8Var != null) {
                        n4 n4Var = c8Var.f52143c;
                        if (o8Var.D0.D) {
                            m4Var = o8Var.C0.d;
                        }
                        n4Var.a(m4Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                n5 n5Var3 = o8Var.K1;
                if (n5Var3 != null) {
                    n5Var3.I0 = num.intValue();
                    wp.d1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                th.b bVar = o8Var.f51619a;
                int intValue = ((Integer) obj).intValue() / 3600;
                qa qaVar = new ra(o8Var.f51622b, new mg.u(12)).f29967a;
                WindowManager.LayoutParams layout = qaVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = o8Var.f51672r.getWidth();
                    layout.y = (int) (o8Var.f51672r.getY() + org.telegram.messenger.i0.L(56.0f));
                    ra raVar = qaVar.f29702a;
                    raVar.getWindow().setAttributes(raVar.f29968b);
                }
                qaVar.setTouchable(true);
                new cc(qaVar, bVar).G(2131624020, 3, org.telegram.messenger.i0.R2(dd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.t6.Uc, 0, new y6(o8Var, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (z8Var = o8Var.Z0) != null && z8Var.P) {
                    z8Var.P = false;
                    if (z8Var.E && z8Var.h == null) {
                        z8Var.G = true;
                        t8 t8Var = z8Var.f52275a;
                        if (t8Var != null) {
                            t8Var.A(true);
                        }
                    }
                }
                o8Var.X0.x(2, bool.booleanValue());
                o8Var.Y0.clearAnimation();
                ViewPropertyAnimator animate = o8Var.Y0.animate();
                if (bool.booleanValue()) {
                    f7 = 0.0f;
                }
                a30.l(animate, f7, 120L);
                wb wbVar = wb.f32194w;
                if (wbVar != null && wbVar.f32195a == 2) {
                    wbVar.l();
                    return;
                }
                return;
            case 7:
                o8Var.k();
                o8Var.l();
                o8Var.h((Runnable) obj);
                return;
            case 8:
                r rVar = (r) obj;
                c8 c8Var2 = o8Var.A0;
                o8Var.f51701z0 = rVar;
                c8Var2.o(rVar);
                o8Var.I0.setSelected(rVar);
                t7 t7Var = o8Var.B0;
                if (t7Var != null) {
                    t7Var.recordHevc = !o8Var.A0.j();
                }
                o8Var.G0.setDrawable(new ob0(rVar, false));
                o8Var.b0(o8Var.H0, o8Var.I0.e, true);
                r4 r4Var = o8Var.O0;
                if (o8Var.A0.j()) {
                    f10 = o8Var.A0.getFilledProgress();
                }
                r4Var.e(true, f10);
                m2 m2Var = o8Var.M0;
                if (m2Var != null) {
                    m2Var.setMultipleOnClick(o8Var.A0.j());
                    o8Var.M0.setMaxCount(Math.min(10, r.b() - o8Var.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                o8Var.O = true;
                o8Var.p(true);
                org.telegram.messenger.i0.h3(new mg.g0((r20) obj, 3), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                if (!o8Var.P1 && !o8Var.Q1) {
                    int intValue2 = num2.intValue();
                    o8Var.O1 = intValue2;
                    g5 g5Var = o8Var.f51663o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g5Var.a(z11, true);
                    if (o8Var.O1 == 1 && !o8Var.I0.e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o8Var.h0(z12, true);
                    o8Var.Q0.a(num2.intValue());
                    r4 r4Var2 = o8Var.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    r4Var2.f51852n0 = -1.0f;
                    r4Var2.f51853o0 = z13;
                    r4Var2.invalidate();
                    if (num2.intValue() == -1) {
                        t7 t7Var2 = o8Var.B0;
                        if (t7Var2 != null && t7Var2.isDual()) {
                            o8Var.B0.toggleDual();
                        }
                        p2 p2Var = o8Var.l1;
                        if (p2Var != null) {
                            p2Var.e(true);
                        }
                        p2 p2Var2 = o8Var.f51657m1;
                        if (p2Var2 != null) {
                            p2Var2.e(true);
                        }
                        p2 p2Var3 = o8Var.W0;
                        if (p2Var3 != null) {
                            p2Var3.e(true);
                        }
                        o8Var.A0.o(null);
                        o8Var.A0.e();
                        o8Var.I0.setSelected((r) null);
                        t7 t7Var3 = o8Var.B0;
                        if (t7Var3 != null) {
                            t7Var3.recordHevc = !o8Var.A0.j();
                        }
                    }
                    o8Var.I0.a(false, true);
                    o8Var.l0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                r4 r4Var3 = o8Var.O0;
                r4Var3.f51852n0 = f11.floatValue();
                r4Var3.invalidate();
                r4 r4Var4 = o8Var.O0;
                int i17 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                r4Var4.setVisibility(i10);
                o8Var.O0.setAlpha(Utilities.l(f11.floatValue() + 1.0f));
                d dVar = o8Var.P0;
                if (f11.floatValue() < 0.0f) {
                    i17 = 0;
                }
                dVar.setVisibility(i17);
                o8Var.P0.setAlpha(org.telegram.messenger.i0.z1(f11.floatValue(), 0.0f, -1.0f));
                o8Var.P0.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, org.telegram.messenger.i0.z1(f11.floatValue(), 0.0f, -1.0f)));
                o8Var.P0.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, org.telegram.messenger.i0.z1(f11.floatValue(), 0.0f, -1.0f)));
                o8Var.P0.setTranslationY(org.telegram.messenger.i0.W1(org.telegram.messenger.i0.z1(f11.floatValue(), 0.0f, -1.0f), org.telegram.messenger.i0.L(12.0f), 0));
                if (f11.floatValue() < 0.0f) {
                    o8Var.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                if (o8Var.K1 != null) {
                    e8 e8Var = o8Var.f51628c1;
                    if (!e8Var.N1) {
                        e8Var.clearFocus();
                        if (num3.intValue() == 5) {
                            o8Var.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            o8Var.k0(0, false, true);
                            s7 s7Var = o8Var.f51687v1;
                            if (s7Var != null) {
                                s7Var.f50999v0 = false;
                                s7Var.O0(0);
                                s7Var.A0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            o8Var.k0(0, false, true);
                            s7 s7Var2 = o8Var.f51687v1;
                            if (s7Var2 != null) {
                                s7Var2.O0(2);
                                s7Var2.U1 = true;
                                s7Var2.l0(true);
                                o8Var.f51687v1.f50999v0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            o8Var.t();
                            o8Var.G();
                            s7 s7Var3 = o8Var.f51687v1;
                            if (s7Var3 != null) {
                                s7Var3.O0(1);
                                s7Var3.x0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            o8Var.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            o8Var.k0(3, false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 13:
                Integer num4 = (Integer) obj;
                FrameLayout frameLayout = o8Var.Y0;
                if (frameLayout != null) {
                    if (o8Var.f51640g0 == 2) {
                        L = org.telegram.messenger.i0.L(68.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(64.0f) + (-(org.telegram.messenger.i0.L(12.0f) + o8Var.f51628c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                k7 k7Var2 = o8Var.f51631d1;
                if (k7Var2 != null) {
                    int i18 = -(org.telegram.messenger.i0.L(24.0f) + o8Var.f51628c1.getEditTextHeight());
                    z8 z8Var2 = o8Var.Z0;
                    if (z8Var2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = z8Var2.getContentHeight() - org.telegram.messenger.i0.L(5.0f);
                    }
                    k7Var2.setTranslationY(i18 - contentHeight);
                }
                wb wbVar2 = wb.f32194w;
                if (wbVar2 != null && wbVar2.f32195a == 2) {
                    wbVar2.l();
                }
                if (o8Var.f51628c1.f51365o0 && (k7Var = o8Var.f51631d1) != null) {
                    k7Var.c(false, true);
                    return;
                }
                return;
            case 14:
                u6 u6Var = (u6) obj;
                n5 n5Var4 = o8Var.K1;
                if (n5Var4 != null) {
                    n5Var4.E0 = u6Var;
                }
                ArrayList arrayList3 = o8Var.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i12 < size) {
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        ((n5) obj2).E0 = u6Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                n5 n5Var5 = o8Var.K1;
                if (n5Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    n5Var5.f51572v0 = inputPeer;
                    ArrayList arrayList4 = o8Var.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i12 < size2) {
                            Object obj3 = arrayList4.get(i12);
                            i12++;
                            ((n5) obj3).f51572v0 = o8Var.K1.f51572v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                n5 n5Var6 = o8Var.K1;
                if (n5Var6 != null) {
                    n5Var6.f51574w0 = hashSet;
                    ArrayList arrayList5 = o8Var.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i12 < size3) {
                            Object obj4 = arrayList5.get(i12);
                            i12++;
                            ((n5) obj4).f51574w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                n5 n5Var7 = o8Var.K1;
                if (n5Var7 != null) {
                    Bitmap bitmap3 = n5Var7.f51545g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    o8Var.K1.f51545g0 = bitmap2;
                    w6 w6Var2 = o8Var.f51669q0;
                    if (w6Var2 != null) {
                        w6Var2.T0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                o8Var.f51698y0 = (u6) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                g5 g5Var2 = o8Var.f51663o0;
                o8Var.f51694x0 = inputPeer2;
                g5Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                g5 g5Var3 = o8Var.f51663o0;
                o8Var.f51694x0 = inputPeer3;
                g5Var3.set(inputPeer3);
                return;
            default:
                z1 z1Var2 = o8Var.f51676s;
                float floatValue = ((Float) obj).floatValue();
                z1Var2.f52255o = floatValue;
                z1Var2.f52254n = z1.f(floatValue);
                z1Var2.g();
                return;
        }
    }
}
