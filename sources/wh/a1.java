package wh;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class a1 implements ActionMode.Callback {
    public final e1 f49672a;

    public a1(e1 e1Var) {
        this.f49672a = e1Var;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.f49672a.length() != 0) {
            return false;
        }
        for (int size = menu.size() - 1; size >= 0; size--) {
            int itemId = menu.getItem(size).getItemId();
            if (itemId != 16908322 && itemId != 16908337) {
                menu.removeItem(itemId);
            }
        }
        return true;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
