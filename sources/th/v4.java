package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.v9;
public final class v4 implements v9 {
    public final int f48818a;
    public final Layout f48819b;
    public final int f48820c;
    public final int d;

    public v4(Layout layout, int i10, int i11, int i12) {
        this.f48818a = i12;
        this.f48819b = layout;
        this.f48820c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f48818a) {
            case 0:
                return this.f48819b;
            case 1:
                return this.f48819b;
            default:
                return this.f48819b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f48818a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f48818a) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return 1;
        }
    }

    @Override
    public final Rect getSelectionBounds() {
        switch (this.f48818a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f48818a) {
            case 0:
                return this.f48819b.getText();
            case 1:
                return this.f48819b.getText();
            default:
                return this.f48819b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f48818a) {
            case 0:
                return this.f48820c;
            case 1:
                return this.f48820c;
            default:
                return this.f48820c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f48818a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
