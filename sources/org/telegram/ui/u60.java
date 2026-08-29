package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class u60 extends org.telegram.ui.Components.il0 {
    public final Context f43189c;
    public final v60 d;

    public u60(v60 v60Var, Context context) {
        this.d = v60Var;
        this.f43189c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        v60 v60Var = this.d;
        if (b10 != v60Var.f43445r && b10 != v60Var.f43444n && b10 != v60Var.f43446s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        v60 v60Var = this.d;
        if (v60Var.f43442e) {
            return 0;
        }
        return v60Var.f43447w;
    }

    @Override
    public final int j(int i10) {
        v60 v60Var = this.d;
        if (i10 != v60Var.f43444n && i10 != v60Var.f43446s && i10 != v60Var.f43445r) {
            if (i10 != v60Var.v && i10 != v60Var.h) {
                if (i10 == 0) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        v60 v60Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = v60Var.f43443f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    l8Var.f24650a.setText(str);
                    l8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            int i12 = v60Var.v;
            Context context = this.f43189c;
            if (i10 == i12) {
                y8Var.setText("");
                y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                return;
            } else if (i10 == v60Var.h) {
                TLRPC.Chat chat = v60Var.getMessagesController().getChat(Long.valueOf(v60Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    y8Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    y8Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
        if (i10 == v60Var.f43444n) {
            y9Var.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == v60Var.f43446s) {
            y9Var.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == v60Var.f43445r) {
            y9Var.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f43189c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f24650a = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                textView.setTextSize(1, 16.0f);
                int i12 = 3;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11 | 16);
                if (LocaleController.isRTL) {
                    i12 = 5;
                }
                frameLayout2.addView(textView, i7.f6.d(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            FrameLayout y9Var = new org.telegram.ui.Cells.y9(context);
            y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            frameLayout = y9Var;
        }
        return new f2.n1(frameLayout);
    }
}
