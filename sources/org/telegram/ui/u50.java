package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class u50 implements View.OnClickListener {

    public final int f43121a;

    public final Object f43122b;

    public u50(Object obj, int i10) {
        this.f43121a = i10;
        this.f43122b = obj;
    }

    @Override
    public final void onClick(View view) {
        int iB;
        int i10 = 19;
        final int i11 = 4;
        int i12 = 27;
        final int i13 = 3;
        final int i14 = 2;
        final int i15 = 0;
        switch (this.f43121a) {
            case 0:
                org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) this.f43122b;
                bpVar.a(!bpVar.f27188a.f26309q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", bpVar.f27188a.f26309q).apply();
                break;
            case 1:
                ((z50) this.f43122b).f45031b.T0(19);
                break;
            case 2:
                o60 o60Var = ((m60) this.f43122b).E;
                o60Var.T = null;
                o60Var.V.b();
                o60Var.h.b();
                o60Var.k0();
                o60Var.r0();
                break;
            case 3:
                c70.a0(((a70) this.f43122b).d, null);
                break;
            case 4:
                t70.V((t70) this.f43122b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.f43122b;
                ArrayList arrayList = launchActivity.A0;
                launchActivity.D0 = null;
                launchActivity.p0(new LanguageSelectActivity());
                while (i15 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i15)).isShowing()) {
                        ((Dialog) arrayList.get(i15)).dismiss();
                    }
                    i15++;
                }
                arrayList.clear();
                break;
            case 6:
                final me0 me0Var = (me0) this.f43122b;
                ig0 ig0Var = me0Var.f40464y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                        switch (i15) {
                            case 0:
                                me0Var.f40464y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                me0 me0Var2 = me0Var;
                                ig0.n0(me0Var2.f40464y, me0Var2.f40460r, me0Var2.f40461s, me0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                        switch (c10) {
                            case 0:
                                me0Var.f40464y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                me0 me0Var2 = me0Var;
                                ig0.n0(me0Var2.f40464y, me0Var2.f40460r, me0Var2.f40461s, me0Var2.v);
                                break;
                        }
                    }
                });
                Dialog dialogShowDialog = ig0Var.showDialog(alertDialog$Builder.f22702a);
                if (dialogShowDialog != null) {
                    dialogShowDialog.setCanceledOnTouchOutside(false);
                    dialogShowDialog.setCancelable(false);
                }
                break;
            case 7:
                ue0 ue0Var = (ue0) this.f43122b;
                ig0 ig0Var2 = ue0Var.A;
                if (ig0Var2.R.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var2.getParentActivity());
                    alertDialog$Builder2.f22702a.N = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.f22702a.P = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new zt(ue0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    ig0Var2.showDialog(alertDialog$Builder2.f22702a);
                    break;
                }
                break;
            case 8:
                xe0 xe0Var = (xe0) this.f43122b;
                NotificationCenter.getGlobalInstance().addObserver(new we0(xe0Var), NotificationCenter.onActivityResultReceived);
                Context context = xe0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap map = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                y5.l.f(str);
                hashSet.add(GoogleSignInOptions.f3111w);
                if (hashSet.contains(GoogleSignInOptions.A)) {
                    Scope scope = GoogleSignInOptions.f3113y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.f3112x);
                com.google.android.gms.internal.clearcut.v0 v0VarA = g7.m8.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
                v0VarA.g().addOnCompleteListener(new zr(i12, xe0Var, v0VarA));
                break;
            case 9:
                final hh0 hh0Var = (hh0) this.f43122b;
                kh0 kh0Var = hh0Var.G;
                if (hh0Var.f38830n != null) {
                    View view2 = kh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.b70 b70VarF = org.telegram.ui.Components.b70.F((ViewGroup) view2, null, hh0Var);
                        if (hh0Var.f38830n.revoked) {
                            b70VarF.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.f38830n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i16 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i17) {
                                                    switch (i16) {
                                                        case 0:
                                                            hh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.f38830n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.f38830n.link));
                                                    org.telegram.ui.Components.mc.j(hh0Var3.G).j();
                                                }
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.G;
                                            try {
                                                if (hh0Var4.f38830n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.f38830n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.f38830n;
                                            fb0 fb0Var = new fb0(1, kh0Var3.f39753n);
                                            fb0Var.P = kh0Var3.f39755o0;
                                            fb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(fb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.f38830n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i17 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i18) {
                                                    switch (i17) {
                                                        case 0:
                                                            hh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i16 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            b70VarF.c(i16, string2, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.f38830n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i17 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i18) {
                                                    switch (i17) {
                                                        case 0:
                                                            hh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.f38830n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.f38830n.link));
                                                    org.telegram.ui.Components.mc.j(hh0Var3.G).j();
                                                }
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.G;
                                            try {
                                                if (hh0Var4.f38830n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.f38830n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.f38830n;
                                            fb0 fb0Var = new fb0(1, kh0Var3.f39753n);
                                            fb0Var.P = kh0Var3.f39755o0;
                                            fb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(fb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.f38830n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i18 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                    switch (i18) {
                                                        case 0:
                                                            hh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            b70VarF.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.f38830n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i17 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                    switch (i17) {
                                                        case 0:
                                                            hh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.f38830n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.f38830n.link));
                                                    org.telegram.ui.Components.mc.j(hh0Var3.G).j();
                                                }
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.G;
                                            try {
                                                if (hh0Var4.f38830n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.f38830n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.f38830n;
                                            fb0 fb0Var = new fb0(1, kh0Var3.f39753n);
                                            fb0Var.P = kh0Var3.f39755o0;
                                            fb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(fb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.f38830n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i18 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                    switch (i18) {
                                                        case 0:
                                                            hh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            b70VarF.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.f38830n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i17 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                    switch (i17) {
                                                        case 0:
                                                            hh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.f38830n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.f38830n.link));
                                                    org.telegram.ui.Components.mc.j(hh0Var3.G).j();
                                                }
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.G;
                                            try {
                                                if (hh0Var4.f38830n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.f38830n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.f38830n;
                                            fb0 fb0Var = new fb0(1, kh0Var3.f39753n);
                                            fb0Var.P = kh0Var3.f39755o0;
                                            fb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(fb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.f38830n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i18 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                    switch (i18) {
                                                        case 0:
                                                            hh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !hh0Var.f38830n.permanent && kh0Var.f39752l0);
                            b70VarF.m(kh0Var.f39752l0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.f38830n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i17 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                    switch (i17) {
                                                        case 0:
                                                            hh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.f38830n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.f38830n.link));
                                                    org.telegram.ui.Components.mc.j(hh0Var3.G).j();
                                                }
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.G;
                                            try {
                                                if (hh0Var4.f38830n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.f38830n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.f38830n;
                                            fb0 fb0Var = new fb0(1, kh0Var3.f39753n);
                                            fb0Var.P = kh0Var3.f39755o0;
                                            fb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(fb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.f38830n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i18 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() {
                                                @Override
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                    switch (i18) {
                                                        case 0:
                                                            hh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.w(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        b70VarF.W(kh0Var.f39738b.V0(hh0Var, false));
                        b70VarF.Z();
                        break;
                    }
                }
                break;
            case 10:
                vi0 vi0Var = (vi0) this.f43122b;
                long j10 = vi0Var.f43469b;
                if (!vi0Var.f43473n.isStory()) {
                    if (vi0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) vi0Var.getParentLayout().getFragmentStack().get(vi0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((n2Var instanceof rn) && ((rn) n2Var).f42026e.f22380id == j10) {
                            vi0Var.finishFragment();
                        }
                    }
                    Bundle bundleH = com.google.android.recaptcha.internal.a.h(j10, "chat_id");
                    bundleH.putInt("message_id", vi0Var.f43470c);
                    bundleH.putBoolean("need_remove_previous_same_chat_activity", false);
                    vi0Var.presentFragment(new rn(bundleH));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) this.f43122b;
                p8Var.setChecked(!p8Var.f25003e.h);
                break;
            case 12:
                Context context2 = (Context) this.f43122b;
                Pattern pattern = org.telegram.ui.Components.y4.f34802a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder3.f22702a.show();
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f43122b;
                int i17 = passcodeActivity.f35577x;
                if (i17 != 1) {
                    if (i17 == 2) {
                        passcodeActivity.g0();
                    }
                } else if (passcodeActivity.A != 0) {
                    passcodeActivity.g0();
                } else {
                    passcodeActivity.h0();
                }
                break;
            case 14:
                bl0 bl0Var = (bl0) this.f43122b;
                if (!bl0Var.f36850a.getAnimatedDrawable().f31317h0) {
                    bl0Var.f36850a.getAnimatedDrawable().L(0, false, false);
                    bl0Var.f36850a.d();
                }
                break;
            case 15:
                ((PasskeysActivity) this.f43122b).Z(view);
                break;
            case 16:
                tm0 tm0Var = (tm0) this.f43122b;
                if (!tm0Var.F) {
                    int i18 = tm0Var.I;
                    if ((i18 == 4 && tm0Var.H == 2) || i18 == 0) {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + tm0Var.f42966a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + tm0Var.f42966a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + tm0Var.G);
                            tm0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                        } catch (Exception unused) {
                            org.telegram.ui.Components.y4.u0(tm0Var.M, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    } else {
                        tm0Var.t();
                    }
                    break;
                }
                break;
            case 17:
                ((vo0) this.f43122b).f43505f0.w0();
                break;
            case 18:
                jp0 jp0Var = (jp0) this.f43122b;
                rn rnVar = jp0Var.B;
                if (rnVar != null && rnVar.c()) {
                    org.telegram.ui.Components.y4.L(jp0Var.getParentActivity(), rnVar.a(), new bp0(jp0Var, i15));
                } else {
                    jp0Var.V(jp0Var.f39462b, jp0Var.f39463c, true, 0);
                    jp0Var.finishFragment();
                }
                break;
            case 19:
                aq0 aq0Var = (aq0) this.f43122b;
                rn rnVar2 = aq0Var.Q;
                if (rnVar2 != null && rnVar2.c()) {
                    org.telegram.ui.Components.y4.L(aq0Var.getParentActivity(), rnVar2.a(), new np0(aq0Var, i15));
                } else {
                    aq0Var.e0(0, true);
                }
                break;
            case 20:
                nt0 nt0Var = (nt0) this.f43122b;
                if (nt0Var != null) {
                    nt0Var.y(0, AndroidUtilities.dp(64.0f), false);
                }
                break;
            case 21:
                vt0 vt0Var = (vt0) this.f43122b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = vt0Var.d;
                int iIndexOf = photoViewer.f35608c7.indexOf(tag);
                if (iIndexOf < 0) {
                    int iQ = photoViewer.d.Q(tag);
                    if (iQ >= 0) {
                        photoViewer.l1.u(iQ);
                        if (iQ == 0) {
                            photoViewer.l1.m(0);
                        }
                        photoViewer.A3();
                    }
                } else {
                    int iK = photoViewer.d.k(iIndexOf, photoViewer.n1());
                    boolean zX = photoViewer.d.x(iIndexOf);
                    if (iIndexOf == photoViewer.L4) {
                        photoViewer.J0.b(zX, true);
                    }
                    if (iK >= 0) {
                        photoViewer.l1.u(iK);
                        if (iK == 0) {
                            photoViewer.l1.m(0);
                        }
                    }
                    photoViewer.A3();
                }
                break;
            case 22:
                yu0 yu0Var = (yu0) this.f43122b;
                boolean[] zArr = yu0Var.f44945w;
                CharSequence[] charSequenceArr = yu0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view.getParent();
                    f2.o1 o1VarG = yu0Var.f44920c.G(z5Var);
                    if (o1VarG != null && (iB = o1VarG.b()) != -1) {
                        int i19 = iB - yu0Var.f44930j0;
                        if (yu0Var.E && i19 < yu0Var.f44947x) {
                            int i20 = -yu0Var.K;
                            yu0Var.K = i20;
                            AndroidUtilities.shakeViewSpring(z5Var, i20);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        } else {
                            yu0Var.f44918b.u(iB);
                            int i21 = i19 + 1;
                            System.arraycopy(charSequenceArr, i21, charSequenceArr, i19, (charSequenceArr.length - 1) - i19);
                            System.arraycopy(zArr, i21, zArr, i19, (zArr.length - 1) - i19);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i22 = yu0Var.f44949y - 1;
                            yu0Var.f44949y = i22;
                            if (yu0Var.f44938r != null) {
                                int[] iArr = new int[i22];
                                while (i15 < i22) {
                                    iArr[i15] = yu0Var.f44938r[i15 >= i19 ? i15 + 1 : i15];
                                    i15++;
                                }
                                yu0Var.f44938r = iArr;
                            }
                            if (yu0Var.f44949y == charSequenceArr.length - 1) {
                                yu0Var.f44918b.o((yu0Var.f44930j0 + charSequenceArr.length) - 1);
                            }
                            f2.o1 o1VarK = yu0Var.f44920c.K(iB - 1);
                            EditTextBoldCursor textView = z5Var.getTextView();
                            if (o1VarK != null) {
                                View view3 = o1VarK.f5789a;
                                if (view3 instanceof org.telegram.ui.Cells.z5) {
                                    ((org.telegram.ui.Cells.z5) view3).getTextView().requestFocus();
                                } else if (textView.isFocused()) {
                                    AndroidUtilities.hideKeyboard(textView);
                                    yu0Var.k0(true);
                                } else if (yu0Var.f44948x0) {
                                    yu0Var.k0(true);
                                }
                            } else if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                yu0Var.k0(true);
                            } else if (yu0Var.f44948x0) {
                                yu0Var.k0(true);
                            }
                            textView.clearFocus();
                            yu0Var.i0();
                            yu0Var.r0();
                            org.telegram.ui.Components.wx0 wx0Var = yu0Var.M;
                            if (wx0Var != null) {
                                wx0Var.f();
                                yu0Var.M.setDelegate(null);
                            }
                            yu0Var.f44918b.m(yu0Var.f44932l0);
                        }
                        break;
                    }
                }
                break;
            case 23:
                ((jv0) this.f43122b).c(true);
                break;
            case 24:
                ((jv0) ((cg.u) this.f43122b).f2826c).c(true);
                break;
            case 25:
                PrivacyControlActivity privacyControlActivity = ((uw0) this.f43122b).d;
                privacyControlActivity.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) privacyControlActivity, 27, false));
                break;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f43122b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                int iIntValue = ((Integer) y1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.V;
                boolean z10 = !zArr2[iIntValue];
                zArr2[iIntValue] = z10;
                y1Var.c(z10, true);
                break;
            case 27:
                d11 d11Var = (d11) this.f43122b;
                ProxyListActivity proxyListActivity = d11Var.f37239s;
                SharedConfig.ProxyInfo proxyInfo = d11Var.d;
                j11 j11Var = new j11(null);
                j11Var.f39226e = new org.telegram.ui.Cells.w6[3];
                j11Var.f39227f = new org.telegram.ui.Cells.x8[2];
                j11Var.f39230s = new org.telegram.ui.Cells.g6[2];
                j11Var.v = -1;
                j11Var.f39231w = -1;
                j11Var.A = 1.0f;
                j11Var.B = new float[2];
                j11Var.C = true;
                j11Var.I = new e11(j11Var);
                j11Var.G = proxyInfo;
                proxyListActivity.presentFragment(j11Var);
                break;
            case 28:
                x11 x11Var = (x11) this.f43122b;
                ValueAnimator valueAnimator = x11Var.J;
                if (valueAnimator == null) {
                    boolean z11 = !x11Var.I;
                    y11 y11Var = x11Var.d;
                    v11 v11Var = x11Var.B;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) y11Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) x11Var.f44250e.getDecorView();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    v11Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    v11Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    v11Var.getLocationInWindow(iArr2);
                    float f10 = iArr2[0];
                    float f11 = iArr2[1];
                    float measuredWidth = (v11Var.getMeasuredWidth() / 2.0f) + f10;
                    float measuredHeight = (v11Var.getMeasuredHeight() / 2.0f) + f11;
                    float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) * 0.9f;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                    x11Var.K = new lh.bb(x11Var, y11Var.getParentActivity(), z11, canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f10, f11, 2);
                    x11Var.L = 0.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    x11Var.J = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new w01(x11Var, 3));
                    x11Var.J.addListener(new f50(x11Var, 24));
                    x11Var.J.setDuration(400L);
                    x11Var.J.setInterpolator(org.telegram.ui.Components.ws.f34319e);
                    x11Var.J.start();
                    frameLayout2.addView(x11Var.K, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.f50(15, x11Var, z11));
                    break;
                }
                break;
            default:
                w21 w21Var = (w21) this.f43122b;
                lh.d dVar = w21Var.f43588s;
                if (dVar.S && !dVar.J) {
                    dVar.setLoading(true);
                    x21.H(w21Var.v, ((TextView) w21Var.h.d).getText(), w21Var.d.option, w21Var.f43586n.getText().toString());
                    break;
                }
                break;
        }
    }
}
