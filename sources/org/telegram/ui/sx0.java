package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sx0 extends org.telegram.ui.Components.ql0 {
    public final Context f38324c;
    public final tx0 d;

    public sx0(tx0 tx0Var, Context context) {
        this.d = tx0Var;
        this.f38324c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.e;
    }

    @Override
    public final int j(int i10) {
        tx0 tx0Var = this.d;
        if (i10 == tx0Var.f38610w) {
            return 4;
        }
        if (i10 == tx0Var.f38607n) {
            return 3;
        }
        if (i10 == tx0Var.f38606f) {
            return 2;
        }
        if (i10 != tx0Var.h && i10 != tx0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String string;
        String string2;
        tx0 tx0Var = this.d;
        int i11 = tx0Var.f38612y;
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z4 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                        if (i10 == tx0Var.f38607n) {
                            if (i11 == 1) {
                                l4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", tx0Var.getMessagesController().totalBlockedCount, new Object[0]));
                                return;
                            } else {
                                l4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.j6.f20200v6, org.telegram.ui.ActionBar.j6.f20182u6);
                if (i11 == 1) {
                    x4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 == tx0Var.h) {
                if (i11 == 1) {
                    z8Var.setFixedSize(0);
                    z8Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                z8Var.setFixedSize(8);
                z8Var.setText(null);
                return;
            } else if (i10 == tx0Var.v) {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        if (i11 == 1) {
            long keyAt = tx0Var.getMessagesController().blockePeers.keyAt(i10 - tx0Var.f38608r);
            a5Var.setTag(Long.valueOf(keyAt));
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
                    if (i10 != tx0Var.f38609s - 1) {
                        z4 = true;
                    }
                    a5Var.b(user, null, string2, z4);
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
                if (i10 != tx0Var.f38609s - 1) {
                    z4 = true;
                }
                a5Var.b(chat, null, string, z4);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        FrameLayout z8Var;
        if (i10 != 0) {
            Context context = this.f38324c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(this.f38324c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                        l4Var2.setHeight(43);
                        l4Var = l4Var2;
                    } else {
                        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                        n8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        n8Var.e(-1, org.telegram.ui.ActionBar.j6.f20097p7);
                        l4Var = n8Var;
                    }
                } else {
                    z8Var = new org.telegram.ui.Cells.x4(context);
                }
            } else {
                z8Var = new org.telegram.ui.Cells.z8(context);
            }
            l4Var = z8Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(7, 6, this.f38324c, null, true);
            a5Var.setDelegate(new kl0(this, 10));
            l4Var = a5Var;
        }
        return new f2.l1(l4Var);
    }
}
