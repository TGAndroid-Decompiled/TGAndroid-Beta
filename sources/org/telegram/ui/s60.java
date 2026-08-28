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
public final class s60 extends org.telegram.ui.Components.vk0 {
    public final Context f42568c;
    public final t60 d;

    public s60(t60 t60Var, Context context) {
        this.d = t60Var;
        this.f42568c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        t60 t60Var = this.d;
        if (b10 != t60Var.f42875r && b10 != t60Var.f42874n && b10 != t60Var.f42876s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        t60 t60Var = this.d;
        if (t60Var.f42872e) {
            return 0;
        }
        return t60Var.f42877w;
    }

    @Override
    public final int j(int i9) {
        t60 t60Var = this.d;
        if (i9 != t60Var.f42874n && i9 != t60Var.f42876s && i9 != t60Var.f42875r) {
            if (i9 != t60Var.v && i9 != t60Var.h) {
                if (i9 == 0) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        t60 t60Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = t60Var.f42873f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    n8Var.f24773a.setText(str);
                    n8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            int i11 = t60Var.v;
            Context context = this.f42568c;
            if (i9 == i11) {
                b9Var.setText("");
                b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                return;
            } else if (i9 == t60Var.h) {
                TLRPC.Chat chat = t60Var.getMessagesController().getChat(Long.valueOf(t60Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    b9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    b9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        if (i9 == t60Var.f42874n) {
            baVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i9 == t60Var.f42876s) {
            baVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i9 == t60Var.f42875r) {
            baVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        int i10;
        Context context = this.f42568c;
        if (i9 != 0) {
            if (i9 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f24773a = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                textView.setTextSize(1, 16.0f);
                int i11 = 3;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                frameLayout2.addView(textView, g7.e6.d(-1, -2.0f, i11 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            FrameLayout baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            frameLayout = baVar;
        }
        return new f2.q1(frameLayout);
    }
}
