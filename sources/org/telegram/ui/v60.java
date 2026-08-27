package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class v60 extends org.telegram.ui.Components.yk0 {

    public final Context f43370c;
    public final w60 d;

    public v60(w60 w60Var, Context context) {
        this.d = w60Var;
        this.f43370c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        w60 w60Var = this.d;
        return iB == w60Var.f43629r || iB == w60Var.f43628n || iB == w60Var.f43630s || iB == 0;
    }

    @Override
    public final int h() {
        w60 w60Var = this.d;
        if (w60Var.f43626e) {
            return 0;
        }
        return w60Var.f43631w;
    }

    @Override
    public final int j(int i10) {
        w60 w60Var = this.d;
        if (i10 == w60Var.f43628n || i10 == w60Var.f43630s || i10 == w60Var.f43629r) {
            return 0;
        }
        if (i10 == w60Var.v || i10 == w60Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        w60 w60Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (i10 == w60Var.f43628n) {
                x9Var.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == w60Var.f43630s) {
                x9Var.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == w60Var.f43629r) {
                    x9Var.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = w60Var.f43627f;
            k8Var.f24597a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            k8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        int i12 = w60Var.v;
        Context context = this.f43370c;
        if (i10 == i12) {
            x8Var.setText("");
            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
        } else if (i10 == w60Var.h) {
            TLRPC.Chat chat = w60Var.getMessagesController().getChat(Long.valueOf(w60Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                x8Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                x8Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        Context context = this.f43370c;
        if (i10 == 0) {
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            x9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            x8Var = x9Var;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(context);
            TextView textView = new TextView(context);
            k8Var.f24597a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            k8Var.addView(textView, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            k8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            x8Var = k8Var;
        } else {
            x8Var = new org.telegram.ui.Cells.x8(context);
        }
        return new org.telegram.ui.Components.lk0(x8Var);
    }
}
