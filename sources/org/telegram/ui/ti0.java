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

public final class ti0 extends org.telegram.ui.Components.yk0 {

    public final Context f42952c;
    public final vi0 d;

    public ti0(vi0 vi0Var, Context context) {
        this.d = vi0Var;
        this.f42952c = context;
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        if (o1Var.f5793f == 0) {
            return ((org.telegram.ui.Cells.y4) o1Var.f5789a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.M;
    }

    @Override
    public final int j(int i10) {
        vi0 vi0Var = this.d;
        if (vi0Var.N.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == vi0Var.D || i10 == vi0Var.K) {
            return 2;
        }
        if (i10 == vi0Var.G) {
            return 3;
        }
        if (i10 == vi0Var.H) {
            return 4;
        }
        if (i10 == vi0Var.J) {
            return 5;
        }
        if (i10 == vi0Var.L) {
            return 6;
        }
        return i10 == vi0Var.I ? 7 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        String pluralString;
        TLRPC.User user;
        int i11;
        int iA;
        int iD;
        int iC;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        vi0 vi0Var = this.d;
        if (i12 == 0) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            int i13 = vi0Var.E;
            MessageObject messageObject = (i10 < i13 || i10 >= vi0Var.F) ? null : (MessageObject) vi0Var.f43477x.get(i10 - i13);
            long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
            if (messageObject.isStory()) {
                TLObject user2 = DialogObject.isUserDialog(dialogId) ? vi0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : vi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                TL_stories.StoryViews storyViews = messageObject.storyItem.views;
                y4Var.b(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != vi0Var.F - 1);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                u70 u70Var = new u70(10, this, messageObject);
                y4Var.f25994r = storyItem;
                y4Var.f25988a.setOnClickListener(u70Var);
                return;
            }
            y4Var.f25994r = null;
            y4Var.f25988a.setOnClickListener(null);
            if (DialogObject.isUserDialog(dialogId)) {
                user = vi0Var.getMessagesController().getUser(Long.valueOf(dialogId));
                str = null;
            } else {
                TLRPC.Chat chat = vi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    int i14 = chat.participants_count;
                    if (i14 != 0) {
                        pluralString = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i14, new Object[0]), LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]));
                    } else {
                        str = null;
                    }
                    user = chat;
                } else {
                    pluralString = LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]);
                }
                str = pluralString;
                user = chat;
            }
            if (user != null) {
                y4Var.b(user, null, str, i10 != vi0Var.F - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(this.f42952c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            return;
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == vi0Var.K) {
                j4Var.setTopMargin(9);
                j4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                j4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                return;
            } else {
                j4Var.setTopMargin(11);
                j4Var.setPadding(0, 0, 0, 0);
                j4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
        }
        if (i12 == 4) {
            a91 a91Var = (a91) view;
            a91Var.e(vi0Var.f43474r, false);
            a91Var.setLayoutParams(new f2.y0(-1, -2));
            return;
        }
        if (i12 != 5) {
            if (i12 != 7) {
                return;
            }
            a91 a91Var2 = (a91) view;
            a91Var2.e(vi0Var.f43475s, false);
            a91Var2.setLayoutParams(new f2.y0(-1, -2));
            return;
        }
        ui0 ui0Var = (ui0) view;
        TextView[] textViewArr = ui0Var.f43237a;
        TextView[] textViewArr2 = ui0Var.f43238b;
        vi0 vi0Var2 = ui0Var.f43239c;
        n91 n91Var = vi0Var2.f43468a0;
        MessageObject messageObject2 = vi0Var2.f43473n;
        if (n91Var != null) {
            iD = n91Var.d();
            iA = n91Var.a();
            iC = n91Var.c();
        } else {
            int i15 = messageObject2.isStory() ? messageObject2.storyItem.views.views_count : messageObject2.messageOwner.views;
            iA = messageObject2.isStory() ? messageObject2.storyItem.views.forwards_count : messageObject2.messageOwner.forwards;
            if (messageObject2.isStory()) {
                int i16 = messageObject2.storyItem.views.reactions_count;
                iD = i15;
                iC = i16;
            } else if (messageObject2.messageOwner.reactions != null) {
                int i17 = 0;
                for (int i18 = 0; i18 < messageObject2.messageOwner.reactions.results.size(); i18++) {
                    i17 += messageObject2.messageOwner.reactions.results.get(i18).count;
                }
                iD = i15;
                iC = i17;
            } else {
                iD = i15;
                iC = 0;
            }
        }
        textViewArr[0].setText(AndroidUtilities.formatWholeNumber(iD, 0));
        textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(vi0Var2.Q, 0));
        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(iC, 0));
        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
        TLRPC.ChatFull chatFull = vi0Var2.f43467a;
        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && iC == 0) {
            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
        }
        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, iA - vi0Var2.Q), 0));
        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
        ui0Var.a();
    }

    @Override
    public final f2.o1 x(
}
