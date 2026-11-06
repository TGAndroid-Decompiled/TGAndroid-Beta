package org.telegram.ui;

import android.animation.ValueAnimator;
import android.appwidget.AppWidgetManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class w9 extends org.telegram.ui.ActionBar.j {
    public final int f51028a;
    public final Object f51029b;

    public w9(Object obj, int i7) {
        this.f51028a = i7;
        this.f51029b = obj;
    }

    @Override
    public final void b(int i7) {
        long j3;
        int i10;
        int i11;
        Runnable runnable;
        int i12;
        org.telegram.ui.ActionBar.y4 y4Var;
        fw fwVar;
        int i13;
        org.telegram.messenger.vo voVar;
        long j10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        int i15 = this.f51028a;
        Object obj = this.f51029b;
        switch (i15) {
            case 0:
                y9 y9Var = (y9) obj;
                if (i7 == -1) {
                    y9Var.finishFragment();
                    return;
                } else if (i7 == 1 && y9Var.f52173a.getText().length() != 0) {
                    y9.Z(y9Var);
                    y9Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 1:
                la laVar = (la) obj;
                if (i7 == -1) {
                    laVar.finishFragment();
                    return;
                } else if (i7 == 1) {
                    la.d0(laVar);
                    la.e0(laVar);
                    return;
                } else {
                    return;
                }
            case 2:
                if (i7 == -1) {
                    ((mb) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                rc rcVar = (rc) obj;
                if (i7 == -1) {
                    if (rcVar.f49449b >= rcVar.Z0() && rcVar.X0()) {
                        rcVar.c1();
                        return;
                    } else {
                        rcVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1) {
                    FrameLayout frameLayout = (FrameLayout) rcVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    rcVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    rcVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    rcVar.L.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    cc ccVar = new cc(rcVar, rcVar.getParentActivity(), canvas, (rcVar.L.getMeasuredWidth() / 2.0f) + f10, (rcVar.L.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22532n, paint, createBitmap, paint2, f10, f11, 0);
                    rcVar.m0 = ccVar;
                    ccVar.setOnTouchListener(new ei.b(2));
                    rcVar.f49465n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rcVar.f49466o0 = ofFloat;
                    ofFloat.addUpdateListener(new fi.ea(rcVar, 1));
                    rcVar.f49466o0.addListener(new va(rcVar, 3));
                    rcVar.f49466o0.setDuration(400L);
                    rcVar.f49466o0.setInterpolator(org.telegram.ui.Components.ks.f35412e);
                    rcVar.f49466o0.start();
                    frameLayout.addView(rcVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.g0.h3(new xb(rcVar, 0));
                    return;
                } else {
                    return;
                }
            case 4:
                bd bdVar = (bd) obj;
                long j11 = bdVar.f44265j0;
                sc scVar = bdVar.f44281w0;
                if (i7 == -1) {
                    if (bdVar.f44276s0) {
                        bd.d0(bdVar);
                        return;
                    } else {
                        bdVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1) {
                    int i16 = bdVar.f44264i0;
                    if (i16 == 0) {
                        if (bdVar.getParentActivity() != null) {
                            if (bdVar.f44276s0) {
                                bd.d0(bdVar);
                                return;
                            } else if (bdVar.d.f35416a.length() == 0) {
                                Vibrator vibrator = (Vibrator) bdVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(bdVar.d);
                                return;
                            } else {
                                bdVar.f44276s0 = true;
                                org.telegram.messenger.g0.i3(scVar, 200L);
                                if (!bdVar.f44282x.g()) {
                                    i11 = ((org.telegram.ui.ActionBar.f2) bdVar).currentAccount;
                                    bdVar.f44277t0 = Integer.valueOf(org.telegram.messenger.qp.s1(i11).U(bdVar.d.getText().toString(), new ArrayList(), bdVar.f44284y.getText().toString(), 2, false, null, null, -1, bdVar));
                                    return;
                                }
                                bdVar.f44274r0 = true;
                                return;
                            }
                        }
                        return;
                    } else if (i16 == 1) {
                        if (!bdVar.f44254b0) {
                            if (bdVar.f44284y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bdVar.getParentActivity());
                                String M0 = org.telegram.messenger.hd.M0(2131752316, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.hd.M0(2131752317, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                                bdVar.showDialog(u1Var);
                                return;
                            } else if (!bdVar.f44252a0) {
                                Vibrator vibrator2 = (Vibrator) bdVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(bdVar.V);
                                return;
                            } else {
                                org.telegram.messenger.g0.i3(scVar, 200L);
                                i10 = ((org.telegram.ui.ActionBar.f2) bdVar).currentAccount;
                                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                                long j12 = bdVar.f44265j0;
                                String str = bdVar.Y;
                                Runnable runnable2 = new Runnable(this) {
                                    public final w9 f51052b;

                                    {
                                        this.f51052b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                bd bdVar2 = (bd) this.f51052b.f51029b;
                                                bdVar2.m0(false);
                                                org.telegram.messenger.v10 v10Var = bdVar2.f44278u0;
                                                if (v10Var != null) {
                                                    v10Var.a(bdVar2, Long.valueOf(bdVar2.f44265j0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                bd bdVar3 = (bd) this.f51052b.f51029b;
                                                bdVar3.m0(false);
                                                org.telegram.messenger.v10 v10Var2 = bdVar3.f44278u0;
                                                if (v10Var2 != null) {
                                                    v10Var2.a(bdVar3, Long.valueOf(bdVar3.f44265j0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable3 = new Runnable(this) {
                                    public final w9 f51052b;

                                    {
                                        this.f51052b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                bd bdVar2 = (bd) this.f51052b.f51029b;
                                                bdVar2.m0(false);
                                                org.telegram.messenger.v10 v10Var = bdVar2.f44278u0;
                                                if (v10Var != null) {
                                                    v10Var.a(bdVar2, Long.valueOf(bdVar2.f44265j0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                bd bdVar3 = (bd) this.f51052b.f51029b;
                                                bdVar3.m0(false);
                                                org.telegram.messenger.v10 v10Var2 = bdVar3.f44278u0;
                                                if (v10Var2 != null) {
                                                    v10Var2.a(bdVar3, Long.valueOf(bdVar3.f44265j0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = s12.h1(j12);
                                tL_channels_updateUsername.username = str;
                                j3 = j11;
                                s12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.mm(s12, j12, str, runnable2, bdVar, tL_channels_updateUsername, runnable3), 64);
                            }
                        } else {
                            j3 = j11;
                            org.telegram.messenger.v10 v10Var = bdVar.f44278u0;
                            if (v10Var != null) {
                                v10Var.a(bdVar, Long.valueOf(j3));
                            }
                        }
                        if (bdVar.f44278u0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j3);
                            bundle.putInt("chatType", 2);
                            bdVar.presentFragment(new w40(bundle), true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                pn pnVar = (pn) obj;
                if (i7 == -1) {
                    if (pnVar.j0(true)) {
                        pnVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    pnVar.o0();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i7 == -1) {
                    ((so) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i7 == -1) {
                    ((zo) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                kp kpVar = (kp) obj;
                if (i7 == -1) {
                    if (kpVar.r0(true)) {
                        kpVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    kpVar.w0(true);
                    return;
                } else {
                    return;
                }
            case 9:
                oq oqVar = (oq) obj;
                if (i7 == -1) {
                    if (oqVar.l0(true)) {
                        oqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    oqVar.z0();
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) obj;
                if (i7 == -1) {
                    b8Var.dismiss();
                    return;
                } else {
                    b8Var.P0(i7);
                    return;
                }
            case 11:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.na) obj).dismiss();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.di diVar = (org.telegram.ui.Components.di) obj;
                if (i7 == -1) {
                    if (!diVar.f32955s2.k()) {
                        diVar.dismiss();
                        return;
                    }
                    return;
                }
                diVar.f32955s2.w(i7);
                return;
            case 13:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.r20) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.u80 u80Var = (org.telegram.ui.Components.u80) obj;
                if (i7 == -1) {
                    if (!u80Var.R.V(true)) {
                        u80Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 10) {
                    org.telegram.ui.Components.t80 t80Var = u80Var.R;
                    t80Var.p1(t80Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 15:
                if (i7 == -1 && (runnable = ((org.telegram.ui.Components.ud0) obj).f38608r) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
            case 16:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.qe0) obj).dismiss();
                    return;
                }
                return;
            case 17:
                ((org.telegram.ui.Components.mo0) obj).onBackPressed();
                return;
            case 18:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.m41) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.voip.t0) obj).b(false, false);
                    return;
                }
                return;
            case 20:
                if (i7 == -1) {
                    ((yb1) obj).a(false, false);
                    return;
                }
                return;
            case 21:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i7 == -1) {
                    y4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                    if (y4Var.s()) {
                        contactsActivity.m0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i7 == 100) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.Z;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                    if (m10 == 1) {
                        u1Var2.R = org.telegram.messenger.hd.M0(2131751551, null);
                        u1Var2.T = org.telegram.messenger.hd.M0(2131751552, null);
                    } else {
                        u1Var2.R = org.telegram.messenger.hd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        u1Var2.T = org.telegram.messenger.hd.M0(2131751550, null);
                    }
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131751599, null), new qr(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.Components.il0(15));
                    u1Var2.show();
                    u1Var2.i();
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.iz.L0 = !org.telegram.messenger.iz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.iz.L0);
                    edit.apply();
                    contactsActivity.f41195r = org.telegram.messenger.iz.L0;
                    org.telegram.ui.ActionBar.f5 f5Var = contactsActivity.f41193n;
                    if (f5Var != null) {
                        org.telegram.ui.Components.ch0 iconView = f5Var.getIconView();
                        if (contactsActivity.f41195r) {
                            i12 = 2131232102;
                        } else {
                            i12 = 2131232101;
                        }
                        org.telegram.messenger.g0.R3(iconView, i12);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f41184e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f41176a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.xq.f40330g).withEndAction(new pr(contactsActivity, 0));
                    contactsActivity.f41184e0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 22:
                if (i7 == -1) {
                    ((qs) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i7 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i7 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i7 == -1) {
                    ((kt) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i7 == -1) {
                    ((au) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                ww wwVar = (ww) obj;
                ArrayList arrayList = wwVar.I2;
                if ((i7 == 201 || i7 == 200 || i7 == 202 || i7 == 203) && (fwVar = wwVar.C0) != null) {
                    HashMap hashMap = fwVar.B0;
                    ww wwVar2 = fwVar.L0;
                    if (i7 == 202) {
                        if (wwVar2 != null && wwVar2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wwVar2.getParentActivity());
                            String G = org.telegram.messenger.hd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27292a;
                            u1Var3.R = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.hd.M0(2131746318, null));
                            u1Var3.T = spannableStringBuilder;
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.Components.il0(1));
                            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131751599, null), new org.telegram.ui.Components.f2(16, fwVar, arrayList2));
                            TextView textView = (TextView) alertDialog$Builder3.p().d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i7 == 203) {
                        if (fwVar.O()) {
                            wwVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) wwVar2, 2, true));
                            return;
                        }
                        return;
                    } else if (i7 == 200) {
                        if (hashMap.size() == 1) {
                            fwVar.g((org.telegram.messenger.ij) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i7 == 201) {
                        ww wwVar3 = new ww(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
                        wwVar3.C2 = new org.telegram.ui.Components.ax(fwVar, 18);
                        wwVar2.presentFragment(wwVar3);
                        return;
                    } else {
                        return;
                    }
                } else if (i7 == -1) {
                    sv svVar = wwVar.F3;
                    if (svVar != null && svVar.c()) {
                        kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                        if (kVar2.v()) {
                            fw fwVar2 = wwVar.C0;
                            if (fwVar2 != null && fwVar2.getVisibility() == 0) {
                                fw fwVar3 = wwVar.C0;
                                if (fwVar3.A0) {
                                    fwVar3.R(false);
                                    return;
                                }
                            }
                            wwVar.n4(true);
                            return;
                        }
                        wwVar.F3.a();
                        fw fwVar4 = wwVar.C0;
                        if (fwVar4 != null) {
                            fwVar4.S();
                            return;
                        }
                        return;
                    }
                    mw mwVar = wwVar.f51656z0;
                    if (mwVar == null || !mwVar.f33388n) {
                        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                        if (kVar.v()) {
                            fw fwVar5 = wwVar.C0;
                            if (fwVar5 != null && fwVar5.getVisibility() == 0) {
                                fw fwVar6 = wwVar.C0;
                                if (fwVar6.A0) {
                                    fwVar6.R(false);
                                    return;
                                }
                            }
                            wwVar.n4(true);
                            return;
                        } else if (wwVar.f51587l2 || wwVar.W2 != 0 || wwVar.Y2 != 0) {
                            wwVar.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    mwVar.setIsEditing(false);
                    wwVar.U4(false);
                    return;
                } else if (i7 == 1) {
                    if (wwVar.getParentActivity() != null) {
                        org.telegram.messenger.iz.f23420x = true;
                        org.telegram.messenger.iz.y();
                        int[] iArr2 = new int[2];
                        wwVar.f51557f0.getLocationInWindow(iArr2);
                        ((LaunchActivity) wwVar.getParentActivity()).K0(false, true, (wwVar.f51557f0.getMeasuredWidth() / 2) + iArr2[0], (wwVar.f51557f0.getMeasuredHeight() / 2) + iArr2[1], new bh(this, 22));
                        wwVar.getNotificationsController().Y();
                        wwVar.K3();
                        return;
                    }
                    return;
                } else if (i7 == 3) {
                    wwVar.a5(true, true, true, false);
                    wwVar.Y.b(true);
                    return;
                } else if (i7 == 11) {
                    wwVar.B4(wwVar.D1);
                    return;
                } else if (i7 == 109) {
                    org.telegram.ui.Components.fz fzVar = new org.telegram.ui.Components.fz(wwVar, arrayList);
                    fzVar.f33669q1 = new wr(this, 7);
                    wwVar.showDialog(fzVar);
                    return;
                } else if (i7 == 110) {
                    org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) wwVar.getMessagesController().T0().get(wwVar.f51551e0[0].h);
                    ArrayList J0 = org.telegram.ui.Components.fz.J0(wwVar, voVar2, arrayList, false, false);
                    if (voVar2 != null) {
                        i13 = voVar2.f26062i.size();
                    } else {
                        i13 = 0;
                    }
                    if (J0.size() + i13 > 100) {
                        wwVar.showDialog(org.telegram.ui.Components.v4.K(wwVar.getParentActivity(), org.telegram.messenger.hd.M0(2131750811, null), org.telegram.messenger.hd.M0(2131750812, null)).f27292a);
                        return;
                    }
                    if (!J0.isEmpty()) {
                        voVar2.f26062i.addAll(J0);
                        for (int i17 = 0; i17 < J0.size(); i17++) {
                            Long l10 = (Long) J0.get(i17);
                            voVar2.h.remove(l10);
                            voVar2.f26063j.delete(l10.longValue());
                        }
                        if (voVar2.d()) {
                            voVar2.f26062i.clear();
                        }
                        voVar = voVar2;
                        gz.z0(voVar, voVar2.f26061g, voVar2.f26057b, voVar2.f26058c, voVar2.f26067n, voVar2.f26066m, voVar2.h, voVar2.f26062i, voVar2.f26063j, false, false, true, false, false, wwVar, null);
                    } else {
                        voVar = voVar2;
                    }
                    if (J0.size() == 1) {
                        j10 = ((Long) J0.get(0)).longValue();
                    } else {
                        j10 = 0;
                    }
                    UndoView k42 = wwVar.k4();
                    if (k42 != null) {
                        k42.k(j10, 21, Integer.valueOf(J0.size()), voVar, null, null);
                    }
                    wwVar.n4(false);
                    return;
                } else if (i7 == 100 || i7 == 101 || i7 == 102 || i7 == 103 || i7 == 104 || i7 == 105 || i7 == 106 || i7 == 107 || i7 == 108) {
                    wwVar.D4(wwVar.I2, i7, true, false, null);
                    return;
                } else {
                    return;
                }
            case 28:
                ex exVar = (ex) obj;
                int i18 = exVar.f45432x;
                ArrayList arrayList3 = exVar.f45426e;
                int i19 = exVar.f45433y;
                if (i7 == -1) {
                    if (exVar.D == null) {
                        exVar.d0();
                        return;
                    } else {
                        exVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1 && exVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i20)).longValue(), 0L));
                    }
                    org.telegram.messenger.yr messagesStorage = exVar.getMessagesStorage();
                    messagesStorage.f26688a.c(new org.telegram.messenger.up(messagesStorage, i19, arrayList4, 1));
                    SharedPreferences.Editor edit2 = exVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i14 = ((org.telegram.ui.ActionBar.f2) exVar).currentAccount;
                    edit2.putInt("account" + i19, i14);
                    edit2.putInt("type" + i19, i18);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(exVar.getParentActivity());
                    if (i18 == 0) {
                        ChatsWidgetProvider.a(exVar.getParentActivity(), appWidgetManager, i19);
                    } else {
                        ContactsWidgetProvider.a(exVar.getParentActivity(), appWidgetManager, i19);
                    }
                    ax axVar = exVar.D;
                    if (axVar != null) {
                        axVar.b();
                        return;
                    } else {
                        exVar.d0();
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (i7 == -1) {
                    ((nx) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
