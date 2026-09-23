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
public final class yz extends org.telegram.ui.Components.ll0 {
    public final zz f39915c;

    public yz(zz zzVar) {
        this.f39915c = zzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39915c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        zz zzVar = this.f39915c;
        if (i10 != zzVar.O && i10 != zzVar.K) {
            if (i10 == zzVar.I) {
                return 3;
            }
            if (i10 >= zzVar.M && i10 < zzVar.N) {
                return 4;
            }
            if (i10 != zzVar.L && i10 != zzVar.J) {
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
        zz zzVar = this.f39915c;
        ArrayList arrayList = zzVar.f40283f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = zzVar.d;
        int i12 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i12 == 0) {
            zzVar.Q = (qz) view;
            zzVar.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            Activity parentActivity = zzVar.getParentActivity();
            if (i10 == zzVar.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            f9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(parentActivity, i11, org.telegram.ui.ActionBar.h6.f18753b7));
            if (i10 == zzVar.O) {
                f9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    f9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    f9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            f9Var.setFixedSize(12);
        } else {
            int i13 = 1;
            String str4 = null;
            if (i12 == 3) {
                sz szVar = (sz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                ai.p4 p4Var = szVar.h;
                org.telegram.ui.ActionBar.i5 i5Var = szVar.f37466c;
                TextView textView = szVar.f37468n;
                ImageView imageView = szVar.d;
                ai.p4 p4Var2 = szVar.f37467f;
                szVar.f37470s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                i5Var.l(str3, false);
                float f10 = szVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = szVar.f37471w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        szVar.f37471w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    szVar.v = f7;
                    ci.g9 g9Var = szVar.e;
                    g9Var.f4732c = f7;
                    g9Var.invalidate();
                    p4Var2.setAlpha(szVar.v);
                    szVar.h.setAlpha(szVar.v);
                    imageView.setAlpha(szVar.v);
                    textView.setAlpha(1.0f - szVar.v);
                    i5Var.setAlpha(szVar.v);
                    szVar.f37465b.setAlpha(1.0f - szVar.v);
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
                Long l4 = (Long) zzVar.h.get(i10 - zzVar.M);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = zzVar.getMessagesController().getUser(l4);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = zzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                    g4Var.c(zzVar.e.contains(l4), false);
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
                org.telegram.ui.Components.a10 a10Var = (org.telegram.ui.Components.a10) view;
                if (a10Var == zzVar.P) {
                    zzVar.P = null;
                }
                if (i10 == zzVar.J) {
                    a10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    a10Var.a("", null);
                    return;
                }
                zzVar.P = a10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    zzVar.f0(false);
                    return;
                }
                a10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                a10Var.a("", null);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a10Var;
        View view;
        zz zzVar = this.f39915c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = zzVar.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.x5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            vh.o oVar = new vh.o(parentActivity);
            frameLayout.f36641a = oVar;
            oVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false));
            oVar.setTextSize(1, 14.0f);
            oVar.setGravity(17);
            oVar.setLines(2);
            frameLayout.addView(oVar, w7.x5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.f9(zzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    a10Var = new xz(this, zzVar.getParentActivity(), zzVar);
                    a10Var.setLayoutParams(new s4.p0(-1, -2));
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(zzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    a10Var = new org.telegram.ui.Components.a10(zzVar.getParentActivity());
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                }
                view2 = a10Var;
            }
            return new s4.c1(view2);
        }
        view2 = view;
        return new s4.c1(view2);
    }
}
