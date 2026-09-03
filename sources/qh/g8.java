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
public final class g8 implements Utilities.Callback {
    public final int f45365a;
    public final ba f45366b;

    public g8(ba baVar, int i10) {
        this.f45365a = i10;
        this.f45366b = baVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        String str;
        float f10;
        la laVar;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        t8 t8Var;
        int contentHeight;
        float dp;
        switch (this.f45365a) {
            case 0:
                c2 c2Var = this.f45366b.f45098s;
                c2Var.f45160p = ((Float) obj).floatValue();
                c2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                ba baVar = this.f45366b;
                r6 r6Var = baVar.H1;
                if (r6Var != null) {
                    AndroidUtilities.recycleBitmap(r6Var.f46009g0);
                    baVar.H1.f46009g0 = bitmap;
                    c8 c8Var = baVar.f45082n0;
                    if (c8Var != null) {
                        c8Var.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                r6 r6Var2 = (r6) obj;
                ba baVar2 = this.f45366b;
                baVar2.W(r6Var2, false);
                int i11 = baVar2.f45047c;
                oh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.h hVar = storiesController.f17775e;
                int i12 = storiesController.f17772a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f17777g;
                oh.s6 s6Var = new oh.s6(storiesController, r6Var2);
                boolean z13 = r6Var2.f46008g;
                long j10 = s6Var.G;
                if (z13) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(r6Var2.f46006f), s6Var);
                } else {
                    storiesController.d(j10, s6Var, storiesController.f17773b, false);
                }
                storiesController.d(j10, s6Var, storiesController.f17774c, true);
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
                s6Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (r6Var2.f45998c && !r6Var2.f46008g) {
                    MessagesController.getInstance(i11).getStoriesController().f17791w.c(r6Var2);
                }
                if (r6Var2.f46005e1 != 0) {
                    ConnectionsManager.getInstance(r6Var2.f45992a).cancelRequest(r6Var2.f46005e1, true);
                    return;
                }
                return;
            case 3:
                k5 k5Var = (k5) obj;
                ba baVar3 = this.f45366b;
                if (baVar3.f45123z0 != null) {
                    a6 a6Var = baVar3.A0;
                    k5 k5Var2 = null;
                    if (k5Var == null) {
                        str = null;
                    } else {
                        str = k5Var.f45609a;
                    }
                    a6Var.setLink(str);
                    o9 o9Var = baVar3.f45116x0;
                    if (o9Var != null) {
                        l5 l5Var = o9Var.f46326c;
                        if (baVar3.A0.f44981y) {
                            k5Var2 = baVar3.f45123z0.d;
                        }
                        l5Var.a(k5Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                r6 r6Var3 = this.f45366b.H1;
                if (r6Var3 != null) {
                    r6Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                ba baVar4 = this.f45366b;
                oh.b bVar = baVar4.f45040a;
                int intValue = ((Integer) obj).intValue() / 3600;
                bb bbVar = new cb(baVar4.f45043b, new hg.w(13)).f25882a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = baVar4.f45094r.getWidth();
                    layout.y = (int) (baVar4.f45094r.getY() + AndroidUtilities.dp(56.0f));
                    cb cbVar = bbVar.f25566a;
                    cbVar.getWindow().setAttributes(cbVar.f25883b);
                }
                bbVar.setTouchable(true);
                new qc(bbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.k6.f21722gc, 0, new f8(baVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ba baVar5 = this.f45366b;
                if (booleanValue && (laVar = baVar5.W0) != null && laVar.M) {
                    laVar.M = false;
                    if (laVar.B && laVar.h == null) {
                        laVar.D = true;
                        fa faVar = laVar.f45661a;
                        if (faVar != null) {
                            faVar.j0(true);
                        }
                    }
                }
                baVar5.U0.x(2, bool.booleanValue());
                baVar5.V0.clearAnimation();
                ViewPropertyAnimator animate = baVar5.V0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(120L).start();
                ic icVar = ic.f27770w;
                if (icVar != null && icVar.f27771a == 2) {
                    icVar.l();
                    return;
                }
                return;
            case 7:
                ba baVar6 = this.f45366b;
                baVar6.l();
                baVar6.m();
                baVar6.i((Runnable) obj);
                return;
            case 8:
                r rVar = (r) obj;
                ba baVar7 = this.f45366b;
                o9 o9Var2 = baVar7.f45116x0;
                baVar7.f45112w0 = rVar;
                o9Var2.o(rVar);
                baVar7.F0.setSelected(rVar);
                f9 f9Var = baVar7.f45120y0;
                if (f9Var != null) {
                    f9Var.recordHevc = !baVar7.f45116x0.j();
                }
                baVar7.D0.setDrawable(new lc0(rVar, false));
                baVar7.c0(baVar7.E0, baVar7.F0.f46152e, true);
                q5 q5Var = baVar7.L0;
                if (baVar7.f45116x0.j()) {
                    f11 = baVar7.f45116x0.getFilledProgress();
                } else {
                    f11 = 0.0f;
                }
                q5Var.e(f11, true);
                b9 b9Var = baVar7.J0;
                if (b9Var != null) {
                    b9Var.setMultipleOnClick(baVar7.f45116x0.j());
                    baVar7.J0.setMaxCount(Math.min(10, r.b() - baVar7.f45116x0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                ba baVar8 = this.f45366b;
                baVar8.L = true;
                baVar8.q(true);
                AndroidUtilities.runOnUIThread(new hg.n0(3, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                ba baVar9 = this.f45366b;
                if (!baVar9.M1 && !baVar9.N1) {
                    int intValue2 = num2.intValue();
                    baVar9.L1 = intValue2;
                    j6 j6Var = baVar9.f45077l0;
                    if (intValue2 == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j6Var.a(z10, true);
                    if (baVar9.L1 == 1 && !baVar9.F0.f46152e) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    baVar9.i0(z11, true);
                    baVar9.N0.a(num2.intValue());
                    q5 q5Var2 = baVar9.L0;
                    if (num2.intValue() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    q5Var2.f45940k0 = -1.0f;
                    q5Var2.f45941l0 = z12;
                    q5Var2.invalidate();
                    if (num2.intValue() == -1) {
                        f9 f9Var2 = baVar9.f45120y0;
                        if (f9Var2 != null && f9Var2.isDual()) {
                            baVar9.f45120y0.toggleDual();
                        }
                        e3 e3Var = baVar9.f45069i1;
                        if (e3Var != null) {
                            e3Var.e(true);
                        }
                        e3 e3Var2 = baVar9.f45072j1;
                        if (e3Var2 != null) {
                            e3Var2.e(true);
                        }
                        e3 e3Var3 = baVar9.T0;
                        if (e3Var3 != null) {
                            e3Var3.e(true);
                        }
                        baVar9.f45116x0.o(null);
                        baVar9.f45116x0.e();
                        baVar9.F0.setSelected((r) null);
                        f9 f9Var3 = baVar9.f45120y0;
                        if (f9Var3 != null) {
                            f9Var3.recordHevc = !baVar9.f45116x0.j();
                        }
                    }
                    baVar9.F0.a(false, true);
                    baVar9.m0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                ba baVar10 = this.f45366b;
                q5 q5Var3 = baVar10.L0;
                q5Var3.f45940k0 = f12.floatValue();
                q5Var3.invalidate();
                q5 q5Var4 = baVar10.L0;
                int i15 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                q5Var4.setVisibility(i10);
                baVar10.L0.setAlpha(Utilities.clamp01(f12.floatValue() + 1.0f));
                d dVar = baVar10.M0;
                if (f12.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                baVar10.M0.setAlpha(AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f));
                baVar10.M0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                baVar10.M0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                baVar10.M0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                if (f12.floatValue() < 0.0f) {
                    baVar10.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                ba baVar11 = this.f45366b;
                if (baVar11.H1 != null) {
                    q9 q9Var = baVar11.Z0;
                    if (!q9Var.L1) {
                        q9Var.clearFocus();
                        if (num3.intValue() == 5) {
                            baVar11.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            baVar11.l0(0, false, true);
                            e9 e9Var = baVar11.f45100s1;
                            if (e9Var != null) {
                                e9Var.J0 = false;
                                e9Var.R0(0);
                                e9Var.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            baVar11.l0(0, false, true);
                            e9 e9Var2 = baVar11.f45100s1;
                            if (e9Var2 != null) {
                                e9Var2.R0(2);
                                e9Var2.f44938i2 = true;
                                e9Var2.o0(true);
                                baVar11.f45100s1.J0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            baVar11.u();
                            baVar11.H();
                            e9 e9Var3 = baVar11.f45100s1;
                            if (e9Var3 != null) {
                                e9Var3.R0(1);
                                e9Var3.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            baVar11.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            baVar11.l0(3, false, true);
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
                ba baVar12 = this.f45366b;
                FrameLayout frameLayout = baVar12.V0;
                if (frameLayout != null) {
                    if (baVar12.f45051d0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + baVar12.Z0.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                t8 t8Var2 = baVar12.f45042a1;
                if (t8Var2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + baVar12.Z0.getEditTextHeight());
                    la laVar2 = baVar12.W0;
                    if (laVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = laVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    t8Var2.setTranslationY(i16 - contentHeight);
                }
                ic icVar2 = ic.f27770w;
                if (icVar2 != null && icVar2.f27771a == 2) {
                    icVar2.l();
                }
                if (baVar12.Z0.m0 && (t8Var = baVar12.f45042a1) != null) {
                    t8Var.c(false, true);
                    return;
                }
                return;
            case 14:
                a8 a8Var = (a8) obj;
                ba baVar13 = this.f45366b;
                r6 r6Var4 = baVar13.H1;
                if (r6Var4 != null) {
                    r6Var4.E0 = a8Var;
                }
                ArrayList arrayList3 = baVar13.E1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((r6) obj2).E0 = a8Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ba baVar14 = this.f45366b;
                r6 r6Var5 = baVar14.H1;
                if (r6Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    r6Var5.f46036v0 = inputPeer;
                    ArrayList arrayList4 = baVar14.E1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((r6) obj3).f46036v0 = baVar14.H1.f46036v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                ba baVar15 = this.f45366b;
                r6 r6Var6 = baVar15.H1;
                if (r6Var6 != null) {
                    r6Var6.f46038w0 = hashSet;
                    ArrayList arrayList5 = baVar15.E1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((r6) obj4).f46038w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                ba baVar16 = this.f45366b;
                r6 r6Var7 = baVar16.H1;
                if (r6Var7 != null) {
                    Bitmap bitmap3 = r6Var7.f46009g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    baVar16.H1.f46009g0 = bitmap2;
                    c8 c8Var2 = baVar16.f45082n0;
                    if (c8Var2 != null) {
                        c8Var2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f45366b.f45108v0 = (a8) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                ba baVar17 = this.f45366b;
                j6 j6Var2 = baVar17.f45077l0;
                baVar17.f45105u0 = inputPeer2;
                j6Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                ba baVar18 = this.f45366b;
                j6 j6Var3 = baVar18.f45077l0;
                baVar18.f45105u0 = inputPeer3;
                j6Var3.set(inputPeer3);
                return;
            default:
                c2 c2Var2 = this.f45366b.f45098s;
                float floatValue = ((Float) obj).floatValue();
                c2Var2.f45159o = floatValue;
                c2Var2.f45158n = c2.f(floatValue);
                c2Var2.g();
                return;
        }
    }
}
