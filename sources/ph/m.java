package ph;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class m extends i51 {
    public static final int f44402a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        n nVar = (n) view;
        TranslateController.Language language = (TranslateController.Language) j51Var.G;
        nVar.f44403a.setText(language.displayName);
        nVar.f44404b.setText(language.ownDisplayName);
        if (nVar.f44405c != z4) {
            nVar.invalidate();
        }
        nVar.f44405c = z4;
        nVar.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new n(context);
    }
}
