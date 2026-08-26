package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PostSuggestionsEditActivity;
import org.telegram.ui.PrivacyControlActivity;

public final class BookmarksFragment$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final long f$0;
    public final int f$1;

    public BookmarksFragment$$ExternalSyntheticLambda1(int i, long j) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ChatActivity.of(this.f$0, this.f$1));
                }
                break;
            case 1:
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    long j = this.f$0;
                    if (j < 0) {
                        int i = this.f$1;
                        long j2 = -j;
                        if (!ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i).getChat(Long.valueOf(j2)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j2);
                            bundle.putInt("type", 3);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(MessagesController.getInstance(i).getChatFull(j2));
                            safeLastFragment2.presentFragment(chatUsersActivity);
                        } else {
                            safeLastFragment2.presentFragment(new PostSuggestionsEditActivity(j2));
                        }
                    } else {
                        safeLastFragment2.presentFragment(new PrivacyControlActivity(10));
                    }
                }
                break;
            default:
                SendMessagesHelper.getInstance(this.f$1).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f$0, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
        }
    }

    public BookmarksFragment$$ExternalSyntheticLambda1(long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = j;
        this.f$1 = i;
    }
}
