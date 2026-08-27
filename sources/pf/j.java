package pf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.y1;
import org.telegram.ui.Components.y9;
import org.telegram.ui.cy;

public final class j extends FrameLayout {

    public boolean f45833a;

    public final k f45834b;

    public j(k kVar, Context context) {
        super(context);
        this.f45834b = kVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight;
        int i12;
        k kVar = this.f45834b;
        int size = kVar.I.size();
        int i13 = kVar.f45857r;
        boolean z10 = i13 == 0 && kVar.h == 0 && MessagesController.getInstance(kVar.B).dialogs_dict.f(DialogObject.makeFolderDialogId(1)) != null;
        View view = (View) getParent();
        int i14 = view instanceof y9 ? ((y9) view).T2 : 0;
        boolean z11 = kVar.F;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i15 = paddingTop - i14;
        if (i13 == 1 && size == 1 && ((i) kVar.I.get(0)).f49413a == 19) {
            currentActionBarHeight = View.MeasureSpec.getSize(i11);
            if (currentActionBarHeight == 0) {
                currentActionBarHeight = view.getMeasuredHeight();
            }
            if (currentActionBarHeight == 0) {
                currentActionBarHeight = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            if (kVar.N.G) {
                currentActionBarHeight += AndroidUtilities.dp(81.0f);
            }
        } else if (size == 0 || (i15 == 0 && !z10)) {
            currentActionBarHeight = 0;
        } else {
            int size2 = View.MeasureSpec.getSize(i11);
            if (size2 == 0) {
                size2 = view.getMeasuredHeight();
            }
            if (size2 == 0) {
                size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            int i16 = size2 - i14;
            int iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
            int iDp2 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                if (((i) kVar.I.get(i17)).f49413a == 0) {
                    if (!((i) kVar.I.get(i17)).f45825f || z11) {
                        iDp2 += iDp;
                    } else {
                        iDp2 += AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                    }
                } else if (((i) kVar.I.get(i17)).f49413a == 1) {
                    iDp2 += iDp;
                }
            }
            int iC = (size - 1) + iDp2;
            ArrayList arrayList = kVar.d;
            if (arrayList != null) {
                iC = y1.C(52.0f, (kVar.d.size() - 1) + (AndroidUtilities.dp(58.0f) * arrayList.size()), iC);
            }
            int i18 = z10 ? iDp + 1 : 0;
            if (iC < i16) {
                currentActionBarHeight = ((i16 - iC) + i18) - paddingBottom;
                if (i15 != 0) {
                    currentActionBarHeight -= AndroidUtilities.statusBarHeight;
                    if (!z11 && !kVar.O) {
                        currentActionBarHeight -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                        if (getParent() instanceof cy) {
                            i12 = ((cy) getParent()).f37206p3;
                            currentActionBarHeight -= i12;
                        }
                    } else if (z11) {
                        currentActionBarHeight -= i15;
                    }
                }
            } else {
                int i19 = iC - i16;
                if (i19 < i18) {
                    currentActionBarHeight = (i18 - i19) - paddingBottom;
                    if (i15 != 0) {
                        currentActionBarHeight -= AndroidUtilities.statusBarHeight;
                        if (!z11 && !kVar.O) {
                            currentActionBarHeight -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (getParent() instanceof cy) {
                                i12 = ((cy) getParent()).f37206p3;
                                currentActionBarHeight -= i12;
                            }
                        } else if (z11) {
                            currentActionBarHeight -= i15;
                        }
                    }
                } else {
                    currentActionBarHeight = 0;
                }
            }
        }
        int iDp3 = currentActionBarHeight >= 0 ? currentActionBarHeight : 0;
        if (kVar.O) {
            iDp3 += AndroidUtilities.dp(1000.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iDp3, 1073741824));
    }
}
