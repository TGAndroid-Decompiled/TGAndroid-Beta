package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sx0 extends org.telegram.ui.Components.rl0 {
    public final Context f41329c;
    public final tx0 d;

    public sx0(tx0 tx0Var, Context context) {
        this.d = tx0Var;
        this.f41329c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f41652e;
    }

    @Override
    public final int j(int i10) {
        tx0 tx0Var = this.d;
        if (i10 == tx0Var.f41657w) {
            return 4;
        }
        if (i10 == tx0Var.f41654n) {
            return 3;
        }
        if (i10 == tx0Var.f41653f) {
            return 2;
        }
        if (i10 != tx0Var.h && i10 != tx0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String string;
        String string2;
        tx0 tx0Var = this.d;
        int i11 = tx0Var.f41659y;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z4 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                        if (i10 == tx0Var.f41654n) {
                            if (i11 == 1) {
                                m4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", tx0Var.getMessagesController().totalBlockedCount, new Object[0]));
                                return;
                            } else {
                                m4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.k6.f21981v6, org.telegram.ui.ActionBar.k6.f21963u6);
                if (i11 == 1) {
                    y4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == tx0Var.h) {
                if (i11 == 1) {
                    a9Var.setFixedSize(0);
                    a9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                a9Var.setFixedSize(8);
                a9Var.setText(null);
                return;
            } else if (i10 == tx0Var.v) {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        if (i11 == 1) {
            long keyAt = tx0Var.getMessagesController().blockePeers.keyAt(i10 - tx0Var.f41655r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = tx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.y3.j(new StringBuilder("+"), user.phone, se.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i10 != tx0Var.f41656s - 1) {
                        z4 = true;
                    }
                    b5Var.b(user, null, string2, z4);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = tx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
            if (chat != null) {
                int i13 = chat.participants_count;
                if (i13 != 0) {
                    string = LocaleController.formatPluralString("Members", i13, new Object[0]);
                } else if (chat.has_geo) {
                    string = LocaleController.getString(R.string.MegaLocation);
                } else if (!ChatObject.isPublic(chat)) {
                    string = LocaleController.getString(R.string.MegaPrivate);
                } else {
                    string = LocaleController.getString(R.string.MegaPublic);
                }
                if (i10 != tx0Var.f41656s - 1) {
                    z4 = true;
                }
                b5Var.b(chat, null, string, z4);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        FrameLayout a9Var;
        if (i10 != 0) {
            Context context = this.f41329c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(this.f41329c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                        m4Var2.setHeight(43);
                        m4Var = m4Var2;
                    } else {
                        org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                        o8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        o8Var.e(-1, org.telegram.ui.ActionBar.k6.f21878p7);
                        m4Var = o8Var;
                    }
                } else {
                    a9Var = new org.telegram.ui.Cells.y4(context);
                }
            } else {
                a9Var = new org.telegram.ui.Cells.a9(context);
            }
            m4Var = a9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(7, 6, this.f41329c, null, true);
            b5Var.setDelegate(new kl0(this, 10));
            m4Var = b5Var;
        }
        return new f2.m1(m4Var);
    }
}
