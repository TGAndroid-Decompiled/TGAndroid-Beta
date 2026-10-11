package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t81 extends org.telegram.ui.Components.qm0 {
    public final Context f42156c;
    public final SessionsActivity d;

    public t81(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f42156c = context;
        C(true);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10;
        int i11;
        int b10 = d1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i10) {
            if (b10 < sessionsActivity.K || b10 >= sessionsActivity.L) {
                if (b10 < sessionsActivity.M || b10 >= sessionsActivity.N) {
                    if ((b10 < sessionsActivity.G || b10 >= sessionsActivity.H) && b10 != sessionsActivity.f34545y) {
                        i11 = sessionsActivity.ttlRow;
                        if (b10 != i11) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.S;
    }

    @Override
    public final long i(int i10) {
        int i11;
        int i12;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            hash = Objects.hash(0, 0);
        } else if (i10 == sessionsActivity.E) {
            hash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.O) {
            hash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.I) {
            hash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.R) {
            hash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.U) {
            hash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.P) {
            hash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.f34544x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.f34545y) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.K;
            if (i10 >= i13 && i10 < sessionsActivity.L) {
                TLObject tLObject = (TLObject) sessionsActivity.f34538e.get(i10 - i13);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else {
                    if (tLObject instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            } else {
                int i14 = sessionsActivity.M;
                if (i10 >= i14 && i10 < sessionsActivity.N) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.h.get(i10 - i14)).bot_id));
                } else {
                    int i15 = sessionsActivity.G;
                    if (i10 >= i15 && i10 < sessionsActivity.H) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.f34539f.get(i10 - i15);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i10 != sessionsActivity.Q) {
                        i12 = sessionsActivity.ttlRow;
                        if (i10 == i12) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    } else {
                        hash = Objects.hash(0, 12);
                    }
                }
            }
        }
        return hash;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 != i11) {
            if (i10 != sessionsActivity.E && i10 != sessionsActivity.O && i10 != sessionsActivity.I && i10 != sessionsActivity.R && i10 != sessionsActivity.U && i10 != sessionsActivity.P) {
                if (i10 != sessionsActivity.f34544x && i10 != sessionsActivity.J && i10 != sessionsActivity.F && i10 != sessionsActivity.T) {
                    if (i10 != sessionsActivity.f34545y) {
                        if (i10 < sessionsActivity.K || i10 >= sessionsActivity.L) {
                            if (i10 < sessionsActivity.M || i10 >= sessionsActivity.N) {
                                if (i10 < sessionsActivity.G || i10 >= sessionsActivity.H) {
                                    if (i10 != sessionsActivity.Q) {
                                        i12 = sessionsActivity.ttlRow;
                                        if (i10 == i12) {
                                            return 6;
                                        }
                                        return 0;
                                    }
                                    return 5;
                                }
                                return 4;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        String formatPluralString;
        int i12;
        int i13 = d1Var.f47786f;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) d1Var.f47782a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i10 == sessionsActivity.f34545y) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.f34540n;
                                if (tL_authorization == null) {
                                    v6Var.f23582w = sessionsActivity.d;
                                    v6Var.f23581s = true;
                                    Context context = ApplicationLoader.applicationContext;
                                    if (AndroidUtilities.isTablet()) {
                                        i12 = R.drawable.device_tablet_android;
                                    } else {
                                        i12 = R.drawable.device_phone_android;
                                    }
                                    Drawable mutate = context.getDrawable(i12).mutate();
                                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J7, false), PorterDuff.Mode.SRC_IN));
                                    org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.R7, false)), mutate);
                                    org.telegram.ui.Components.y9 y9Var = v6Var.f23578f;
                                    if (y9Var != null) {
                                        y9Var.setImageDrawable(frVar);
                                    } else {
                                        v6Var.h.setImageDrawable(frVar);
                                    }
                                    v6Var.invalidate();
                                    return;
                                }
                                if (!sessionsActivity.f34538e.isEmpty() || !this.d.f34539f.isEmpty() || this.d.Q != -1) {
                                    z10 = true;
                                }
                                v6Var.c(tL_authorization, z10);
                                return;
                            }
                            int i14 = sessionsActivity.K;
                            if (i10 >= i14 && i10 < sessionsActivity.L) {
                                TLObject tLObject = (TLObject) sessionsActivity.f34538e.get(i10 - i14);
                                if (i10 != this.d.L - 1) {
                                    z10 = true;
                                }
                                v6Var.c(tLObject, z10);
                                return;
                            }
                            int i15 = sessionsActivity.M;
                            if (i10 >= i15 && i10 < sessionsActivity.N) {
                                int i16 = i10 - i15;
                                ArrayList arrayList = sessionsActivity.h;
                                if (arrayList != null && i16 >= 0 && i16 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.h.get(i16);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i10 != sessionsActivity2.N - 1 && i10 != sessionsActivity2.L - 1) {
                                        z10 = true;
                                    }
                                    v6Var.c(tL_connectedBot, z10);
                                    return;
                                }
                                return;
                            }
                            int i17 = sessionsActivity.G;
                            if (i10 >= i17 && i10 < sessionsActivity.H) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f34539f.get(i10 - i17);
                                if (i10 != this.d.H - 1) {
                                    z10 = true;
                                }
                                v6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) d1Var.f47782a;
                        int i18 = this.d.v;
                        if (i18 > 30 && i18 <= 183) {
                            formatPluralString = LocaleController.formatPluralString("Months", i18 / 30, new Object[0]);
                        } else if (i18 == 365) {
                            formatPluralString = LocaleController.formatPluralString("Years", i18 / 365, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Weeks", i18 / 7, new Object[0]);
                        }
                        caVar.c(LocaleController.getString(R.string.IfInactiveFor), formatPluralString, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) d1Var.f47782a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i10 == sessionsActivity3.f34544x) {
                    m4Var.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                } else if (i10 == sessionsActivity3.J) {
                    if (sessionsActivity3.f34543w == 0) {
                        m4Var.setText(LocaleController.getString(R.string.OtherSessions));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                        return;
                    }
                } else if (i10 == sessionsActivity3.F) {
                    m4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                    return;
                } else if (i10 == sessionsActivity3.T) {
                    m4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) d1Var.f47782a;
            e9Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 == sessionsActivity4.E) {
                if (sessionsActivity4.f34543w == 0) {
                    e9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            } else if (i10 == sessionsActivity4.O) {
                if (sessionsActivity4.f34543w == 0) {
                    if (sessionsActivity4.f34538e.isEmpty()) {
                        e9Var.setText("");
                        return;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                        return;
                    }
                }
                e9Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                return;
            } else if (i10 == sessionsActivity4.I) {
                e9Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else if (i10 == sessionsActivity4.R || i10 == sessionsActivity4.U || i10 == sessionsActivity4.P) {
                e9Var.setText("");
                e9Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) d1Var.f47782a;
        i11 = this.d.terminateAllSessionsRow;
        if (i10 == i11) {
            int i19 = org.telegram.ui.ActionBar.h6.f21043p7;
            r8Var.e(i19, i19);
            r8Var.setTag(Integer.valueOf(i19));
            if (this.d.f34543w == 0) {
                r8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
                return;
            }
            r8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
        } else if (i10 == this.d.Q) {
            int i20 = org.telegram.ui.ActionBar.h6.q6;
            r8Var.e(i20, i20);
            r8Var.setTag(Integer.valueOf(i20));
            r8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.f34538e.isEmpty());
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f7;
        int i18;
        float f10;
        int i19;
        int i20;
        int i21;
        float f11;
        int i22;
        int i23;
        float f12;
        int i24;
        float f13;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Context context = this.f42156c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    SessionsActivity sessionsActivity = this.d;
                    if (i10 != 5) {
                        if (i10 != 6) {
                            int i30 = sessionsActivity.f34543w;
                            ?? frameLayout2 = new FrameLayout(context);
                            frameLayout2.v = new org.telegram.ui.Components.g6((View) frameLayout2);
                            frameLayout2.f23584y = UserConfig.selectedAccount;
                            LinearLayout linearLayout = new LinearLayout(context);
                            frameLayout2.f23583x = linearLayout;
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            frameLayout2.f23574a = i30;
                            int i31 = 15;
                            int i32 = 21;
                            int i33 = 3;
                            if (i30 == 1) {
                                boolean z10 = LocaleController.isRTL;
                                if (z10) {
                                    i25 = 5;
                                } else {
                                    i25 = 3;
                                }
                                int i34 = i25 | 48;
                                if (z10) {
                                    i26 = 15;
                                } else {
                                    i26 = 49;
                                }
                                float f14 = i26;
                                if (z10) {
                                    i31 = 49;
                                }
                                frameLayout2.addView(linearLayout, w7.x5.a(30.0f, f14, 11.0f, i31, 0.0f, -1, i34));
                                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
                                frameLayout2.f23579n = j9Var;
                                j9Var.u(AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                                frameLayout2.h = y9Var;
                                y9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
                                boolean z11 = LocaleController.isRTL;
                                if (z11) {
                                    i27 = 5;
                                } else {
                                    i27 = 3;
                                }
                                int i35 = i27 | 48;
                                if (z11) {
                                    i28 = 0;
                                } else {
                                    i28 = 21;
                                }
                                float f15 = i28;
                                if (z11) {
                                    i29 = 21;
                                } else {
                                    i29 = 0;
                                }
                                frameLayout2.addView(y9Var, w7.x5.a(20.0f, f15, 13.0f, i29, 0.0f, 20, i35));
                            } else {
                                org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
                                frameLayout2.f23578f = y9Var2;
                                y9Var2.setRoundRadius(AndroidUtilities.dp(10.0f));
                                boolean z12 = LocaleController.isRTL;
                                if (z12) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                int i36 = i11 | 48;
                                int i37 = 16;
                                if (z12) {
                                    i12 = 0;
                                } else {
                                    i12 = 16;
                                }
                                float f16 = i12;
                                if (z12) {
                                    i13 = 16;
                                } else {
                                    i13 = 0;
                                }
                                frameLayout2.addView(y9Var2, w7.x5.a(42.0f, f16, 9.0f, i13, 0.0f, 42, i36));
                                frameLayout2.f23579n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
                                org.telegram.ui.Components.y9 y9Var3 = new org.telegram.ui.Components.y9(context);
                                frameLayout2.h = y9Var3;
                                y9Var3.setRoundRadius(AndroidUtilities.dp(10.0f));
                                boolean z13 = LocaleController.isRTL;
                                if (z13) {
                                    i14 = 5;
                                } else {
                                    i14 = 3;
                                }
                                int i38 = i14 | 48;
                                if (z13) {
                                    i15 = 0;
                                } else {
                                    i15 = 16;
                                }
                                float f17 = i15;
                                if (!z13) {
                                    i37 = 0;
                                }
                                frameLayout2.addView(y9Var3, w7.x5.a(42.0f, f17, 9.0f, i37, 0.0f, 42, i38));
                                boolean z14 = LocaleController.isRTL;
                                if (z14) {
                                    i16 = 5;
                                } else {
                                    i16 = 3;
                                }
                                int i39 = i16 | 48;
                                if (z14) {
                                    i17 = 15;
                                } else {
                                    i17 = 72;
                                }
                                float f18 = i17;
                                if (z14) {
                                    i31 = 72;
                                }
                                frameLayout2.addView(linearLayout, w7.x5.a(30.0f, f18, 6.333f, i31, 0.0f, -1, i39));
                            }
                            TextView textView = new TextView(context);
                            frameLayout2.f23575b = textView;
                            int i40 = org.telegram.ui.ActionBar.h6.G6;
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i40, false));
                            if (i30 == 0) {
                                f7 = 15.0f;
                            } else {
                                f7 = 16.0f;
                            }
                            textView.setTextSize(1, f7);
                            textView.setLines(1);
                            textView.setTypeface(AndroidUtilities.bold());
                            textView.setMaxLines(1);
                            textView.setSingleLine(true);
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView.setEllipsize(truncateAt);
                            if (LocaleController.isRTL) {
                                i18 = 5;
                            } else {
                                i18 = 3;
                            }
                            textView.setGravity(i18 | 48);
                            TextView textView2 = new TextView(context);
                            frameLayout2.f23576c = textView2;
                            float f19 = 13.0f;
                            if (i30 == 0) {
                                f10 = 12.0f;
                            } else {
                                f10 = 13.0f;
                            }
                            textView2.setTextSize(1, f10);
                            if (LocaleController.isRTL) {
                                i19 = 3;
                            } else {
                                i19 = 5;
                            }
                            textView2.setGravity(i19 | 48);
                            if (LocaleController.isRTL) {
                                linearLayout.addView(textView2, w7.x5.t(-2, -1, 51, 0, 2, 0, 0));
                                linearLayout.addView(textView, w7.x5.p(0, -1, 1.0f, 53, 10, 0, 0, 0));
                            } else {
                                linearLayout.addView(textView, w7.x5.p(0, -1, 1.0f, 51, 0, 0, 10, 0));
                                linearLayout.addView(textView2, w7.x5.t(-2, -1, 53, 0, 2, 0, 0));
                            }
                            if (LocaleController.isRTL) {
                                if (i30 == 0) {
                                    i21 = 72;
                                } else {
                                    i21 = 21;
                                }
                            } else {
                                if (i30 == 0) {
                                    i20 = 72;
                                } else {
                                    i20 = 21;
                                }
                                i32 = i20;
                                i21 = 21;
                            }
                            TextView textView3 = new TextView(context);
                            frameLayout2.d = textView3;
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i40, false));
                            if (i30 == 0) {
                                f11 = 13.0f;
                            } else {
                                f11 = 14.0f;
                            }
                            textView3.setTextSize(1, f11);
                            textView3.setLines(1);
                            textView3.setMaxLines(1);
                            textView3.setSingleLine(true);
                            textView3.setEllipsize(truncateAt);
                            if (LocaleController.isRTL) {
                                i22 = 5;
                            } else {
                                i22 = 3;
                            }
                            textView3.setGravity(i22 | 48);
                            if (LocaleController.isRTL) {
                                i23 = 5;
                            } else {
                                i23 = 3;
                            }
                            int i41 = i23 | 48;
                            float f20 = i32;
                            if (i30 == 0) {
                                f12 = 28.0f;
                            } else {
                                f12 = 36.0f;
                            }
                            float f21 = i21;
                            frameLayout2.addView(textView3, w7.x5.a(-2.0f, f20, f12, f21, 0.0f, -1, i41));
                            TextView textView4 = new TextView(context);
                            frameLayout2.f23577e = textView4;
                            textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A6, false));
                            if (i30 != 0) {
                                f19 = 14.0f;
                            }
                            textView4.setTextSize(1, f19);
                            textView4.setLines(1);
                            textView4.setMaxLines(1);
                            textView4.setSingleLine(true);
                            textView4.setEllipsize(truncateAt);
                            if (LocaleController.isRTL) {
                                i24 = 5;
                            } else {
                                i24 = 3;
                            }
                            textView4.setGravity(i24 | 48);
                            if (LocaleController.isRTL) {
                                i33 = 5;
                            }
                            int i42 = i33 | 48;
                            if (i30 == 0) {
                                f13 = 46.0f;
                            } else {
                                f13 = 59.0f;
                            }
                            frameLayout2.addView(textView4, w7.x5.a(-2.0f, f20, f13, f21, 0.0f, -1, i42));
                            frameLayout = frameLayout2;
                        } else {
                            frameLayout = new org.telegram.ui.Cells.ca(context);
                        }
                    } else {
                        frameLayout = new u81(sessionsActivity, context);
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.r8(context);
        }
        return new s4.d1(frameLayout);
    }
}
