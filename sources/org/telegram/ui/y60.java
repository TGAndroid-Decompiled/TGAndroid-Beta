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
public final class y60 extends org.telegram.ui.Components.lm0 {
    public final Context f45974c;
    public final z60 d;

    public y60(z60 z60Var, Context context) {
        this.d = z60Var;
        this.f45974c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        z60 z60Var = this.d;
        if (b10 != z60Var.f46188r && b10 != z60Var.f46187n && b10 != z60Var.f46189s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        z60 z60Var = this.d;
        if (z60Var.e) {
            return 0;
        }
        return z60Var.f46190w;
    }

    @Override
    public final int j(int i10) {
        z60 z60Var = this.d;
        if (i10 != z60Var.f46187n && i10 != z60Var.f46189s && i10 != z60Var.f46188r) {
            if (i10 != z60Var.v && i10 != z60Var.h) {
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
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        z60 z60Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = z60Var.f46186f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    t8Var.f25458a.setText(str);
                    t8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == z60Var.v) {
                i9Var.setText("");
                return;
            } else if (i10 == z60Var.h) {
                TLRPC.Chat chat = z60Var.getMessagesController().getChat(Long.valueOf(z60Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    i9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                    return;
                } else {
                    i9Var.setText(LocaleController.getString(R.string.LinkInfo));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        if (i10 == z60Var.f46187n) {
            gaVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == z60Var.f46189s) {
            gaVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == z60Var.f46188r) {
            gaVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f45974c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f25458a = textView;
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
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
                frameLayout2.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.i9(context);
            }
        } else {
            FrameLayout gaVar = new org.telegram.ui.Cells.ga(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, gaVar, null);
            frameLayout = gaVar;
        }
        return new s4.e1(frameLayout);
    }
}
