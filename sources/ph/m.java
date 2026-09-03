package ph;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class m extends g51 {
    public static final int f44433a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        n nVar = (n) view;
        TranslateController.Language language = (TranslateController.Language) h51Var.G;
        nVar.f44434a.setText(language.displayName);
        nVar.f44435b.setText(language.ownDisplayName);
        if (nVar.f44436c != z4) {
            nVar.invalidate();
        }
        nVar.f44436c = z4;
        nVar.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new n(context);
    }
}
