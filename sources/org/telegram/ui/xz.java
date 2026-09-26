package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class xz extends org.telegram.ui.Components.wl0 {
    public final yz f40006c;

    public xz(yz yzVar) {
        this.f40006c = yzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40006c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        yz yzVar = this.f40006c;
        if (i10 != yzVar.O && i10 != yzVar.K) {
            if (i10 == yzVar.I) {
                return 3;
            }
            if (i10 >= yzVar.M && i10 < yzVar.N) {
                return 4;
            }
            if (i10 != yzVar.L && i10 != yzVar.J) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f7;
        int i11;
        yz yzVar = this.f40006c;
        ArrayList arrayList = yzVar.f40286f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = yzVar.d;
        int i12 = c1Var.f42962f;
        View view = c1Var.f42959a;
        if (i12 == 0) {
            yzVar.Q = (pz) view;
            yzVar.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            Activity parentActivity = yzVar.getParentActivity();
            if (i10 == yzVar.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            e9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(parentActivity, i11, org.telegram.ui.ActionBar.h6.f19023b7));
            if (i10 == yzVar.O) {
                e9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    e9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            e9Var.setFixedSize(12);
        } else {
            int i13 = 1;
            String str4 = null;
            if (i12 == 3) {
                rz rzVar = (rz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                ai.p4 p4Var = rzVar.h;
                org.telegram.ui.ActionBar.h5 h5Var = rzVar.f37542c;
                TextView textView = rzVar.f37544n;
                ImageView imageView = rzVar.d;
                ai.p4 p4Var2 = rzVar.f37543f;
                rzVar.f37546s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                h5Var.l(str3, false);
                float f10 = rzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = rzVar.f37547w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        rzVar.f37547w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    rzVar.v = f7;
                    ci.g9 g9Var = rzVar.e;
                    g9Var.f4732c = f7;
                    g9Var.invalidate();
                    p4Var2.setAlpha(rzVar.v);
                    rzVar.h.setAlpha(rzVar.v);
                    imageView.setAlpha(rzVar.v);
                    textView.setAlpha(1.0f - rzVar.v);
                    h5Var.setAlpha(rzVar.v);
                    rzVar.f37541b.setAlpha(1.0f - rzVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        p4Var2.setVisibility(8);
                        p4Var.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    p4Var2.setVisibility(0);
                    p4Var.setVisibility(0);
                }
            } else if (i12 == 4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                Long l4 = (Long) yzVar.h.get(i10 - yzVar.M);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = yzVar.getMessagesController().getUser(l4);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = yzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat2 != null) {
                        str4 = chat2.title;
                        if (chat2.participants_count != 0) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                                str = LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count);
                            } else {
                                str = LocaleController.formatPluralStringComma("Members", chat2.participants_count);
                            }
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            str = LocaleController.getString("ChannelPublic");
                        } else {
                            str = LocaleController.getString("MegaPublic");
                        }
                    } else {
                        str = null;
                    }
                    String str5 = str4;
                    str4 = str;
                    str2 = str5;
                    chat = chat2;
                }
                if (arrayList.contains(l4)) {
                    g4Var.setForbiddenCheck(false);
                    g4Var.c(yzVar.e.contains(l4), false);
                } else {
                    g4Var.setForbiddenCheck(true);
                    g4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str4 = LocaleController.getString(R.string.FilterInviteBot);
                        } else {
                            str4 = LocaleController.getString(R.string.FilterInviteUser);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            str4 = LocaleController.getString(R.string.FilterInviteChannel);
                        } else {
                            str4 = LocaleController.getString(R.string.FilterInviteGroup);
                        }
                    }
                }
                g4Var.setTag(l4);
                g4Var.d(chat, str2, str4);
            } else if (i12 == 5) {
                org.telegram.ui.Components.b10 b10Var = (org.telegram.ui.Components.b10) view;
                if (b10Var == yzVar.P) {
                    yzVar.P = null;
                }
                if (i10 == yzVar.J) {
                    b10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    b10Var.a("", null);
                    return;
                }
                yzVar.P = b10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    yzVar.f0(false);
                    return;
                }
                b10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                b10Var.a("", null);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View b10Var;
        View view;
        yz yzVar = this.f40006c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = yzVar.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.y5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            vh.n nVar = new vh.n(parentActivity);
            frameLayout.f36706a = nVar;
            nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false));
            nVar.setTextSize(1, 14.0f);
            nVar.setGravity(17);
            nVar.setLines(2);
            frameLayout.addView(nVar, w7.y5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(yzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    b10Var = new wz(this, yzVar.getParentActivity(), yzVar);
                    b10Var.setLayoutParams(new s4.p0(-1, -2));
                    b10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(yzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    b10Var = new org.telegram.ui.Components.b10(yzVar.getParentActivity());
                    b10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
                }
                view2 = b10Var;
            }
            return new s4.c1(view2);
        }
        view2 = view;
        return new s4.c1(view2);
    }
}
