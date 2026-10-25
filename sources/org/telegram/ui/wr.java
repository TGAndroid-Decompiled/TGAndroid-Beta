package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class wr implements ActionMode.Callback {
    public final xr f45541a;

    public wr(xr xrVar) {
        this.f45541a = xrVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        vr vrVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i10;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        xr xrVar = this.f45541a;
        if (xrVar.getParent() instanceof vr) {
            vrVar = (vr) xrVar.getParent();
        } else {
            vrVar = null;
        }
        if (vrVar != null && (clipboardManager = (ClipboardManager) xrVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i10 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 > 0) {
                vrVar.c(charSequence, true);
            }
        }
        xrVar.hideActionMode();
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
