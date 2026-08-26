package org.telegram.ui.web;

public final class BookmarksFragment$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BookmarksFragment f$0;

    public BookmarksFragment$$ExternalSyntheticLambda0(BookmarksFragment bookmarksFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = bookmarksFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updateWithOffset();
                break;
            default:
                this.f$0.updateWithOffset();
                break;
        }
    }
}
