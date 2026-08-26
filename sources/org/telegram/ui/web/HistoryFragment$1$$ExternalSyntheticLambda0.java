package org.telegram.ui.web;

import android.view.View;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Stories.DialogStoriesCell;

public final class HistoryFragment$1$$ExternalSyntheticLambda0 implements Consumer {
    public final int $r8$classId;

    public HistoryFragment$1$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                View view = (View) obj;
                if (view instanceof AddressBarList.BookmarkView) {
                    ((AddressBarList.BookmarkView) view).setChecked(false);
                }
                break;
            case 1:
                ((SampleQueue.SharedSampleMetadata) obj).getClass();
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof QuickRepliesActivity.QuickReplyView) {
                    ((QuickRepliesActivity.QuickReplyView) view2).textView.invalidate();
                }
                break;
            case 3:
                View view3 = (View) obj;
                if (view3 instanceof QuickRepliesActivity.QuickReplyView) {
                    ((QuickRepliesActivity.QuickReplyView) view3).checkBox.setChecked(false, true);
                }
                break;
            case 4:
                ((View) obj).invalidate();
                break;
            case 5:
                ((DialogStoriesCell.StoryCell) ((View) obj)).invalidate();
                break;
            case 6:
                DialogStoriesCell.lambda$updateCurrentState$16((View) obj);
                break;
            case 7:
                ((View) obj).setTranslationY(0.0f);
                break;
            default:
                View view4 = (View) obj;
                if (view4 instanceof AddressBarList.BookmarkView) {
                    ((AddressBarList.BookmarkView) view4).setChecked(false);
                }
                break;
        }
    }
}
