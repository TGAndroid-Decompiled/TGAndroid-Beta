package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class v81 extends org.telegram.ui.Components.ul0 {
    public final Context f37476c;
    public final SessionsActivity d;

    public v81(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f37476c = context;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int b10 = c1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i10) {
            if (b10 < sessionsActivity.K || b10 >= sessionsActivity.L) {
                if (b10 < sessionsActivity.M || b10 >= sessionsActivity.N) {
                    if ((b10 < sessionsActivity.G || b10 >= sessionsActivity.H) && b10 != sessionsActivity.f30617y) {
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
        } else if (i10 == sessionsActivity.f30616x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.f30617y) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.K;
            if (i10 >= i13 && i10 < sessionsActivity.L) {
                TLObject tLObject = (TLObject) sessionsActivity.e.get(i10 - i13);
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
                        TLObject tLObject2 = (TLObject) sessionsActivity.f30611f.get(i10 - i15);
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
                if (i10 != sessionsActivity.f30616x && i10 != sessionsActivity.J && i10 != sessionsActivity.F && i10 != sessionsActivity.T) {
                    if (i10 != sessionsActivity.f30617y) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatPluralString;
        int i12;
        int i13 = c1Var.f41613f;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) c1Var.f41610a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i10 == sessionsActivity.f30617y) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.f30612n;
                                if (tL_authorization == null) {
                                    w6Var.f20671w = sessionsActivity.d;
                                    w6Var.f20670s = true;
                                    Context context = ApplicationLoader.applicationContext;
                                    if (AndroidUtilities.isTablet()) {
                                        i12 = R.drawable.device_tablet_android;
                                    } else {
                                        i12 = R.drawable.device_phone_android;
                                    }
                                    Drawable mutate = context.getDrawable(i12).mutate();
                                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J7, false), PorterDuff.Mode.SRC_IN));
                                    org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.R7, false)), mutate);
                                    org.telegram.ui.Components.w9 w9Var = w6Var.f20667f;
                                    if (w9Var != null) {
                                        w9Var.setImageDrawable(vqVar);
                                    } else {
                                        w6Var.h.setImageDrawable(vqVar);
                                    }
                                    w6Var.invalidate();
                                    return;
                                }
                                w6Var.c(tL_authorization, (sessionsActivity.e.isEmpty() && this.d.f30611f.isEmpty() && this.d.Q == -1) ? true : true);
                                return;
                            }
                            int i14 = sessionsActivity.K;
                            if (i10 >= i14 && i10 < sessionsActivity.L) {
                                TLObject tLObject = (TLObject) sessionsActivity.e.get(i10 - i14);
                                if (i10 != this.d.L - 1) {
                                    z10 = true;
                                }
                                w6Var.c(tLObject, z10);
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
                                    w6Var.c(tL_connectedBot, z10);
                                    return;
                                }
                                return;
                            }
                            int i17 = sessionsActivity.G;
                            if (i10 >= i17 && i10 < sessionsActivity.H) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f30611f.get(i10 - i17);
                                if (i10 != this.d.H - 1) {
                                    z10 = true;
                                }
                                w6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) c1Var.f41610a;
                        int i18 = this.d.v;
                        if (i18 > 30 && i18 <= 183) {
                            formatPluralString = LocaleController.formatPluralString("Months", i18 / 30, new Object[0]);
                        } else if (i18 == 365) {
                            formatPluralString = LocaleController.formatPluralString("Years", i18 / 365, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Weeks", i18 / 7, new Object[0]);
                        }
                        gaVar.c(LocaleController.getString(R.string.IfInactiveFor), formatPluralString, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) c1Var.f41610a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i10 == sessionsActivity3.f30616x) {
                    m4Var.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                } else if (i10 == sessionsActivity3.J) {
                    if (sessionsActivity3.f30615w == 0) {
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
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) c1Var.f41610a;
            f9Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 == sessionsActivity4.E) {
                if (sessionsActivity4.f30615w == 0) {
                    f9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    f9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            } else if (i10 == sessionsActivity4.O) {
                if (sessionsActivity4.f30615w == 0) {
                    if (sessionsActivity4.e.isEmpty()) {
                        f9Var.setText("");
                        return;
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                        return;
                    }
                }
                f9Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                return;
            } else if (i10 == sessionsActivity4.I) {
                f9Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else if (i10 == sessionsActivity4.R || i10 == sessionsActivity4.U || i10 == sessionsActivity4.P) {
                f9Var.setText("");
                f9Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) c1Var.f41610a;
        i11 = this.d.terminateAllSessionsRow;
        if (i10 == i11) {
            int i19 = org.telegram.ui.ActionBar.j6.f18144p7;
            s8Var.e(i19, i19);
            s8Var.setTag(Integer.valueOf(i19));
            if (this.d.f30615w == 0) {
                s8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
            } else {
                s8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
            }
        } else if (i10 == this.d.Q) {
            int i20 = org.telegram.ui.ActionBar.j6.q6;
            s8Var.e(i20, i20);
            s8Var.setTag(Integer.valueOf(i20));
            s8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.e.isEmpty());
        }
    }

    @Override
    public final s4.c1 x(android.view.ViewGroup r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v81.x(android.view.ViewGroup, int):s4.c1");
    }
}
