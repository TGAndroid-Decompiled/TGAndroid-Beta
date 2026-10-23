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
public final class x60 extends org.telegram.ui.Components.lm0 {
    public final Context f43514c;
    public final y60 d;

    public x60(y60 y60Var, Context context) {
        this.d = y60Var;
        this.f43514c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        y60 y60Var = this.d;
        if (b10 != y60Var.f43735r && b10 != y60Var.f43734n && b10 != y60Var.f43736s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        y60 y60Var = this.d;
        if (y60Var.e) {
            return 0;
        }
        return y60Var.f43737w;
    }

    @Override
    public final int j(int i10) {
        y60 y60Var = this.d;
        if (i10 != y60Var.f43734n && i10 != y60Var.f43736s && i10 != y60Var.f43735r) {
            if (i10 != y60Var.v && i10 != y60Var.h) {
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
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        y60 y60Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = y60Var.f43733f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    p8Var.f22899a.setText(str);
                    p8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            int i12 = y60Var.v;
            Context context = this.f43514c;
            if (i10 == i12) {
                e9Var.setText("");
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, context, e9Var, null);
                return;
            } else if (i10 == y60Var.h) {
                TLRPC.Chat chat = y60Var.getMessagesController().getChat(Long.valueOf(y60Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    e9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    e9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21145b7, context, e9Var, null);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
        if (i10 == y60Var.f43734n) {
            caVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == y60Var.f43736s) {
            caVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == y60Var.f43735r) {
            caVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f43514c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f22899a = textView;
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
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
                frameLayout2.addView(textView, w7.z5.d(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            FrameLayout caVar = new org.telegram.ui.Cells.ca(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, caVar, null);
            frameLayout = caVar;
        }
        return new s4.b1(frameLayout);
    }
}
