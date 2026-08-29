package th;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class z0 implements ActionMode.Callback {
    public final d1 f48912a;

    public z0(d1 d1Var) {
        this.f48912a = d1Var;
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
        if (this.f48912a.length() != 0) {
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
