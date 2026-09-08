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
public final class t81 extends org.telegram.ui.Components.kl0 {
    public final Context f40690c;
    public final SessionsActivity d;

    public t81(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f40690c = context;
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
                    if ((b10 < sessionsActivity.G || b10 >= sessionsActivity.H) && b10 != sessionsActivity.f34155y) {
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
        } else if (i10 == sessionsActivity.f34154x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.f34155y) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.K;
            if (i10 >= i13 && i10 < sessionsActivity.L) {
                TLObject tLObject = (TLObject) sessionsActivity.f34148e.get(i10 - i13);
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
                        TLObject tLObject2 = (TLObject) sessionsActivity.f34149f.get(i10 - i15);
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
                if (i10 != sessionsActivity.f34154x && i10 != sessionsActivity.J && i10 != sessionsActivity.F && i10 != sessionsActivity.T) {
                    if (i10 != sessionsActivity.f34155y) {
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
        int i13 = c1Var.f45770f;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            org.telegram.ui.Cells.u6 u6Var = (org.telegram.ui.Cells.u6) c1Var.f45766a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i10 == sessionsActivity.f34155y) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.f34150n;
                                if (tL_authorization == null) {
                                    u6Var.f23361w = sessionsActivity.d;
                                    u6Var.f23360s = true;
                                    Context context = ApplicationLoader.applicationContext;
                                    if (AndroidUtilities.isTablet()) {
                                        i12 = R.drawable.device_tablet_android;
                                    } else {
                                        i12 = R.drawable.device_phone_android;
                                    }
                                    Drawable mutate = context.getDrawable(i12).mutate();
                                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J7, false), PorterDuff.Mode.SRC_IN));
                                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.R7, false)), mutate);
                                    org.telegram.ui.Components.x9 x9Var = u6Var.f23357f;
                                    if (x9Var != null) {
                                        x9Var.setImageDrawable(oqVar);
                                    } else {
                                        u6Var.h.setImageDrawable(oqVar);
                                    }
                                    u6Var.invalidate();
                                    return;
                                }
                                u6Var.c(tL_authorization, (sessionsActivity.f34148e.isEmpty() && this.d.f34149f.isEmpty() && this.d.Q == -1) ? true : true);
                                return;
                            }
                            int i14 = sessionsActivity.K;
                            if (i10 >= i14 && i10 < sessionsActivity.L) {
                                TLObject tLObject = (TLObject) sessionsActivity.f34148e.get(i10 - i14);
                                if (i10 != this.d.L - 1) {
                                    z10 = true;
                                }
                                u6Var.c(tLObject, z10);
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
                                    u6Var.c(tL_connectedBot, z10);
                                    return;
                                }
                                return;
                            }
                            int i17 = sessionsActivity.G;
                            if (i10 >= i17 && i10 < sessionsActivity.H) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f34149f.get(i10 - i17);
                                if (i10 != this.d.H - 1) {
                                    z10 = true;
                                }
                                u6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f45766a;
                        int i18 = this.d.v;
                        if (i18 > 30 && i18 <= 183) {
                            formatPluralString = LocaleController.formatPluralString("Months", i18 / 30, new Object[0]);
                        } else if (i18 == 365) {
                            formatPluralString = LocaleController.formatPluralString("Years", i18 / 365, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Weeks", i18 / 7, new Object[0]);
                        }
                        eaVar.c(LocaleController.getString(R.string.IfInactiveFor), formatPluralString, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) c1Var.f45766a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i10 == sessionsActivity3.f34154x) {
                    l4Var.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                } else if (i10 == sessionsActivity3.J) {
                    if (sessionsActivity3.f34153w == 0) {
                        l4Var.setText(LocaleController.getString(R.string.OtherSessions));
                        return;
                    } else {
                        l4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                        return;
                    }
                } else if (i10 == sessionsActivity3.F) {
                    l4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                    return;
                } else if (i10 == sessionsActivity3.T) {
                    l4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) c1Var.f45766a;
            e9Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 == sessionsActivity4.E) {
                if (sessionsActivity4.f34153w == 0) {
                    e9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            } else if (i10 == sessionsActivity4.O) {
                if (sessionsActivity4.f34153w == 0) {
                    if (sessionsActivity4.f34148e.isEmpty()) {
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
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) c1Var.f45766a;
        i11 = this.d.terminateAllSessionsRow;
        if (i10 == i11) {
            int i19 = org.telegram.ui.ActionBar.j6.f20907p7;
            r8Var.e(i19, i19);
            r8Var.setTag(Integer.valueOf(i19));
            if (this.d.f34153w == 0) {
                r8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
            } else {
                r8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
            }
        } else if (i10 == this.d.Q) {
            int i20 = org.telegram.ui.ActionBar.j6.q6;
            r8Var.e(i20, i20);
            r8Var.setTag(Integer.valueOf(i20));
            r8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.f34148e.isEmpty());
        }
    }

    @Override
    public final s4.c1 x(android.view.ViewGroup r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t81.x(android.view.ViewGroup, int):s4.c1");
    }
}
