package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rx0 extends org.telegram.ui.Components.lm0 {
    public final Context f43308c;
    public final sx0 d;

    public rx0(sx0 sx0Var, Context context) {
        this.d = sx0Var;
        this.f43308c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
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
        sx0 sx0Var = this.d;
        if (i10 == sx0Var.f43620w) {
            return 4;
        }
        if (i10 == sx0Var.f43617n) {
            return 3;
        }
        if (i10 == sx0Var.f43616f) {
            return 2;
        }
        if (i10 != sx0Var.h && i10 != sx0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String string;
        String string2;
        sx0 sx0Var = this.d;
        int i11 = sx0Var.f43622y;
        int i12 = e1Var.f47738f;
        View view = e1Var.f47735a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                        if (i10 == sx0Var.f43617n) {
                            if (i11 == 1) {
                                q4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", sx0Var.getMessagesController().totalBlockedCount, new Object[0]));
                                return;
                            } else {
                                q4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
                c5Var.a(org.telegram.ui.ActionBar.y6.f23690v6, org.telegram.ui.ActionBar.y6.f23671u6);
                if (i11 == 1) {
                    c5Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == sx0Var.h) {
                if (i11 == 1) {
                    i9Var.setFixedSize(0);
                    i9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                i9Var.setFixedSize(8);
                i9Var.setText(null);
                return;
            } else if (i10 == sx0Var.v) {
                i9Var.setFixedSize(12);
                i9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
        if (i11 == 1) {
            long keyAt = sx0Var.getMessagesController().blockePeers.keyAt(i10 - sx0Var.f43618r);
            f5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = sx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.vh.g(new StringBuilder("+"), user.phone, kf.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i10 != sx0Var.f43619s - 1) {
                        z10 = true;
                    }
                    f5Var.c(user, null, string2, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = sx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
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
                if (i10 != sx0Var.f43619s - 1) {
                    z10 = true;
                }
                f5Var.c(chat, null, string, z10);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q4 q4Var;
        FrameLayout i9Var;
        if (i10 != 0) {
            Context context = this.f43308c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(this.f43308c, org.telegram.ui.ActionBar.y6.L6, 21, 11, false, null);
                        q4Var2.setHeight(43);
                        q4Var = q4Var2;
                    } else {
                        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                        v8Var.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        v8Var.g(-1, org.telegram.ui.ActionBar.y6.f23579p7);
                        q4Var = v8Var;
                    }
                } else {
                    i9Var = new org.telegram.ui.Cells.c5(context);
                }
            } else {
                i9Var = new org.telegram.ui.Cells.i9(context);
            }
            q4Var = i9Var;
        } else {
            org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(7, 6, this.f43308c, null, true);
            f5Var.setDelegate(new hl0(this, 11));
            q4Var = f5Var;
        }
        return new s4.e1(q4Var);
    }
}
