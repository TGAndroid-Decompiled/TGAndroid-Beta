package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.utils.FBool;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class WebBrowserSettings$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;

    public WebBrowserSettings$$ExternalSyntheticLambda10(Object obj, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.cacheSize = this.f$1;
                webBrowserSettings.cookiesSize = this.f$2;
                UniversalRecyclerView universalRecyclerView = webBrowserSettings.listView;
                if (universalRecyclerView != null && universalRecyclerView.adapter != null && universalRecyclerView.isAttachedToWindow()) {
                    webBrowserSettings.listView.adapter.update(true);
                    break;
                }
                break;
            case 1:
                ((BottomSheet[]) this.f$0)[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    long j = this.f$1;
                    Bundle bundleM = FBool.m(j, "user_id");
                    if (j == this.f$2) {
                        bundleM.putBoolean("my_profile", true);
                    }
                    bundleM.putBoolean("open_gifts", true);
                    safeLastFragment.presentFragment(new ProfileActivity(bundleM));
                }
                break;
            default:
                ((BottomSheet[]) this.f$0)[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    long j2 = this.f$1;
                    Bundle bundleM2 = FBool.m(j2, "user_id");
                    if (j2 == this.f$2) {
                        bundleM2.putBoolean("my_profile", true);
                    }
                    bundleM2.putBoolean("open_gifts", true);
                    safeLastFragment2.presentFragment(new ProfileActivity(bundleM2));
                }
                break;
        }
    }
}
