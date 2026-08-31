package qh;

import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.qc;
public final class h8 implements Utilities.Callback {
    public final int f45384a;
    public final ca f45385b;

    public h8(ca caVar, int i10) {
        this.f45384a = i10;
        this.f45385b = caVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        String str;
        float f10;
        ma maVar;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        u8 u8Var;
        int contentHeight;
        float dp;
        switch (this.f45384a) {
            case 0:
                d2 d2Var = this.f45385b.f45132s;
                d2Var.f45194p = ((Float) obj).floatValue();
                d2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                ca caVar = this.f45385b;
                s6 s6Var = caVar.H1;
                if (s6Var != null) {
                    AndroidUtilities.recycleBitmap(s6Var.f46058g0);
                    caVar.H1.f46058g0 = bitmap;
                    d8 d8Var = caVar.f45116n0;
                    if (d8Var != null) {
                        d8Var.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                s6 s6Var2 = (s6) obj;
                ca caVar2 = this.f45385b;
                caVar2.W(s6Var2, false);
                int i11 = caVar2.f45081c;
                oh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.h hVar = storiesController.f17773e;
                int i12 = storiesController.f17770a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f17775g;
                oh.s6 s6Var3 = new oh.s6(storiesController, s6Var2);
                boolean z13 = s6Var2.f46057g;
                long j10 = s6Var3.G;
                if (z13) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(s6Var2.f46055f), s6Var3);
                } else {
                    storiesController.d(j10, s6Var3, storiesController.f17771b, false);
                }
                storiesController.d(j10, s6Var3, storiesController.f17772c, true);
                if (j10 != UserConfig.getInstance(i12).clientUserId) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList2.size()) {
                            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i13)).peer) == j10) {
                                arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i13));
                                z4 = true;
                            } else {
                                i13++;
                            }
                        } else {
                            z4 = false;
                        }
                    }
                    if (!z4) {
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList.size()) {
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer) == j10) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i14));
                                    z4 = true;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    if (!z4) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = MessagesController.getInstance(i12).getPeer(j10);
                        storiesController.b0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.O(j10);
                    }
                }
                s6Var3.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (s6Var2.f46047c && !s6Var2.f46057g) {
                    MessagesController.getInstance(i11).getStoriesController().f17789w.c(s6Var2);
                }
                if (s6Var2.f46054e1 != 0) {
                    ConnectionsManager.getInstance(s6Var2.f46041a).cancelRequest(s6Var2.f46054e1, true);
                    return;
                }
                return;
            case 3:
                l5 l5Var = (l5) obj;
                ca caVar3 = this.f45385b;
                if (caVar3.f45157z0 != null) {
                    b6 b6Var = caVar3.A0;
                    l5 l5Var2 = null;
                    if (l5Var == null) {
                        str = null;
                    } else {
                        str = l5Var.f45625a;
                    }
                    b6Var.setLink(str);
                    p9 p9Var = caVar3.f45150x0;
                    if (p9Var != null) {
                        m5 m5Var = p9Var.f46316c;
                        if (caVar3.A0.f45004y) {
                            l5Var2 = caVar3.f45157z0.d;
                        }
                        m5Var.a(l5Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                s6 s6Var4 = this.f45385b.H1;
                if (s6Var4 != null) {
                    s6Var4.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                ca caVar4 = this.f45385b;
                oh.b bVar = caVar4.f45074a;
                int intValue = ((Integer) obj).intValue() / 3600;
                bb bbVar = new cb(caVar4.f45077b, new hg.w(13)).f25905a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = caVar4.f45128r.getWidth();
                    layout.y = (int) (caVar4.f45128r.getY() + AndroidUtilities.dp(56.0f));
                    cb cbVar = bbVar.f25555a;
                    cbVar.getWindow().setAttributes(cbVar.f25906b);
                }
                bbVar.setTouchable(true);
                new qc(bbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.k6.f21720gc, 0, new g8(caVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ca caVar5 = this.f45385b;
                if (booleanValue && (maVar = caVar5.W0) != null && maVar.M) {
                    maVar.M = false;
                    if (maVar.B && maVar.h == null) {
                        maVar.D = true;
                        ga gaVar = maVar.f45687a;
                        if (gaVar != null) {
                            gaVar.j0(true);
                        }
                    }
                }
                caVar5.U0.x(2, bool.booleanValue());
                caVar5.V0.clearAnimation();
                ViewPropertyAnimator animate = caVar5.V0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(120L).start();
                ic icVar = ic.f27737w;
                if (icVar != null && icVar.f27738a == 2) {
                    icVar.l();
                    return;
                }
                return;
            case 7:
                ca caVar6 = this.f45385b;
                caVar6.l();
                caVar6.m();
                caVar6.i((Runnable) obj);
                return;
            case 8:
                r rVar = (r) obj;
                ca caVar7 = this.f45385b;
                p9 p9Var2 = caVar7.f45150x0;
                caVar7.f45146w0 = rVar;
                p9Var2.o(rVar);
                caVar7.F0.setSelected(rVar);
                g9 g9Var = caVar7.f45154y0;
                if (g9Var != null) {
                    g9Var.recordHevc = !caVar7.f45150x0.j();
                }
                caVar7.D0.setDrawable(new lc0(rVar, false));
                caVar7.c0(caVar7.E0, caVar7.F0.f46137e, true);
                r5 r5Var = caVar7.L0;
                if (caVar7.f45150x0.j()) {
                    f11 = caVar7.f45150x0.getFilledProgress();
                } else {
                    f11 = 0.0f;
                }
                r5Var.e(f11, true);
                c9 c9Var = caVar7.J0;
                if (c9Var != null) {
                    c9Var.setMultipleOnClick(caVar7.f45150x0.j());
                    caVar7.J0.setMaxCount(Math.min(10, r.b() - caVar7.f45150x0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                ca caVar8 = this.f45385b;
                caVar8.L = true;
                caVar8.q(true);
                AndroidUtilities.runOnUIThread(new hg.n0(3, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                ca caVar9 = this.f45385b;
                if (!caVar9.M1 && !caVar9.N1) {
                    int intValue2 = num2.intValue();
                    caVar9.L1 = intValue2;
                    l6 l6Var = caVar9.f45111l0;
                    if (intValue2 == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l6Var.a(z10, true);
                    if (caVar9.L1 == 1 && !caVar9.F0.f46137e) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    caVar9.i0(z11, true);
                    caVar9.N0.a(num2.intValue());
                    r5 r5Var2 = caVar9.L0;
                    if (num2.intValue() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    r5Var2.f45961k0 = -1.0f;
                    r5Var2.f45962l0 = z12;
                    r5Var2.invalidate();
                    if (num2.intValue() == -1) {
                        g9 g9Var2 = caVar9.f45154y0;
                        if (g9Var2 != null && g9Var2.isDual()) {
                            caVar9.f45154y0.toggleDual();
                        }
                        f3 f3Var = caVar9.f45103i1;
                        if (f3Var != null) {
                            f3Var.e(true);
                        }
                        f3 f3Var2 = caVar9.f45106j1;
                        if (f3Var2 != null) {
                            f3Var2.e(true);
                        }
                        f3 f3Var3 = caVar9.T0;
                        if (f3Var3 != null) {
                            f3Var3.e(true);
                        }
                        caVar9.f45150x0.o(null);
                        caVar9.f45150x0.e();
                        caVar9.F0.setSelected((r) null);
                        g9 g9Var3 = caVar9.f45154y0;
                        if (g9Var3 != null) {
                            g9Var3.recordHevc = !caVar9.f45150x0.j();
                        }
                    }
                    caVar9.F0.a(false, true);
                    caVar9.m0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                ca caVar10 = this.f45385b;
                r5 r5Var3 = caVar10.L0;
                r5Var3.f45961k0 = f12.floatValue();
                r5Var3.invalidate();
                r5 r5Var4 = caVar10.L0;
                int i15 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                r5Var4.setVisibility(i10);
                caVar10.L0.setAlpha(Utilities.clamp01(f12.floatValue() + 1.0f));
                d dVar = caVar10.M0;
                if (f12.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                caVar10.M0.setAlpha(AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f));
                caVar10.M0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                caVar10.M0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                caVar10.M0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                if (f12.floatValue() < 0.0f) {
                    caVar10.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                ca caVar11 = this.f45385b;
                if (caVar11.H1 != null) {
                    r9 r9Var = caVar11.Z0;
                    if (!r9Var.L1) {
                        r9Var.clearFocus();
                        if (num3.intValue() == 5) {
                            caVar11.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            caVar11.l0(0, false, true);
                            f9 f9Var = caVar11.f45134s1;
                            if (f9Var != null) {
                                f9Var.J0 = false;
                                f9Var.R0(0);
                                f9Var.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            caVar11.l0(0, false, true);
                            f9 f9Var2 = caVar11.f45134s1;
                            if (f9Var2 != null) {
                                f9Var2.R0(2);
                                f9Var2.f44961i2 = true;
                                f9Var2.o0(true);
                                caVar11.f45134s1.J0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            caVar11.u();
                            caVar11.H();
                            f9 f9Var3 = caVar11.f45134s1;
                            if (f9Var3 != null) {
                                f9Var3.R0(1);
                                f9Var3.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            caVar11.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            caVar11.l0(3, false, true);
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
                ca caVar12 = this.f45385b;
                FrameLayout frameLayout = caVar12.V0;
                if (frameLayout != null) {
                    if (caVar12.f45085d0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + caVar12.Z0.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                u8 u8Var2 = caVar12.f45076a1;
                if (u8Var2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + caVar12.Z0.getEditTextHeight());
                    ma maVar2 = caVar12.W0;
                    if (maVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = maVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    u8Var2.setTranslationY(i16 - contentHeight);
                }
                ic icVar2 = ic.f27737w;
                if (icVar2 != null && icVar2.f27738a == 2) {
                    icVar2.l();
                }
                if (caVar12.Z0.m0 && (u8Var = caVar12.f45076a1) != null) {
                    u8Var.c(false, true);
                    return;
                }
                return;
            case 14:
                b8 b8Var = (b8) obj;
                ca caVar13 = this.f45385b;
                s6 s6Var5 = caVar13.H1;
                if (s6Var5 != null) {
                    s6Var5.E0 = b8Var;
                }
                ArrayList arrayList3 = caVar13.E1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((s6) obj2).E0 = b8Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ca caVar14 = this.f45385b;
                s6 s6Var6 = caVar14.H1;
                if (s6Var6 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    s6Var6.f46085v0 = inputPeer;
                    ArrayList arrayList4 = caVar14.E1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((s6) obj3).f46085v0 = caVar14.H1.f46085v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                ca caVar15 = this.f45385b;
                s6 s6Var7 = caVar15.H1;
                if (s6Var7 != null) {
                    s6Var7.f46087w0 = hashSet;
                    ArrayList arrayList5 = caVar15.E1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((s6) obj4).f46087w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                ca caVar16 = this.f45385b;
                s6 s6Var8 = caVar16.H1;
                if (s6Var8 != null) {
                    Bitmap bitmap3 = s6Var8.f46058g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    caVar16.H1.f46058g0 = bitmap2;
                    d8 d8Var2 = caVar16.f45116n0;
                    if (d8Var2 != null) {
                        d8Var2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f45385b.f45142v0 = (b8) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                ca caVar17 = this.f45385b;
                l6 l6Var2 = caVar17.f45111l0;
                caVar17.f45139u0 = inputPeer2;
                l6Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                ca caVar18 = this.f45385b;
                l6 l6Var3 = caVar18.f45111l0;
                caVar18.f45139u0 = inputPeer3;
                l6Var3.set(inputPeer3);
                return;
            default:
                d2 d2Var2 = this.f45385b.f45132s;
                float floatValue = ((Float) obj).floatValue();
                d2Var2.f45193o = floatValue;
                d2Var2.f45192n = d2.f(floatValue);
                d2Var2.g();
                return;
        }
    }
}
