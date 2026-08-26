package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.webkit.PermissionRequest;
import androidx.core.util.Consumer;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

public final class BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i = 1;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3 = (BotWebViewContainer.MyWebView.AnonymousClass3) obj4;
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    PermissionRequest permissionRequest = (PermissionRequest) obj3;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                    } else {
                        BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12 botWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12 = new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12(anonymousClass3, permissionRequest, (String[]) obj2, i);
                        int i2 = BotWebViewContainer.tags;
                        BotWebViewContainer.MyWebView.this.botWebViewContainer.runWithPermissions(botWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"});
                    }
                }
                break;
            case 1:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass4 = (BotWebViewContainer.MyWebView.AnonymousClass3) obj4;
                anonymousClass4.getClass();
                PermissionRequest permissionRequest2 = (PermissionRequest) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    permissionRequest2.deny();
                } else {
                    String[] strArr = (String[]) obj2;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
                break;
            default:
                Canvas canvas = (Canvas) obj;
                PremiumPreviewFragment.BackgroundView.AnonymousClass2 anonymousClass2 = ((PremiumPreviewFragment.BackgroundView) obj4).tierListView;
                View pressedChildView = anonymousClass2.getPressedChildView();
                int adapterPosition = pressedChildView == null ? -1 : anonymousClass2.getChildViewHolder(pressedChildView).getAdapterPosition();
                Path path = (Path) obj3;
                path.rewind();
                Rect selectorRect = anonymousClass2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr = (float[]) obj2;
                Arrays.fill(fArr, 0.0f);
                if (adapterPosition == 0) {
                    Arrays.fill(fArr, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (adapterPosition == anonymousClass2.getAdapter().getItemCount() - 1) {
                    Arrays.fill(fArr, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                break;
        }
    }
}
