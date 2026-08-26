package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ArticleViewer;

public final class WebActionBar$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ArticleViewer.AnonymousClass15 f$0;

    public WebActionBar$$ExternalSyntheticLambda1(ArticleViewer.AnonymousClass15 anonymousClass15, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass15;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer.AnonymousClass15 anonymousClass15 = this.f$0;
                boolean z = anonymousClass15.addressing;
                WebActionBar.AnonymousClass4 anonymousClass4 = anonymousClass15.addressEditText;
                if (!z) {
                    anonymousClass4.clearFocus();
                    AndroidUtilities.hideKeyboard(anonymousClass4);
                } else {
                    anonymousClass4.requestFocus();
                    AndroidUtilities.showKeyboard(anonymousClass4);
                }
                break;
            default:
                ArticleViewer.AnonymousClass15 anonymousClass16 = this.f$0;
                anonymousClass16.longClicked = true;
                if (anonymousClass16.getParent() != null) {
                    anonymousClass16.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    anonymousClass16.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
