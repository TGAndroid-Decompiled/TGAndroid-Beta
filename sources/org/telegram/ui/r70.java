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
public final class r70 extends org.telegram.ui.Components.lm0 {
    public final Context f39616c;
    public final s70 d;

    public r70(s70 s70Var, Context context) {
        this.d = s70Var;
        this.f39616c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        s70 s70Var = this.d;
        if (b10 != s70Var.f39986r && b10 != s70Var.f39985n && b10 != s70Var.f39987s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        s70 s70Var = this.d;
        if (s70Var.e) {
            return 0;
        }
        return s70Var.f39988w;
    }

    @Override
    public final int j(int i10) {
        s70 s70Var = this.d;
        if (i10 != s70Var.f39985n && i10 != s70Var.f39987s && i10 != s70Var.f39986r) {
            if (i10 != s70Var.v && i10 != s70Var.h) {
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
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        s70 s70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = s70Var.f39984f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    p8Var.f21705a.setText(str);
                    p8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            int i12 = s70Var.v;
            Context context = this.f39616c;
            if (i10 == i12) {
                e9Var.setText("");
                e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19863b7));
                return;
            } else if (i10 == s70Var.h) {
                TLRPC.Chat chat = s70Var.getMessagesController().getChat(Long.valueOf(s70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    e9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    e9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f19863b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
        if (i10 == s70Var.f39985n) {
            caVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == s70Var.f39987s) {
            caVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == s70Var.f39986r) {
            caVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f39616c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f21705a = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
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
                frameLayout2.addView(textView, w7.a6.a(-2.0f, 23.0f, 10.0f, 23.0f, 10.0f, -1, i12 | 48));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            FrameLayout caVar = new org.telegram.ui.Cells.ca(context);
            caVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
            frameLayout = caVar;
        }
        return new s4.b1(frameLayout);
    }
}
