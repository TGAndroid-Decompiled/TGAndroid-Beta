package ru.noties.jlatexmath;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.io.IOException;
import java.io.InputStream;
public abstract class JLatexMathAndroid {
    private static final String BASE = "org/scilab/forge/jlatexmath/";
    private static Context sContext;

    private JLatexMathAndroid() {
    }

    private static Context context() {
        Context context = sContext;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Please call `#init(Context)` method to initialize jLatexMath");
    }

    public static InputStream getResourceAsStream(String str) {
        try {
            AssetManager assets = context().getAssets();
            return assets.open("org/scilab/forge/jlatexmath/" + str);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void init(Context context) {
        sContext = context.getApplicationContext();
    }

    public static Typeface loadTypeface(String str) {
        AssetManager assets = context().getAssets();
        return Typeface.createFromAsset(assets, "org/scilab/forge/jlatexmath/" + str);
    }
}
