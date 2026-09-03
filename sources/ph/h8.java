package ph;

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
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.qc;
public final class h8 implements Utilities.Callback {
    public final int f41752a;
    public final da f41753b;

    public h8(da daVar, int i10) {
        this.f41752a = i10;
        this.f41753b = daVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        String str;
        float f10;
        oa oaVar;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        v8 v8Var;
        int contentHeight;
        float dp;
        switch (this.f41752a) {
            case 0:
                d2 d2Var = this.f41753b.f41567s;
                d2Var.f41483p = ((Float) obj).floatValue();
                d2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                da daVar = this.f41753b;
                t6 t6Var = daVar.H1;
                if (t6Var != null) {
                    AndroidUtilities.recycleBitmap(t6Var.f42415g0);
                    daVar.H1.f42415g0 = bitmap;
                    e8 e8Var = daVar.f41551n0;
                    if (e8Var != null) {
                        e8Var.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                t6 t6Var2 = (t6) obj;
                da daVar2 = this.f41753b;
                daVar2.W(t6Var2, false);
                int i11 = daVar2.f41517c;
                nh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.h hVar = storiesController.e;
                int i12 = storiesController.f15897a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f15901g;
                nh.s6 s6Var = new nh.s6(storiesController, t6Var2);
                boolean z13 = t6Var2.f42414g;
                long j10 = s6Var.G;
                if (z13) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(t6Var2.f42412f), s6Var);
                } else {
                    storiesController.d(j10, s6Var, storiesController.f15898b, false);
                }
                storiesController.d(j10, s6Var, storiesController.f15899c, true);
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
                if (t6Var2.f42405c && !t6Var2.f42414g) {
                    MessagesController.getInstance(i11).getStoriesController().f15915w.c(t6Var2);
                }
                if (t6Var2.f42411e1 != 0) {
                    ConnectionsManager.getInstance(t6Var2.f42399a).cancelRequest(t6Var2.f42411e1, true);
                    return;
                }
                return;
            case 3:
                m5 m5Var = (m5) obj;
                da daVar3 = this.f41753b;
                if (daVar3.f41592z0 != null) {
                    c6 c6Var = daVar3.A0;
                    m5 m5Var2 = null;
                    if (m5Var == null) {
                        str = null;
                    } else {
                        str = m5Var.f42005a;
                    }
                    c6Var.setLink(str);
                    r9 r9Var = daVar3.f41585x0;
                    if (r9Var != null) {
                        n5 n5Var = r9Var.f42615c;
                        if (daVar3.A0.f41424y) {
                            m5Var2 = daVar3.f41592z0.d;
                        }
                        n5Var.a(m5Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                t6 t6Var3 = this.f41753b.H1;
                if (t6Var3 != null) {
                    t6Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                da daVar4 = this.f41753b;
                nh.b bVar = daVar4.f41510a;
                int intValue = ((Integer) obj).intValue() / 3600;
                bb bbVar = new cb(daVar4.f41513b, new gg.w(13)).f23915a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = daVar4.f41563r.getWidth();
                    layout.y = (int) (daVar4.f41563r.getY() + AndroidUtilities.dp(56.0f));
                    cb cbVar = bbVar.f23610a;
                    cbVar.getWindow().setAttributes(cbVar.f23916b);
                }
                bbVar.setTouchable(true);
                new qc(bbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.j6.f19941gc, 0, new g8(daVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                da daVar5 = this.f41753b;
                if (booleanValue && (oaVar = daVar5.W0) != null && oaVar.M) {
                    oaVar.M = false;
                    if (oaVar.B && oaVar.h == null) {
                        oaVar.D = true;
                        ia iaVar = oaVar.f42119a;
                        if (iaVar != null) {
                            iaVar.Z0(true);
                        }
                    }
                }
                daVar5.U0.x(2, bool.booleanValue());
                daVar5.V0.clearAnimation();
                ViewPropertyAnimator animate = daVar5.V0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(120L).start();
                ic icVar = ic.f25664w;
                if (icVar != null && icVar.f25665a == 2) {
                    icVar.l();
                    return;
                }
                return;
            case 7:
                da daVar6 = this.f41753b;
                daVar6.l();
                daVar6.m();
                daVar6.i((Runnable) obj);
                return;
            case 8:
                r rVar = (r) obj;
                da daVar7 = this.f41753b;
                r9 r9Var2 = daVar7.f41585x0;
                daVar7.f41581w0 = rVar;
                r9Var2.o(rVar);
                daVar7.F0.setSelected(rVar);
                i9 i9Var = daVar7.f41589y0;
                if (i9Var != null) {
                    i9Var.recordHevc = !daVar7.f41585x0.j();
                }
                daVar7.D0.setDrawable(new kc0(rVar, false));
                daVar7.c0(daVar7.E0, daVar7.F0.e, true);
                s5 s5Var = daVar7.L0;
                if (daVar7.f41585x0.j()) {
                    f11 = daVar7.f41585x0.getFilledProgress();
                } else {
                    f11 = 0.0f;
                }
                s5Var.e(f11, true);
                e9 e9Var = daVar7.J0;
                if (e9Var != null) {
                    e9Var.setMultipleOnClick(daVar7.f41585x0.j());
                    daVar7.J0.setMaxCount(Math.min(10, r.b() - daVar7.f41585x0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                da daVar8 = this.f41753b;
                daVar8.L = true;
                daVar8.q(true);
                AndroidUtilities.runOnUIThread(new gg.n0(3, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                da daVar9 = this.f41753b;
                if (!daVar9.M1 && !daVar9.N1) {
                    int intValue2 = num2.intValue();
                    daVar9.L1 = intValue2;
                    m6 m6Var = daVar9.f41546l0;
                    if (intValue2 == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m6Var.a(z10, true);
                    if (daVar9.L1 == 1 && !daVar9.F0.e) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    daVar9.i0(z11, true);
                    daVar9.N0.a(num2.intValue());
                    s5 s5Var2 = daVar9.L0;
                    if (num2.intValue() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s5Var2.f42352k0 = -1.0f;
                    s5Var2.f42353l0 = z12;
                    s5Var2.invalidate();
                    if (num2.intValue() == -1) {
                        i9 i9Var2 = daVar9.f41589y0;
                        if (i9Var2 != null && i9Var2.isDual()) {
                            daVar9.f41589y0.toggleDual();
                        }
                        f3 f3Var = daVar9.f41538i1;
                        if (f3Var != null) {
                            f3Var.e(true);
                        }
                        f3 f3Var2 = daVar9.f41541j1;
                        if (f3Var2 != null) {
                            f3Var2.e(true);
                        }
                        f3 f3Var3 = daVar9.T0;
                        if (f3Var3 != null) {
                            f3Var3.e(true);
                        }
                        daVar9.f41585x0.o(null);
                        daVar9.f41585x0.e();
                        daVar9.F0.setSelected((r) null);
                        i9 i9Var3 = daVar9.f41589y0;
                        if (i9Var3 != null) {
                            i9Var3.recordHevc = !daVar9.f41585x0.j();
                        }
                    }
                    daVar9.F0.a(false, true);
                    daVar9.m0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                da daVar10 = this.f41753b;
                s5 s5Var3 = daVar10.L0;
                s5Var3.f42352k0 = f12.floatValue();
                s5Var3.invalidate();
                s5 s5Var4 = daVar10.L0;
                int i15 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                s5Var4.setVisibility(i10);
                daVar10.L0.setAlpha(Utilities.clamp01(f12.floatValue() + 1.0f));
                d dVar = daVar10.M0;
                if (f12.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                daVar10.M0.setAlpha(AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f));
                daVar10.M0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                daVar10.M0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                daVar10.M0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                if (f12.floatValue() < 0.0f) {
                    daVar10.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                da daVar11 = this.f41753b;
                if (daVar11.H1 != null) {
                    t9 t9Var = daVar11.Z0;
                    if (!t9Var.L1) {
                        t9Var.clearFocus();
                        if (num3.intValue() == 5) {
                            daVar11.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            daVar11.l0(0, false, true);
                            h9 h9Var = daVar11.f41569s1;
                            if (h9Var != null) {
                                h9Var.J0 = false;
                                h9Var.R0(0);
                                h9Var.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            daVar11.l0(0, false, true);
                            h9 h9Var2 = daVar11.f41569s1;
                            if (h9Var2 != null) {
                                h9Var2.R0(2);
                                h9Var2.f41382i2 = true;
                                h9Var2.o0(true);
                                daVar11.f41569s1.J0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            daVar11.u();
                            daVar11.H();
                            h9 h9Var3 = daVar11.f41569s1;
                            if (h9Var3 != null) {
                                h9Var3.R0(1);
                                h9Var3.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            daVar11.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            daVar11.l0(3, false, true);
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
                da daVar12 = this.f41753b;
                FrameLayout frameLayout = daVar12.V0;
                if (frameLayout != null) {
                    if (daVar12.f41521d0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + daVar12.Z0.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                v8 v8Var2 = daVar12.f41512a1;
                if (v8Var2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + daVar12.Z0.getEditTextHeight());
                    oa oaVar2 = daVar12.W0;
                    if (oaVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = oaVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    v8Var2.setTranslationY(i16 - contentHeight);
                }
                ic icVar2 = ic.f25664w;
                if (icVar2 != null && icVar2.f25665a == 2) {
                    icVar2.l();
                }
                if (daVar12.Z0.m0 && (v8Var = daVar12.f41512a1) != null) {
                    v8Var.c(false, true);
                    return;
                }
                return;
            case 14:
                c8 c8Var = (c8) obj;
                da daVar13 = this.f41753b;
                t6 t6Var4 = daVar13.H1;
                if (t6Var4 != null) {
                    t6Var4.E0 = c8Var;
                }
                ArrayList arrayList3 = daVar13.E1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((t6) obj2).E0 = c8Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                da daVar14 = this.f41753b;
                t6 t6Var5 = daVar14.H1;
                if (t6Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    t6Var5.f42442v0 = inputPeer;
                    ArrayList arrayList4 = daVar14.E1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((t6) obj3).f42442v0 = daVar14.H1.f42442v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                da daVar15 = this.f41753b;
                t6 t6Var6 = daVar15.H1;
                if (t6Var6 != null) {
                    t6Var6.f42444w0 = hashSet;
                    ArrayList arrayList5 = daVar15.E1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((t6) obj4).f42444w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                da daVar16 = this.f41753b;
                t6 t6Var7 = daVar16.H1;
                if (t6Var7 != null) {
                    Bitmap bitmap3 = t6Var7.f42415g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    daVar16.H1.f42415g0 = bitmap2;
                    e8 e8Var2 = daVar16.f41551n0;
                    if (e8Var2 != null) {
                        e8Var2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f41753b.f41577v0 = (c8) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                da daVar17 = this.f41753b;
                m6 m6Var2 = daVar17.f41546l0;
                daVar17.f41574u0 = inputPeer2;
                m6Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                da daVar18 = this.f41753b;
                m6 m6Var3 = daVar18.f41546l0;
                daVar18.f41574u0 = inputPeer3;
                m6Var3.set(inputPeer3);
                return;
            default:
                d2 d2Var2 = this.f41753b.f41567s;
                float floatValue = ((Float) obj).floatValue();
                d2Var2.f41482o = floatValue;
                d2Var2.f41481n = d2.f(floatValue);
                d2Var2.g();
                return;
        }
    }
}
