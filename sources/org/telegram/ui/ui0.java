package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ui0 extends org.telegram.ui.Components.hm0 {
    public final Context f42005c;
    public final wi0 d;

    public ui0(wi0 wi0Var, Context context) {
        this.d = wi0Var;
        this.f42005c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45938a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45941f == 0) {
            return ((org.telegram.ui.Cells.a5) b1Var.f45938a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        wi0 wi0Var = this.d;
        if (wi0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != wi0Var.H && i10 != wi0Var.O) {
            if (i10 == wi0Var.K) {
                return 3;
            }
            if (i10 == wi0Var.L) {
                return 4;
            }
            if (i10 == wi0Var.N) {
                return 5;
            }
            if (i10 == wi0Var.P) {
                return 6;
            }
            if (i10 == wi0Var.M) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        MessageObject messageObject;
        String str;
        String format;
        TLRPC.User user;
        TLObject chat;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = b1Var.f45941f;
        View view = b1Var.f45938a;
        boolean z10 = true;
        wi0 wi0Var = this.d;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 4) {
                        if (i16 != 5) {
                            if (i16 == 7) {
                                b91 b91Var = (b91) view;
                                b91Var.e(wi0Var.f42874s, false);
                                b91Var.setLayoutParams(new s4.o0(-1, -2));
                                return;
                            }
                            return;
                        }
                        vi0 vi0Var = (vi0) view;
                        TextView[] textViewArr = vi0Var.f42219a;
                        TextView[] textViewArr2 = vi0Var.f42220b;
                        wi0 wi0Var2 = vi0Var.f42221c;
                        o91 o91Var = wi0Var2.f42870e0;
                        MessageObject messageObject2 = wi0Var2.f42872n;
                        if (o91Var != null) {
                            i14 = o91Var.d();
                            i13 = o91Var.a();
                            i15 = o91Var.c();
                        } else {
                            if (messageObject2.isStory()) {
                                i12 = messageObject2.storyItem.views.views_count;
                            } else {
                                i12 = messageObject2.messageOwner.views;
                            }
                            if (messageObject2.isStory()) {
                                i13 = messageObject2.storyItem.views.forwards_count;
                            } else {
                                i13 = messageObject2.messageOwner.forwards;
                            }
                            if (messageObject2.isStory()) {
                                int i17 = messageObject2.storyItem.views.reactions_count;
                                i14 = i12;
                                i15 = i17;
                            } else if (messageObject2.messageOwner.reactions != null) {
                                int i18 = 0;
                                for (int i19 = 0; i19 < messageObject2.messageOwner.reactions.results.size(); i19++) {
                                    i18 += messageObject2.messageOwner.reactions.results.get(i19).count;
                                }
                                i14 = i12;
                                i15 = i18;
                            } else {
                                i14 = i12;
                                i15 = 0;
                            }
                        }
                        textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i14, 0));
                        textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
                        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(wi0Var2.U, 0));
                        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i15, 0));
                        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
                        TLRPC.ChatFull chatFull = wi0Var2.f42863a;
                        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i15 == 0) {
                            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
                        }
                        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i13 - wi0Var2.U), 0));
                        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
                        vi0Var.a();
                        return;
                    }
                    b91 b91Var2 = (b91) view;
                    b91Var2.e(wi0Var.f42873r, false);
                    b91Var2.setLayoutParams(new s4.o0(-1, -2));
                    return;
                }
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == wi0Var.O) {
                    l4Var.setTopMargin(9);
                    l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    l4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                    return;
                }
                l4Var.setTopMargin(11);
                l4Var.setPadding(0, 0, 0, 0);
                l4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(this.f42005c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20948b7));
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        int i20 = wi0Var.I;
        if (i10 >= i20 && i10 < wi0Var.J) {
            messageObject = (MessageObject) wi0Var.f42876x.get(i10 - i20);
        } else {
            messageObject = null;
        }
        long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
        if (messageObject.isStory()) {
            if (DialogObject.isUserDialog(dialogId)) {
                chat = wi0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            } else {
                chat = wi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            }
            TL_stories.StoryViews storyViews = messageObject.storyItem.views;
            if (storyViews != null && (i11 = storyViews.views_count) != 0) {
                string = LocaleController.formatPluralString("Views", i11, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.NoViews);
            }
            if (i10 == wi0Var.J - 1) {
                z10 = false;
            }
            a5Var.b(chat, null, string, z10);
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            ef0 ef0Var = new ef0(2, this, messageObject);
            a5Var.f21972r = storyItem;
            a5Var.f21967a.setOnClickListener(ef0Var);
            return;
        }
        a5Var.f21972r = null;
        a5Var.f21967a.setOnClickListener(null);
        if (DialogObject.isUserDialog(dialogId)) {
            user = wi0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            str = null;
        } else {
            TLRPC.Chat chat2 = wi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (ChatObject.isChannel(chat2) && !chat2.megagroup) {
                format = LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]);
            } else {
                int i21 = chat2.participants_count;
                if (i21 != 0) {
                    format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i21, new Object[0]), LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]));
                } else {
                    str = null;
                    user = chat2;
                }
            }
            str = format;
            user = chat2;
        }
        if (user != null) {
            if (i10 == wi0Var.J - 1) {
                z10 = false;
            }
            a5Var.b(user, null, str, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.z6 z6Var;
        wi0 wi0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f42005c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.k3(context, 16);
                                view.setLayoutParams(new s4.o0(-1, 16));
                            }
                        } else {
                            view = new vi0(wi0Var, context);
                            view.setLayoutParams(new s4.o0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    jg.f fVar = new jg.f(wi0Var.getResourceProvider());
                    wi0Var.f42868c0 = fVar;
                    view = new ti0(this, this.f42005c, i11, fVar, wi0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f42005c, org.telegram.ui.ActionBar.h6.G6, 16, 11, false, wi0Var.getResourceProvider());
                    l4Var.setHeight(43);
                    z6Var = l4Var;
                }
            } else {
                wi0Var.getResourceProvider();
                z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.t0) null);
            }
            view = z6Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f42005c, wi0Var.getResourceProvider(), false);
            a5Var.setDividerColor(org.telegram.ui.ActionBar.h6.f20987d7);
            view = a5Var;
        }
        return new s4.b1(view);
    }
}
