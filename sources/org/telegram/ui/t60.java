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
public final class t60 extends org.telegram.ui.Components.im0 {
    public final Context f41611c;
    public final u60 d;

    public t60(u60 u60Var, Context context) {
        this.d = u60Var;
        this.f41611c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        u60 u60Var = this.d;
        if (b10 != u60Var.f41818r && b10 != u60Var.f41817n && b10 != u60Var.f41819s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        u60 u60Var = this.d;
        if (u60Var.e) {
            return 0;
        }
        return u60Var.f41820w;
    }

    @Override
    public final int j(int i10) {
        u60 u60Var = this.d;
        if (i10 != u60Var.f41817n && i10 != u60Var.f41819s && i10 != u60Var.f41818r) {
            if (i10 != u60Var.v && i10 != u60Var.h) {
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
        int i11 = b1Var.f45923f;
        View view = b1Var.f45920a;
        u60 u60Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = u60Var.f41816f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    o8Var.f22734a.setText(str);
                    o8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            int i12 = u60Var.v;
            Context context = this.f41611c;
            if (i10 == i12) {
                d9Var.setText("");
                d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20955b7));
                return;
            } else if (i10 == u60Var.h) {
                TLRPC.Chat chat = u60Var.getMessagesController().getChat(Long.valueOf(u60Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    d9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    d9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20955b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        if (i10 == u60Var.f41817n) {
            baVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == u60Var.f41819s) {
            baVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == u60Var.f41818r) {
            baVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f41611c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f22734a = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
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
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.d9(context);
            }
        } else {
            FrameLayout baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
            frameLayout = baVar;
        }
        return new s4.b1(frameLayout);
    }
}
