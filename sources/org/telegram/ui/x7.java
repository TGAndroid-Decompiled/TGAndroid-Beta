package org.telegram.ui;

import android.animation.ValueAnimator;
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
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x7 extends org.telegram.ui.ActionBar.j {
    public final int f53702a;
    public final Object f53703b;

    public x7(Object obj, int i7) {
        this.f53702a = i7;
        this.f53703b = obj;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.z4 z4Var;
        int i10;
        int i11;
        Runnable runnable;
        int i12;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i13 = this.f53702a;
        Object obj = this.f53703b;
        switch (i13) {
            case 0:
                i8 i8Var = (i8) obj;
                if (i7 == -1) {
                    if (i8Var.Q == 0 && i8Var.R == 0 && !i8Var.H) {
                        i8Var.finishFragment();
                        return;
                    }
                    i8Var.H = false;
                    i8Var.Q = 0;
                    i8Var.R = 0;
                    i8Var.B0();
                    i8Var.u0();
                    return;
                }
                return;
            case 1:
                j9 j9Var = (j9) obj;
                if (i7 == -1) {
                    z4Var = ((org.telegram.ui.ActionBar.g2) j9Var).simpleActionBar;
                    if (z4Var.x()) {
                        j9Var.j0(true);
                        return;
                    } else {
                        j9Var.finishFragment();
                        return;
                    }
                } else if (i7 == 2) {
                    j9.e0(j9Var, false);
                    return;
                } else if (i7 == 3) {
                    j9.e0(j9Var, true);
                    return;
                } else {
                    return;
                }
            case 2:
                if (i7 == -1) {
                    ((t9) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                y9 y9Var = (y9) obj;
                if (i7 == -1) {
                    y9Var.finishFragment();
                    return;
                } else if (i7 == 1 && y9Var.f54084a.getText().length() != 0) {
                    y9.Z(y9Var);
                    y9Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 4:
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
            case 5:
                if (i7 == -1) {
                    ((lb) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                qc qcVar = (qc) obj;
                if (i7 == -1) {
                    if (qcVar.f51211b >= qcVar.Z0() && qcVar.X0()) {
                        qcVar.c1();
                        return;
                    } else {
                        qcVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1) {
                    FrameLayout frameLayout = (FrameLayout) qcVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    qcVar.M.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    qcVar.M.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    qcVar.M.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    bc bcVar = new bc(qcVar, qcVar.getParentActivity(), canvas, (qcVar.M.getMeasuredWidth() / 2.0f) + f10, (qcVar.M.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24041n, paint, createBitmap, paint2, f10, f11, 0);
                    qcVar.f51227n0 = bcVar;
                    bcVar.setOnTouchListener(new gi.a(2));
                    qcVar.f51228o0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qcVar.f51229p0 = ofFloat;
                    ofFloat.addUpdateListener(new hi.ba(qcVar, 1));
                    qcVar.f51229p0.addListener(new org.telegram.ui.Cells.y9(qcVar, 4));
                    qcVar.f51229p0.setDuration(400L);
                    qcVar.f51229p0.setInterpolator(org.telegram.ui.Components.zs.f42977e);
                    qcVar.f51229p0.start();
                    frameLayout.addView(qcVar.f51227n0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.g0.g3(new wb(qcVar, 0));
                    return;
                } else {
                    return;
                }
            case 7:
                ad adVar = (ad) obj;
                long j3 = adVar.f45590k0;
                rc rcVar = adVar.f45607x0;
                if (i7 == -1) {
                    if (adVar.f45601t0) {
                        ad.d0(adVar);
                        return;
                    } else {
                        adVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1) {
                    int i14 = adVar.f45589j0;
                    if (i14 == 0) {
                        if (adVar.getParentActivity() != null) {
                            if (adVar.f45601t0) {
                                ad.d0(adVar);
                                return;
                            } else if (adVar.d.f42534a.length() == 0) {
                                Vibrator vibrator = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(adVar.d);
                                return;
                            } else {
                                adVar.f45601t0 = true;
                                org.telegram.messenger.g0.h3(rcVar, 200L);
                                if (!adVar.f45606x.g()) {
                                    i11 = ((org.telegram.ui.ActionBar.g2) adVar).currentAccount;
                                    adVar.f45602u0 = Integer.valueOf(org.telegram.messenger.np.u1(i11).U(adVar.d.getText().toString(), new ArrayList(), adVar.f45608y.getText().toString(), 2, false, null, null, -1, adVar));
                                    return;
                                }
                                adVar.f45600s0 = true;
                                return;
                            }
                        }
                        return;
                    } else if (i14 == 1) {
                        if (!adVar.f45580c0) {
                            if (adVar.f45608y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
                                String N0 = org.telegram.messenger.hd.N0(2131752304, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.hd.N0(2131752305, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752029, null), null);
                                adVar.showDialog(t1Var);
                                return;
                            } else if (!adVar.f45578b0) {
                                Vibrator vibrator2 = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(adVar.W);
                                return;
                            } else {
                                org.telegram.messenger.g0.h3(rcVar, 200L);
                                i10 = ((org.telegram.ui.ActionBar.g2) adVar).currentAccount;
                                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i10);
                                long j10 = adVar.f45590k0;
                                String str = adVar.Z;
                                Runnable runnable2 = new Runnable(this) {
                                    public final x7 f52792b;

                                    {
                                        this.f52792b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ad adVar2 = (ad) this.f52792b.f53703b;
                                                adVar2.m0(false);
                                                org.telegram.messenger.r10 r10Var = adVar2.f45603v0;
                                                if (r10Var != null) {
                                                    r10Var.a(adVar2, Long.valueOf(adVar2.f45590k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                ad adVar3 = (ad) this.f52792b.f53703b;
                                                adVar3.m0(false);
                                                org.telegram.messenger.r10 r10Var2 = adVar3.f45603v0;
                                                if (r10Var2 != null) {
                                                    r10Var2.a(adVar3, Long.valueOf(adVar3.f45590k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable3 = new Runnable(this) {
                                    public final x7 f52792b;

                                    {
                                        this.f52792b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ad adVar2 = (ad) this.f52792b.f53703b;
                                                adVar2.m0(false);
                                                org.telegram.messenger.r10 r10Var = adVar2.f45603v0;
                                                if (r10Var != null) {
                                                    r10Var.a(adVar2, Long.valueOf(adVar2.f45590k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                ad adVar3 = (ad) this.f52792b.f53703b;
                                                adVar3.m0(false);
                                                org.telegram.messenger.r10 r10Var2 = adVar3.f45603v0;
                                                if (r10Var2 != null) {
                                                    r10Var2.a(adVar3, Long.valueOf(adVar3.f45590k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = u12.j1(j10);
                                tL_channels_updateUsername.username = str;
                                u12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.em(u12, j10, str, runnable2, adVar, tL_channels_updateUsername, runnable3), 64);
                            }
                        } else {
                            org.telegram.messenger.r10 r10Var = adVar.f45603v0;
                            if (r10Var != null) {
                                r10Var.a(adVar, Long.valueOf(j3));
                            }
                        }
                        if (adVar.f45603v0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j3);
                            bundle.putInt("chatType", 2);
                            adVar.presentFragment(new z40(bundle), true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 8:
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
            case 9:
                if (i7 == -1) {
                    ((vo) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i7 == -1) {
                    ((cp) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                np npVar = (np) obj;
                if (i7 == -1) {
                    if (npVar.r0(true)) {
                        npVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    npVar.w0(true);
                    return;
                } else {
                    return;
                }
            case 12:
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
            case 13:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) obj;
                if (i7 == -1) {
                    f8Var.dismiss();
                    return;
                } else {
                    f8Var.Q0(i7);
                    return;
                }
            case 14:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.sa) obj).dismiss();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.ui uiVar = (org.telegram.ui.Components.ui) obj;
                if (i7 == -1) {
                    if (!uiVar.f40440w2.k()) {
                        uiVar.dismiss();
                        return;
                    }
                    return;
                }
                uiVar.f40440w2.w(i7);
                return;
            case 16:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.f30) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.k90 k90Var = (org.telegram.ui.Components.k90) obj;
                if (i7 == -1) {
                    if (!k90Var.S.V(true)) {
                        k90Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 10) {
                    org.telegram.ui.Components.j90 j90Var = k90Var.S;
                    j90Var.r1(j90Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 18:
                if (i7 == -1 && (runnable = ((org.telegram.ui.Components.fe0) obj).f35216r) != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
            case 19:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.ff0) obj).dismiss();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.ap0) obj).onBackPressed();
                return;
            case 21:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.e51) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.voip.w0) obj).b(false, false);
                    return;
                }
                return;
            case 23:
                if (i7 == -1) {
                    ((bc1) obj).a(false, false);
                    return;
                }
                return;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i7 == -1) {
                    z4Var2 = ((org.telegram.ui.ActionBar.g2) contactsActivity).simpleActionBar;
                    if (z4Var2.x()) {
                        contactsActivity.m0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i7 == 100) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.f43021a0;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                    if (m10 == 1) {
                        t1Var2.S = org.telegram.messenger.hd.N0(2131751538, null);
                        t1Var2.U = org.telegram.messenger.hd.N0(2131751539, null);
                    } else {
                        t1Var2.S = org.telegram.messenger.hd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        t1Var2.U = org.telegram.messenger.hd.N0(2131751537, null);
                    }
                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131751586, null), new tr(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), new org.telegram.ui.Components.xb0(22));
                    t1Var2.show();
                    t1Var2.i();
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.cz.L0 = !org.telegram.messenger.cz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.cz.L0);
                    edit.apply();
                    contactsActivity.f43040r = org.telegram.messenger.cz.L0;
                    org.telegram.ui.ActionBar.g5 g5Var = contactsActivity.f43037n;
                    if (g5Var != null) {
                        org.telegram.ui.Components.rh0 iconView = g5Var.getIconView();
                        if (contactsActivity.f43040r) {
                            i12 = 2131232104;
                        } else {
                            i12 = 2131232103;
                        }
                        org.telegram.messenger.g0.P3(iconView, i12);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f43030f0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f43020a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.nr.f37961g).withEndAction(new sr(contactsActivity, 0));
                    contactsActivity.f43030f0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 25:
                if (i7 == -1) {
                    ((us) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i7 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i7 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i7 == -1) {
                    ((pt) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i7 == -1) {
                    ((eu) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
