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
    public final int f50986a;
    public final Object f50987b;

    public w9(Object obj, int i7) {
        this.f50986a = i7;
        this.f50987b = obj;
    }

    @Override
    public final void b(int i7) {
        long j3;
        int i10;
        int i11;
        Runnable runnable;
        int i12;
        org.telegram.ui.ActionBar.y4 y4Var;
        hw hwVar;
        int i13;
        org.telegram.messenger.vo voVar;
        long j10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        int i15 = this.f50986a;
        Object obj = this.f50987b;
        switch (i15) {
            case 0:
                y9 y9Var = (y9) obj;
                if (i7 == -1) {
                    y9Var.finishFragment();
                    return;
                } else if (i7 == 1 && y9Var.f52001a.getText().length() != 0) {
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
                    if (rcVar.f49408b >= rcVar.Z0() && rcVar.X0()) {
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
                    cc ccVar = new cc(rcVar, rcVar.getParentActivity(), canvas, (rcVar.L.getMeasuredWidth() / 2.0f) + f10, (rcVar.L.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22558n, paint, createBitmap, paint2, f10, f11, 0);
                    rcVar.m0 = ccVar;
                    ccVar.setOnTouchListener(new ei.b(2));
                    rcVar.f49424n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rcVar.f49425o0 = ofFloat;
                    ofFloat.addUpdateListener(new fi.ea(rcVar, 1));
                    rcVar.f49425o0.addListener(new va(rcVar, 3));
                    rcVar.f49425o0.setDuration(400L);
                    rcVar.f49425o0.setInterpolator(org.telegram.ui.Components.ks.f35469e);
                    rcVar.f49425o0.start();
                    frameLayout.addView(rcVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.g0.h3(new xb(rcVar, 0));
                    return;
                } else {
                    return;
                }
            case 4:
                bd bdVar = (bd) obj;
                long j11 = bdVar.f43993j0;
                sc scVar = bdVar.f44009w0;
                if (i7 == -1) {
                    if (bdVar.f44004s0) {
                        bd.d0(bdVar);
                        return;
                    } else {
                        bdVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1) {
                    int i16 = bdVar.f43992i0;
                    if (i16 == 0) {
                        if (bdVar.getParentActivity() != null) {
                            if (bdVar.f44004s0) {
                                bd.d0(bdVar);
                                return;
                            } else if (bdVar.d.f35841a.length() == 0) {
                                Vibrator vibrator = (Vibrator) bdVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(bdVar.d);
                                return;
                            } else {
                                bdVar.f44004s0 = true;
                                org.telegram.messenger.g0.i3(scVar, 200L);
                                if (!bdVar.f44010x.g()) {
                                    i11 = ((org.telegram.ui.ActionBar.f2) bdVar).currentAccount;
                                    bdVar.f44005t0 = Integer.valueOf(org.telegram.messenger.qp.s1(i11).U(bdVar.d.getText().toString(), new ArrayList(), bdVar.f44012y.getText().toString(), 2, false, null, null, -1, bdVar));
                                    return;
                                }
                                bdVar.f44002r0 = true;
                                return;
                            }
                        }
                        return;
                    } else if (i16 == 1) {
                        if (!bdVar.f43982b0) {
                            if (bdVar.f44012y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bdVar.getParentActivity());
                                String M0 = org.telegram.messenger.id.M0(2131752316, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131752317, null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752041, null), null);
                                bdVar.showDialog(u1Var);
                                return;
                            } else if (!bdVar.f43980a0) {
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
                                long j12 = bdVar.f43993j0;
                                String str = bdVar.Y;
                                Runnable runnable2 = new Runnable(this) {
                                    public final w9 f51029b;

                                    {
                                        this.f51029b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                bd bdVar2 = (bd) this.f51029b.f50987b;
                                                bdVar2.m0(false);
                                                org.telegram.messenger.v10 v10Var = bdVar2.f44006u0;
                                                if (v10Var != null) {
                                                    v10Var.a(bdVar2, Long.valueOf(bdVar2.f43993j0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                bd bdVar3 = (bd) this.f51029b.f50987b;
                                                bdVar3.m0(false);
                                                org.telegram.messenger.v10 v10Var2 = bdVar3.f44006u0;
                                                if (v10Var2 != null) {
                                                    v10Var2.a(bdVar3, Long.valueOf(bdVar3.f43993j0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable3 = new Runnable(this) {
                                    public final w9 f51029b;

                                    {
                                        this.f51029b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                bd bdVar2 = (bd) this.f51029b.f50987b;
                                                bdVar2.m0(false);
                                                org.telegram.messenger.v10 v10Var = bdVar2.f44006u0;
                                                if (v10Var != null) {
                                                    v10Var.a(bdVar2, Long.valueOf(bdVar2.f43993j0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                bd bdVar3 = (bd) this.f51029b.f50987b;
                                                bdVar3.m0(false);
                                                org.telegram.messenger.v10 v10Var2 = bdVar3.f44006u0;
                                                if (v10Var2 != null) {
                                                    v10Var2.a(bdVar3, Long.valueOf(bdVar3.f43993j0));
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
                            org.telegram.messenger.v10 v10Var = bdVar.f44006u0;
                            if (v10Var != null) {
                                v10Var.a(bdVar, Long.valueOf(j3));
                            }
                        }
                        if (bdVar.f44006u0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j3);
                            bundle.putInt("chatType", 2);
                            bdVar.presentFragment(new y40(bundle), true);
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
                qq qqVar = (qq) obj;
                if (i7 == -1) {
                    if (qqVar.l0(true)) {
                        qqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    qqVar.z0();
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
                    if (!diVar.f33047s2.k()) {
                        diVar.dismiss();
                        return;
                    }
                    return;
                }
                diVar.f33047s2.w(i7);
                return;
            case 13:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.s20) obj).finishFragment();
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
                if (i7 == -1 && (runnable = ((org.telegram.ui.Components.vd0) obj).f39045r) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
            case 16:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.re0) obj).dismiss();
                    return;
                }
                return;
            case 17:
                ((org.telegram.ui.Components.no0) obj).onBackPressed();
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
                    ((cc1) obj).a(false, false);
                    return;
                }
                return;
            case 21:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i7 == -1) {
                    y4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                    if (y4Var.t()) {
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
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    if (m10 == 1) {
                        u1Var2.R = org.telegram.messenger.id.M0(2131751550, null);
                        u1Var2.T = org.telegram.messenger.id.M0(2131751551, null);
                    } else {
                        u1Var2.R = org.telegram.messenger.id.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        u1Var2.T = org.telegram.messenger.id.M0(2131751549, null);
                    }
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, null), new sr(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.jl0(15));
                    u1Var2.show();
                    u1Var2.i();
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.iz.L0 = !org.telegram.messenger.iz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.iz.L0);
                    edit.apply();
                    contactsActivity.f41205r = org.telegram.messenger.iz.L0;
                    org.telegram.ui.ActionBar.f5 f5Var = contactsActivity.f41203n;
                    if (f5Var != null) {
                        org.telegram.ui.Components.dh0 iconView = f5Var.getIconView();
                        if (contactsActivity.f41205r) {
                            i12 = 2131232102;
                        } else {
                            i12 = 2131232101;
                        }
                        org.telegram.messenger.g0.R3(iconView, i12);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f41194e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f41186a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.xq.f40459g).withEndAction(new rr(contactsActivity, 0));
                    contactsActivity.f41194e0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 22:
                if (i7 == -1) {
                    ((ss) obj).finishFragment();
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
                    ((mt) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i7 == -1) {
                    ((cu) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                yw ywVar = (yw) obj;
                ArrayList arrayList = ywVar.J2;
                if ((i7 == 201 || i7 == 200 || i7 == 202 || i7 == 203) && (hwVar = ywVar.C0) != null) {
                    HashMap hashMap = hwVar.B0;
                    yw ywVar2 = hwVar.L0;
                    if (i7 == 202) {
                        if (ywVar2 != null && ywVar2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ywVar2.getParentActivity());
                            String G = org.telegram.messenger.id.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27296a;
                            u1Var3.R = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.id.M0(2131746319, null));
                            u1Var3.T = spannableStringBuilder;
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.jl0(1));
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.Components.f2(16, hwVar, arrayList2));
                            TextView textView = (TextView) alertDialog$Builder3.p().d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i7 == 203) {
                        if (hwVar.O()) {
                            ywVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) ywVar2, 2, true));
                            return;
                        }
                        return;
                    } else if (i7 == 200) {
                        if (hashMap.size() == 1) {
                            hwVar.g((org.telegram.messenger.ij) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i7 == 201) {
                        yw ywVar3 = new yw(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
                        ywVar3.D2 = new org.telegram.ui.Components.bx(hwVar, 18);
                        ywVar2.presentFragment(ywVar3);
                        return;
                    } else {
                        return;
                    }
                } else if (i7 == -1) {
                    uv uvVar = ywVar.G3;
                    if (uvVar != null && uvVar.c()) {
                        kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                        if (kVar2.w()) {
                            hw hwVar2 = ywVar.C0;
                            if (hwVar2 != null && hwVar2.getVisibility() == 0) {
                                hw hwVar3 = ywVar.C0;
                                if (hwVar3.A0) {
                                    hwVar3.R(false);
                                    return;
                                }
                            }
                            ywVar.n4(true);
                            return;
                        }
                        ywVar.G3.a();
                        hw hwVar4 = ywVar.C0;
                        if (hwVar4 != null) {
                            hwVar4.S();
                            return;
                        }
                        return;
                    }
                    ow owVar = ywVar.f52337z0;
                    if (owVar == null || !owVar.f33782n) {
                        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                        if (kVar.w()) {
                            hw hwVar5 = ywVar.C0;
                            if (hwVar5 != null && hwVar5.getVisibility() == 0) {
                                hw hwVar6 = ywVar.C0;
                                if (hwVar6.A0) {
                                    hwVar6.R(false);
                                    return;
                                }
                            }
                            ywVar.n4(true);
                            return;
                        } else if (ywVar.f52271m2 || ywVar.X2 != 0 || ywVar.Z2 != 0) {
                            ywVar.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    owVar.setIsEditing(false);
                    ywVar.U4(false);
                    return;
                } else if (i7 == 1) {
                    if (ywVar.getParentActivity() != null) {
                        org.telegram.messenger.iz.f23448x = true;
                        org.telegram.messenger.iz.y();
                        int[] iArr2 = new int[2];
                        ywVar.f52237f0.getLocationInWindow(iArr2);
                        ((LaunchActivity) ywVar.getParentActivity()).K0(false, true, (ywVar.f52237f0.getMeasuredWidth() / 2) + iArr2[0], (ywVar.f52237f0.getMeasuredHeight() / 2) + iArr2[1], new dh(this, 22));
                        ywVar.getNotificationsController().Y();
                        ywVar.K3();
                        return;
                    }
                    return;
                } else if (i7 == 3) {
                    ywVar.a5(true, true, true, false);
                    ywVar.Y.b(true);
                    return;
                } else if (i7 == 11) {
                    ywVar.B4(ywVar.E1);
                    return;
                } else if (i7 == 109) {
                    org.telegram.ui.Components.gz gzVar = new org.telegram.ui.Components.gz(ywVar, arrayList);
                    gzVar.f34104q1 = new yr(this, 7);
                    ywVar.showDialog(gzVar);
                    return;
                } else if (i7 == 110) {
                    org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) ywVar.getMessagesController().T0().get(ywVar.f52231e0[0].h);
                    ArrayList J0 = org.telegram.ui.Components.gz.J0(ywVar, voVar2, arrayList, false, false);
                    if (voVar2 != null) {
                        i13 = voVar2.f26076i.size();
                    } else {
                        i13 = 0;
                    }
                    if (J0.size() + i13 > 100) {
                        ywVar.showDialog(org.telegram.ui.Components.v4.K(ywVar.getParentActivity(), org.telegram.messenger.id.M0(2131750810, null), org.telegram.messenger.id.M0(2131750811, null)).f27296a);
                        return;
                    }
                    if (!J0.isEmpty()) {
                        voVar2.f26076i.addAll(J0);
                        for (int i17 = 0; i17 < J0.size(); i17++) {
                            Long l10 = (Long) J0.get(i17);
                            voVar2.h.remove(l10);
                            voVar2.f26077j.delete(l10.longValue());
                        }
                        if (voVar2.d()) {
                            voVar2.f26076i.clear();
                        }
                        voVar = voVar2;
                        iz.z0(voVar, voVar2.f26075g, voVar2.f26071b, voVar2.f26072c, voVar2.f26081n, voVar2.f26080m, voVar2.h, voVar2.f26076i, voVar2.f26077j, false, false, true, false, false, ywVar, null);
                    } else {
                        voVar = voVar2;
                    }
                    if (J0.size() == 1) {
                        j10 = ((Long) J0.get(0)).longValue();
                    } else {
                        j10 = 0;
                    }
                    UndoView k42 = ywVar.k4();
                    if (k42 != null) {
                        k42.k(j10, 21, Integer.valueOf(J0.size()), voVar, null, null);
                    }
                    ywVar.n4(false);
                    return;
                } else if (i7 == 100 || i7 == 101 || i7 == 102 || i7 == 103 || i7 == 104 || i7 == 105 || i7 == 106 || i7 == 107 || i7 == 108) {
                    ywVar.D4(ywVar.J2, i7, true, false, null);
                    return;
                } else {
                    return;
                }
            case 28:
                gx gxVar = (gx) obj;
                int i18 = gxVar.f46090x;
                ArrayList arrayList3 = gxVar.f46084e;
                int i19 = gxVar.f46091y;
                if (i7 == -1) {
                    if (gxVar.D == null) {
                        gxVar.d0();
                        return;
                    } else {
                        gxVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1 && gxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i20)).longValue(), 0L));
                    }
                    org.telegram.messenger.yr messagesStorage = gxVar.getMessagesStorage();
                    messagesStorage.f26719a.c(new org.telegram.messenger.up(messagesStorage, i19, arrayList4, 1));
                    SharedPreferences.Editor edit2 = gxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i14 = ((org.telegram.ui.ActionBar.f2) gxVar).currentAccount;
                    edit2.putInt("account" + i19, i14);
                    edit2.putInt("type" + i19, i18);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(gxVar.getParentActivity());
                    if (i18 == 0) {
                        ChatsWidgetProvider.a(gxVar.getParentActivity(), appWidgetManager, i19);
                    } else {
                        ContactsWidgetProvider.a(gxVar.getParentActivity(), appWidgetManager, i19);
                    }
                    cx cxVar = gxVar.D;
                    if (cxVar != null) {
                        cxVar.b();
                        return;
                    } else {
                        gxVar.d0();
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (i7 == -1) {
                    ((px) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
