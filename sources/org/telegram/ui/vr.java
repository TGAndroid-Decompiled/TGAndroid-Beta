package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

public final class vr implements ActionMode.Callback {

    public final wr f43515a;

    public vr(wr wrVar) {
        this.f43515a = wrVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i10;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        wr wrVar = this.f43515a;
        ur urVar = wrVar.getParent() instanceof ur ? (ur) wrVar.getParent() : null;
        if (urVar != null && (clipboardManager = (ClipboardManager) f0.e.f(wrVar.getContext(), ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String string = primaryClip.getItemAt(0).getText().toString();
            try {
                i10 = Integer.parseInt(string);
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 > 0) {
                urVar.c(string, true);
            }
        }
        wrVar.hideActionMode();
        return true;
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, 16908322, 0, 17039371);
        return true;
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
