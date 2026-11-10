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
public final class w9 extends org.telegram.ui.ActionBar.k {
    public final int f50948a;
    public final Object f50949b;

    public w9(Object obj, int i7) {
        this.f50948a = i7;
        this.f50949b = obj;
    }

    @Override
    public final void b(int i7) {
        long j3;
        int i10;
        int i11;
        Runnable runnable;
        int i12;
        org.telegram.ui.ActionBar.z4 z4Var;
        iw iwVar;
        int i13;
        org.telegram.messenger.vo voVar;
        long j10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i14;
        int i15 = this.f50948a;
        Object obj = this.f50949b;
        switch (i15) {
            case 0:
                y9 y9Var = (y9) obj;
                if (i7 == -1) {
                    y9Var.finishFragment();
                    return;
                } else if (i7 == 1 && y9Var.f51966a.getText().length() != 0) {
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
                    if (rcVar.f49353b >= rcVar.Z0() && rcVar.X0()) {
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
                    cc ccVar = new cc(rcVar, rcVar.getParentActivity(), canvas, (rcVar.L.getMeasuredWidth() / 2.0f) + f10, (rcVar.L.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22562n, paint, createBitmap, paint2, f10, f11, 0);
                    rcVar.m0 = ccVar;
                    ccVar.setOnTouchListener(new ei.b(2));
                    rcVar.f49369n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rcVar.f49370o0 = ofFloat;
                    ofFloat.addUpdateListener(new fi.ea(rcVar, 1));
                    rcVar.f49370o0.addListener(new va(rcVar, 3));
                    rcVar.f49370o0.setDuration(400L);
                    rcVar.f49370o0.setInterpolator(org.telegram.ui.Components.js.f35060e);
                    rcVar.f49370o0.start();
                    frameLayout.addView(rcVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.g0.h3(new xb(rcVar, 0));
                    return;
                } else {
                    return;
                }
            case 4:
                bd bdVar = (bd) obj;
                long j11 = bdVar.f44022j0;
                sc scVar = bdVar.f44038w0;
                if (i7 == -1) {
                    if (bdVar.f44033s0) {
                        bd.d0(bdVar);
                        return;
                    } else {
                        bdVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1) {
                    int i16 = bdVar.f44021i0;
                    if (i16 == 0) {
                        if (bdVar.getParentActivity() != null) {
                            if (bdVar.f44033s0) {
                                bd.d0(bdVar);
                                return;
                            } else if (bdVar.d.f35433a.length() == 0) {
                                Vibrator vibrator = (Vibrator) bdVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(bdVar.d);
                                return;
                            } else {
                                bdVar.f44033s0 = true;
                                org.telegram.messenger.g0.i3(scVar, 200L);
                                if (!bdVar.f44039x.g()) {
                                    i11 = ((org.telegram.ui.ActionBar.f2) bdVar).currentAccount;
                                    bdVar.f44034t0 = Integer.valueOf(org.telegram.messenger.qp.s1(i11).U(bdVar.d.getText().toString(), new ArrayList(), bdVar.f44041y.getText().toString(), 2, false, null, null, -1, bdVar));
                                    return;
                                }
                                bdVar.f44031r0 = true;
                                return;
                            }
                        }
                        return;
                    } else if (i16 == 1) {
                        if (!bdVar.f44011b0) {
                            if (bdVar.f44041y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bdVar.getParentActivity());
                                String M0 = org.telegram.messenger.id.M0(2131752316, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131752317, null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752041, null), null);
                                bdVar.showDialog(u1Var);
                                return;
                            } else if (!bdVar.f44009a0) {
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
                                long j12 = bdVar.f44022j0;
                                String str = bdVar.Y;
                                Runnable runnable2 = new Runnable(this) {
                                    public final w9 f50979b;

                                    {
                                        this.f50979b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                bd bdVar2 = (bd) this.f50979b.f50949b;
                                                bdVar2.m0(false);
                                                org.telegram.messenger.v10 v10Var = bdVar2.f44035u0;
                                                if (v10Var != null) {
                                                    v10Var.a(bdVar2, Long.valueOf(bdVar2.f44022j0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                bd bdVar3 = (bd) this.f50979b.f50949b;
                                                bdVar3.m0(false);
                                                org.telegram.messenger.v10 v10Var2 = bdVar3.f44035u0;
                                                if (v10Var2 != null) {
                                                    v10Var2.a(bdVar3, Long.valueOf(bdVar3.f44022j0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable3 = new Runnable(this) {
                                    public final w9 f50979b;

                                    {
                                        this.f50979b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                bd bdVar2 = (bd) this.f50979b.f50949b;
                                                bdVar2.m0(false);
                                                org.telegram.messenger.v10 v10Var = bdVar2.f44035u0;
                                                if (v10Var != null) {
                                                    v10Var.a(bdVar2, Long.valueOf(bdVar2.f44022j0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                bd bdVar3 = (bd) this.f50979b.f50949b;
                                                bdVar3.m0(false);
                                                org.telegram.messenger.v10 v10Var2 = bdVar3.f44035u0;
                                                if (v10Var2 != null) {
                                                    v10Var2.a(bdVar3, Long.valueOf(bdVar3.f44022j0));
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
                            org.telegram.messenger.v10 v10Var = bdVar.f44035u0;
                            if (v10Var != null) {
                                v10Var.a(bdVar, Long.valueOf(j3));
                            }
                        }
                        if (bdVar.f44035u0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j3);
                            bundle.putInt("chatType", 2);
                            bdVar.presentFragment(new z40(bundle), true);
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
                rn rnVar = (rn) obj;
                if (i7 == -1) {
                    if (rnVar.j0(true)) {
                        rnVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    rnVar.o0();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i7 == -1) {
                    ((uo) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i7 == -1) {
                    ((bp) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                mp mpVar = (mp) obj;
                if (i7 == -1) {
                    if (mpVar.r0(true)) {
                        mpVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    mpVar.w0(true);
                    return;
                } else {
                    return;
                }
            case 9:
                rq rqVar = (rq) obj;
                if (i7 == -1) {
                    if (rqVar.l0(true)) {
                        rqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    rqVar.z0();
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) obj;
                if (i7 == -1) {
                    a8Var.dismiss();
                    return;
                } else {
                    a8Var.P0(i7);
                    return;
                }
            case 11:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.ma) obj).dismiss();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.ci ciVar = (org.telegram.ui.Components.ci) obj;
                if (i7 == -1) {
                    if (!ciVar.f32660v2.k()) {
                        ciVar.dismiss();
                        return;
                    }
                    return;
                }
                ciVar.f32660v2.w(i7);
                return;
            case 13:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.r20) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.v80 v80Var = (org.telegram.ui.Components.v80) obj;
                if (i7 == -1) {
                    if (!v80Var.R.V(true)) {
                        v80Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 10) {
                    org.telegram.ui.Components.u80 u80Var = v80Var.R;
                    u80Var.r1(u80Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 15:
                if (i7 == -1 && (runnable = ((org.telegram.ui.Components.ud0) obj).f38630r) != null) {
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
                    ((org.telegram.ui.Components.o41) obj).finishFragment();
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
                    ((dc1) obj).a(false, false);
                    return;
                }
                return;
            case 21:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i7 == -1) {
                    z4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                    if (z4Var.u()) {
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
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    if (m10 == 1) {
                        u1Var2.R = org.telegram.messenger.id.M0(2131751550, null);
                        u1Var2.T = org.telegram.messenger.id.M0(2131751551, null);
                    } else {
                        u1Var2.R = org.telegram.messenger.id.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        u1Var2.T = org.telegram.messenger.id.M0(2131751549, null);
                    }
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, null), new tr(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.il0(15));
                    u1Var2.show();
                    u1Var2.i();
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.iz.L0 = !org.telegram.messenger.iz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.iz.L0);
                    edit.apply();
                    contactsActivity.f41196r = org.telegram.messenger.iz.L0;
                    org.telegram.ui.ActionBar.g5 g5Var = contactsActivity.f41194n;
                    if (g5Var != null) {
                        org.telegram.ui.Components.ch0 iconView = g5Var.getIconView();
                        if (contactsActivity.f41196r) {
                            i12 = 2131232102;
                        } else {
                            i12 = 2131232101;
                        }
                        org.telegram.messenger.g0.R3(iconView, i12);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f41185e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f41177a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.wq.f40047g).withEndAction(new sr(contactsActivity, 0));
                    contactsActivity.f41185e0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 22:
                if (i7 == -1) {
                    ((ts) obj).finishFragment();
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
                    ((nt) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i7 == -1) {
                    ((du) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                zw zwVar = (zw) obj;
                ArrayList arrayList = zwVar.J2;
                if ((i7 == 201 || i7 == 200 || i7 == 202 || i7 == 203) && (iwVar = zwVar.C0) != null) {
                    HashMap hashMap = iwVar.B0;
                    zw zwVar2 = iwVar.L0;
                    if (i7 == 202) {
                        if (zwVar2 != null && zwVar2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(zwVar2.getParentActivity());
                            String G = org.telegram.messenger.id.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27300a;
                            u1Var3.R = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.id.M0(2131746319, null));
                            u1Var3.T = spannableStringBuilder;
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.il0(1));
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.Components.e2(16, iwVar, arrayList2));
                            TextView textView = (TextView) alertDialog$Builder3.p().d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i7 == 203) {
                        if (iwVar.O()) {
                            zwVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) zwVar2, 2, true));
                            return;
                        }
                        return;
                    } else if (i7 == 200) {
                        if (hashMap.size() == 1) {
                            iwVar.g((org.telegram.messenger.ij) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i7 == 201) {
                        zw zwVar3 = new zw(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
                        zwVar3.D2 = new org.telegram.ui.Components.ax(iwVar, 18);
                        zwVar2.presentFragment(zwVar3);
                        return;
                    } else {
                        return;
                    }
                } else if (i7 == -1) {
                    vv vvVar = zwVar.G3;
                    if (vvVar != null && vvVar.c()) {
                        lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                        if (lVar2.x()) {
                            iw iwVar2 = zwVar.C0;
                            if (iwVar2 != null && iwVar2.getVisibility() == 0) {
                                iw iwVar3 = zwVar.C0;
                                if (iwVar3.A0) {
                                    iwVar3.R(false);
                                    return;
                                }
                            }
                            zwVar.n4(true);
                            return;
                        }
                        zwVar.G3.a();
                        iw iwVar4 = zwVar.C0;
                        if (iwVar4 != null) {
                            iwVar4.S();
                            return;
                        }
                        return;
                    }
                    pw pwVar = zwVar.f52683z0;
                    if (pwVar == null || !pwVar.f33380n) {
                        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                        if (lVar.x()) {
                            iw iwVar5 = zwVar.C0;
                            if (iwVar5 != null && iwVar5.getVisibility() == 0) {
                                iw iwVar6 = zwVar.C0;
                                if (iwVar6.A0) {
                                    iwVar6.R(false);
                                    return;
                                }
                            }
                            zwVar.n4(true);
                            return;
                        } else if (zwVar.f52617m2 || zwVar.X2 != 0 || zwVar.Z2 != 0) {
                            zwVar.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    pwVar.setIsEditing(false);
                    zwVar.U4(false);
                    return;
                } else if (i7 == 1) {
                    if (zwVar.getParentActivity() != null) {
                        org.telegram.messenger.iz.f23452x = true;
                        org.telegram.messenger.iz.y();
                        int[] iArr2 = new int[2];
                        zwVar.f52583f0.getLocationInWindow(iArr2);
                        ((LaunchActivity) zwVar.getParentActivity()).K0(false, true, (zwVar.f52583f0.getMeasuredWidth() / 2) + iArr2[0], (zwVar.f52583f0.getMeasuredHeight() / 2) + iArr2[1], new dh(this, 22));
                        zwVar.getNotificationsController().Y();
                        zwVar.K3();
                        return;
                    }
                    return;
                } else if (i7 == 3) {
                    zwVar.a5(true, true, true, false);
                    zwVar.Y.b(true);
                    return;
                } else if (i7 == 11) {
                    zwVar.B4(zwVar.E1);
                    return;
                } else if (i7 == 109) {
                    org.telegram.ui.Components.fz fzVar = new org.telegram.ui.Components.fz(zwVar, arrayList);
                    fzVar.f33698t1 = new zr(this, 7);
                    zwVar.showDialog(fzVar);
                    return;
                } else if (i7 == 110) {
                    org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) zwVar.getMessagesController().T0().get(zwVar.f52577e0[0].h);
                    ArrayList J0 = org.telegram.ui.Components.fz.J0(zwVar, voVar2, arrayList, false, false);
                    if (voVar2 != null) {
                        i13 = voVar2.f26080i.size();
                    } else {
                        i13 = 0;
                    }
                    if (J0.size() + i13 > 100) {
                        zwVar.showDialog(org.telegram.ui.Components.u4.K(zwVar.getParentActivity(), org.telegram.messenger.id.M0(2131750810, null), org.telegram.messenger.id.M0(2131750811, null)).f27300a);
                        return;
                    }
                    if (!J0.isEmpty()) {
                        voVar2.f26080i.addAll(J0);
                        for (int i17 = 0; i17 < J0.size(); i17++) {
                            Long l10 = (Long) J0.get(i17);
                            voVar2.h.remove(l10);
                            voVar2.f26081j.delete(l10.longValue());
                        }
                        if (voVar2.d()) {
                            voVar2.f26080i.clear();
                        }
                        voVar = voVar2;
                        jz.z0(voVar, voVar2.f26079g, voVar2.f26075b, voVar2.f26076c, voVar2.f26085n, voVar2.f26084m, voVar2.h, voVar2.f26080i, voVar2.f26081j, false, false, true, false, false, zwVar, null);
                    } else {
                        voVar = voVar2;
                    }
                    if (J0.size() == 1) {
                        j10 = ((Long) J0.get(0)).longValue();
                    } else {
                        j10 = 0;
                    }
                    UndoView k42 = zwVar.k4();
                    if (k42 != null) {
                        k42.k(j10, 21, Integer.valueOf(J0.size()), voVar, null, null);
                    }
                    zwVar.n4(false);
                    return;
                } else if (i7 == 100 || i7 == 101 || i7 == 102 || i7 == 103 || i7 == 104 || i7 == 105 || i7 == 106 || i7 == 107 || i7 == 108) {
                    zwVar.D4(zwVar.J2, i7, true, false, null);
                    return;
                } else {
                    return;
                }
            case 28:
                hx hxVar = (hx) obj;
                int i18 = hxVar.f46445x;
                ArrayList arrayList3 = hxVar.f46439e;
                int i19 = hxVar.f46446y;
                if (i7 == -1) {
                    if (hxVar.D == null) {
                        hxVar.d0();
                        return;
                    } else {
                        hxVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1 && hxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i20)).longValue(), 0L));
                    }
                    org.telegram.messenger.yr messagesStorage = hxVar.getMessagesStorage();
                    messagesStorage.f26723a.c(new org.telegram.messenger.up(messagesStorage, i19, arrayList4, 1));
                    SharedPreferences.Editor edit2 = hxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i14 = ((org.telegram.ui.ActionBar.f2) hxVar).currentAccount;
                    edit2.putInt("account" + i19, i14);
                    edit2.putInt("type" + i19, i18);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(hxVar.getParentActivity());
                    if (i18 == 0) {
                        ChatsWidgetProvider.a(hxVar.getParentActivity(), appWidgetManager, i19);
                    } else {
                        ContactsWidgetProvider.a(hxVar.getParentActivity(), appWidgetManager, i19);
                    }
                    dx dxVar = hxVar.D;
                    if (dxVar != null) {
                        dxVar.b();
                        return;
                    } else {
                        hxVar.d0();
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (i7 == -1) {
                    ((qx) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
