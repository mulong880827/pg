package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.merge.A.a;
import com.github.catvod.parser.merge.B.B0;
import com.github.catvod.parser.merge.B.C;
import com.github.catvod.parser.merge.B.C0028b;
import com.github.catvod.parser.merge.B.C0079z0;
import com.github.catvod.parser.merge.B.D;
import com.github.catvod.parser.merge.B.G;
import com.github.catvod.parser.merge.B.H;
import com.github.catvod.parser.merge.B.I;
import com.github.catvod.parser.merge.B.J;
import com.github.catvod.parser.merge.B.K;
import com.github.catvod.parser.merge.B.L;
import com.github.catvod.parser.merge.B.X;
import com.github.catvod.parser.merge.B.z1;
import com.github.catvod.parser.merge.C.C0081b;
import com.github.catvod.parser.merge.C.j;
import com.github.catvod.parser.merge.C.m;
import com.github.catvod.parser.merge.C.x;
import com.github.catvod.parser.merge.C.z;
import com.github.catvod.parser.merge.F.b;
import com.github.catvod.parser.merge.F.g;
import com.github.catvod.parser.merge.F.h;
import com.github.catvod.parser.merge.F.k;
import com.github.catvod.parser.merge.F.l;
import com.github.catvod.parser.merge.P0.c;
import com.github.catvod.parser.merge.Z.C0085a;
import com.github.catvod.parser.merge.Z.C0092h;
import com.github.catvod.parser.merge.a0.W;
import com.github.catvod.parser.merge.c0.p;
import com.github.catvod.parser.merge.c0.y;
import com.github.catvod.parser.merge.d0.e;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Response;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

public class Bili extends Spider {
    private static final String i = c.e(new byte[]{-97, -91, -10, -76, 16, -125, -3, -108, -55, -110, -80, -18, 77, -123, -124, -127, -66, -23, -58, -17, 89, -13, -12, -107, -51, -3, -59, -28, 70, -11, -19, -19, -51, -23, -63, -97, 64, -120, -122, -23, -49, -26, -59, -22, 69, -122, -13, -102, -108, -66, -26, -78, 23}, new byte[]{-3, -48, Byte.MIN_VALUE, -35, 116, -80, -64, -84});
    private static String j;
    public static AlertDialog k;
    private static k l = null;
    private static boolean m = false;
    private ScheduledExecutorService a;
    private JsonObject b;
    private boolean c;
    private boolean d;
    private l e;
    private a f;
    /* access modifiers changed from: private */
    public EditText g;
    private String h = null;

    static {
        c.e(new byte[]{-74, -109, 97, -56}, new byte[]{-44, -6, 13, -95, -36, 6, -127, -118});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v0, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A(java.lang.String r50, java.lang.String r51, java.util.HashMap r52) {
        /*
            r49 = this;
            r11 = r49
            r0 = r50
            r6 = r51
            r9 = r52
            java.lang.String r1 = ""
            r49.dismiss()     // Catch:{ Exception -> 0x068a }
            r2 = 128(0x80, float:1.794E-43)
            int r2 = com.github.catvod.parser.merge.P0.c.f(r2)     // Catch:{ Exception -> 0x068a }
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x068a }
            r4 = -2
            r5 = -1
            r3.<init>(r5, r4)     // Catch:{ Exception -> 0x068a }
            android.widget.LinearLayout r7 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x068a }
            android.app.Application r8 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r7.<init>(r8)     // Catch:{ Exception -> 0x068a }
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x068a }
            android.app.Application r10 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r8.<init>(r10)     // Catch:{ Exception -> 0x068a }
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x068a }
            r10.<init>(r2, r2)     // Catch:{ Exception -> 0x068a }
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x068a }
            r12.<init>(r4, r4)     // Catch:{ Exception -> 0x068a }
            android.widget.ImageView r13 = new android.widget.ImageView     // Catch:{ Exception -> 0x068a }
            android.app.Application r14 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r13.<init>(r14)     // Catch:{ Exception -> 0x068a }
            android.widget.ImageView$ScaleType r14 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ Exception -> 0x068a }
            r13.setScaleType(r14)     // Catch:{ Exception -> 0x068a }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x068a }
            r14.<init>()     // Catch:{ Exception -> 0x068a }
            r15 = 7
            byte[] r5 = new byte[r15]     // Catch:{ Exception -> 0x068a }
            r16 = 58
            r4 = 0
            r5[r4] = r16     // Catch:{ Exception -> 0x068a }
            r16 = 93
            r15 = 1
            r5[r15] = r16     // Catch:{ Exception -> 0x068a }
            r16 = 73
            r15 = 2
            r5[r15] = r16     // Catch:{ Exception -> 0x068a }
            r16 = 64
            r15 = 3
            r5[r15] = r16     // Catch:{ Exception -> 0x068a }
            r16 = -18
            r21 = 4
            r5[r21] = r16     // Catch:{ Exception -> 0x068a }
            r22 = 125(0x7d, float:1.75E-43)
            r15 = 5
            r5[r15] = r22     // Catch:{ Exception -> 0x068a }
            r22 = -122(0xffffffffffffff86, float:NaN)
            r15 = 6
            r5[r15] = r22     // Catch:{ Exception -> 0x068a }
            r15 = 8
            byte[] r4 = new byte[r15]     // Catch:{ Exception -> 0x068a }
            r26 = 82
            r25 = 0
            r4[r25] = r26     // Catch:{ Exception -> 0x068a }
            r26 = 41
            r19 = 1
            r4[r19] = r26     // Catch:{ Exception -> 0x068a }
            r26 = 61
            r20 = 2
            r4[r20] = r26     // Catch:{ Exception -> 0x068a }
            r26 = 48
            r23 = 3
            r4[r23] = r26     // Catch:{ Exception -> 0x068a }
            r26 = -44
            r4[r21] = r26     // Catch:{ Exception -> 0x068a }
            r26 = 82
            r24 = 5
            r4[r24] = r26     // Catch:{ Exception -> 0x068a }
            r26 = -87
            r22 = 6
            r4[r22] = r26     // Catch:{ Exception -> 0x068a }
            r27 = -115(0xffffffffffffff8d, float:NaN)
            r18 = 7
            r4[r18] = r27     // Catch:{ Exception -> 0x068a }
            java.lang.String r4 = com.github.catvod.parser.merge.P0.c.e(r5, r4)     // Catch:{ Exception -> 0x068a }
            r14.append(r4)     // Catch:{ Exception -> 0x068a }
            java.lang.String r4 = com.github.catvod.parser.merge.c0.y.A()     // Catch:{ Exception -> 0x068a }
            r14.append(r4)     // Catch:{ Exception -> 0x068a }
            r4 = 1
            byte[] r5 = new byte[r4]     // Catch:{ Exception -> 0x068a }
            r19 = -57
            r25 = 0
            r5[r25] = r19     // Catch:{ Exception -> 0x068a }
            byte[] r4 = new byte[r15]     // Catch:{ Exception -> 0x068a }
            r27 = -3
            r4[r25] = r27     // Catch:{ Exception -> 0x068a }
            r27 = -14
            r19 = 1
            r4[r19] = r27     // Catch:{ Exception -> 0x068a }
            r27 = -89
            r20 = 2
            r4[r20] = r27     // Catch:{ Exception -> 0x068a }
            r27 = 28
            r23 = 3
            r4[r23] = r27     // Catch:{ Exception -> 0x068a }
            r27 = -108(0xffffffffffffff94, float:NaN)
            r4[r21] = r27     // Catch:{ Exception -> 0x068a }
            r27 = 30
            r24 = 5
            r4[r24] = r27     // Catch:{ Exception -> 0x068a }
            r27 = 106(0x6a, float:1.49E-43)
            r22 = 6
            r4[r22] = r27     // Catch:{ Exception -> 0x068a }
            r27 = -64
            r18 = 7
            r4[r18] = r27     // Catch:{ Exception -> 0x068a }
            java.lang.String r4 = com.github.catvod.parser.merge.P0.c.e(r5, r4)     // Catch:{ Exception -> 0x068a }
            r14.append(r4)     // Catch:{ Exception -> 0x068a }
            int r4 = com.github.catvod.spider.Proxy.getPort()     // Catch:{ Exception -> 0x068a }
            r14.append(r4)     // Catch:{ Exception -> 0x068a }
            r4 = 15
            byte[] r5 = new byte[r4]     // Catch:{ Exception -> 0x068a }
            r27 = -9
            r25 = 0
            r5[r25] = r27     // Catch:{ Exception -> 0x068a }
            r17 = -2
            r19 = 1
            r5[r19] = r17     // Catch:{ Exception -> 0x068a }
            r27 = -96
            r20 = 2
            r5[r20] = r27     // Catch:{ Exception -> 0x068a }
            r27 = -51
            r23 = 3
            r5[r23] = r27     // Catch:{ Exception -> 0x068a }
            r27 = 11
            r5[r21] = r27     // Catch:{ Exception -> 0x068a }
            r24 = 5
            r5[r24] = r24     // Catch:{ Exception -> 0x068a }
            r19 = 6
            r22 = 1
            r5[r19] = r22     // Catch:{ Exception -> 0x068a }
            r28 = 42
            r18 = 7
            r5[r18] = r28     // Catch:{ Exception -> 0x068a }
            r29 = -73
            r5[r15] = r29     // Catch:{ Exception -> 0x068a }
            r29 = -77
            r30 = 9
            r5[r30] = r29     // Catch:{ Exception -> 0x068a }
            r29 = -69
            r31 = 10
            r5[r31] = r29     // Catch:{ Exception -> 0x068a }
            r29 = -52
            r5[r27] = r29     // Catch:{ Exception -> 0x068a }
            r29 = 12
            r23 = 3
            r5[r29] = r23     // Catch:{ Exception -> 0x068a }
            r32 = 13
            r5[r32] = r30     // Catch:{ Exception -> 0x068a }
            r33 = 74
            r34 = 14
            r5[r34] = r33     // Catch:{ Exception -> 0x068a }
            byte[] r4 = new byte[r15]     // Catch:{ Exception -> 0x068a }
            r35 = -40
            r25 = 0
            r4[r25] = r35     // Catch:{ Exception -> 0x068a }
            r36 = -114(0xffffffffffffff8e, float:NaN)
            r19 = 1
            r4[r19] = r36     // Catch:{ Exception -> 0x068a }
            r36 = -46
            r20 = 2
            r4[r20] = r36     // Catch:{ Exception -> 0x068a }
            r36 = -94
            r23 = 3
            r4[r23] = r36     // Catch:{ Exception -> 0x068a }
            r36 = 115(0x73, float:1.61E-43)
            r4[r21] = r36     // Catch:{ Exception -> 0x068a }
            r37 = 124(0x7c, float:1.74E-43)
            r24 = 5
            r4[r24] = r37     // Catch:{ Exception -> 0x068a }
            r37 = 62
            r22 = 6
            r4[r22] = r37     // Catch:{ Exception -> 0x068a }
            r37 = 78
            r18 = 7
            r4[r18] = r37     // Catch:{ Exception -> 0x068a }
            java.lang.String r4 = com.github.catvod.parser.merge.P0.c.e(r5, r4)     // Catch:{ Exception -> 0x068a }
            r14.append(r4)     // Catch:{ Exception -> 0x068a }
            java.lang.String r4 = r14.toString()     // Catch:{ Exception -> 0x068a }
            android.graphics.Bitmap r2 = com.github.catvod.parser.merge.c0.k.j(r2, r4)     // Catch:{ Exception -> 0x068a }
            r13.setImageBitmap(r2)     // Catch:{ Exception -> 0x068a }
            android.widget.TextView r2 = new android.widget.TextView     // Catch:{ Exception -> 0x068a }
            android.app.Application r5 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r2.<init>(r5)     // Catch:{ Exception -> 0x068a }
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r2.setTextColor(r5)     // Catch:{ Exception -> 0x068a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x068a }
            r5.<init>()     // Catch:{ Exception -> 0x068a }
            r14 = 23
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x068a }
            r38 = -12
            r25 = 0
            r15[r25] = r38     // Catch:{ Exception -> 0x068a }
            r38 = -67
            r19 = 1
            r15[r19] = r38     // Catch:{ Exception -> 0x068a }
            r38 = -83
            r20 = 2
            r15[r20] = r38     // Catch:{ Exception -> 0x068a }
            r38 = 116(0x74, float:1.63E-43)
            r23 = 3
            r15[r23] = r38     // Catch:{ Exception -> 0x068a }
            r38 = 98
            r15[r21] = r38     // Catch:{ Exception -> 0x068a }
            r39 = -119(0xffffffffffffff89, float:NaN)
            r24 = 5
            r15[r24] = r39     // Catch:{ Exception -> 0x068a }
            r39 = -97
            r22 = 6
            r15[r22] = r39     // Catch:{ Exception -> 0x068a }
            r39 = -22
            r18 = 7
            r15[r18] = r39     // Catch:{ Exception -> 0x068a }
            r39 = -124(0xffffffffffffff84, float:NaN)
            r37 = 8
            r15[r37] = r39     // Catch:{ Exception -> 0x068a }
            r39 = -38
            r15[r30] = r39     // Catch:{ Exception -> 0x068a }
            r39 = -82
            r15[r31] = r39     // Catch:{ Exception -> 0x068a }
            r39 = 33
            r15[r27] = r39     // Catch:{ Exception -> 0x068a }
            r40 = 37
            r15[r29] = r40     // Catch:{ Exception -> 0x068a }
            r40 = -80
            r15[r32] = r40     // Catch:{ Exception -> 0x068a }
            r40 = -36
            r15[r34] = r40     // Catch:{ Exception -> 0x068a }
            r40 = -123(0xffffffffffffff85, float:NaN)
            r33 = 15
            r15[r33] = r40     // Catch:{ Exception -> 0x068a }
            r40 = -92
            r41 = 16
            r15[r41] = r40     // Catch:{ Exception -> 0x068a }
            r42 = -127(0xffffffffffffff81, float:NaN)
            r43 = 17
            r15[r43] = r42     // Catch:{ Exception -> 0x068a }
            r42 = -53
            r44 = 18
            r15[r44] = r42     // Catch:{ Exception -> 0x068a }
            r42 = 19
            r15[r42] = r34     // Catch:{ Exception -> 0x068a }
            r45 = 64
            r46 = 20
            r15[r46] = r45     // Catch:{ Exception -> 0x068a }
            r45 = 21
            r33 = 15
            r15[r45] = r33     // Catch:{ Exception -> 0x068a }
            r47 = 22
            r15[r47] = r36     // Catch:{ Exception -> 0x068a }
            r48 = r1
            r14 = 8
            byte[] r1 = new byte[r14]     // Catch:{ Exception -> 0x068a }
            r14 = 0
            r1[r14] = r44     // Catch:{ Exception -> 0x068a }
            r14 = 51
            r19 = 1
            r1[r19] = r14     // Catch:{ Exception -> 0x068a }
            r14 = 46
            r20 = 2
            r1[r20] = r14     // Catch:{ Exception -> 0x068a }
            r14 = -109(0xffffffffffffff93, float:NaN)
            r23 = 3
            r1[r23] = r14     // Catch:{ Exception -> 0x068a }
            r14 = -64
            r1[r21] = r14     // Catch:{ Exception -> 0x068a }
            r14 = 53
            r24 = 5
            r1[r24] = r14     // Catch:{ Exception -> 0x068a }
            r14 = 121(0x79, float:1.7E-43)
            r22 = 6
            r1[r22] = r14     // Catch:{ Exception -> 0x068a }
            r14 = 7
            r1[r14] = r38     // Catch:{ Exception -> 0x068a }
            java.lang.String r1 = com.github.catvod.parser.merge.P0.c.e(r15, r1)     // Catch:{ Exception -> 0x068a }
            r5.append(r1)     // Catch:{ Exception -> 0x068a }
            r5.append(r4)     // Catch:{ Exception -> 0x068a }
            r1 = 50
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x068a }
            r4 = -34
            r14 = 0
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 94
            r14 = 1
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -111(0xffffffffffffff91, float:NaN)
            r14 = 2
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -42
            r14 = 3
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 47
            r1[r21] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 7
            r14 = 5
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r14 = -59
            r15 = 6
            r1[r15] = r14     // Catch:{ Exception -> 0x068a }
            r14 = 62
            r1[r4] = r14     // Catch:{ Exception -> 0x068a }
            r4 = 104(0x68, float:1.46E-43)
            r14 = 8
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 15
            r1[r30] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -11
            r1[r31] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -13
            r1[r27] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 109(0x6d, float:1.53E-43)
            r1[r29] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -91
            r1[r32] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -88
            r1[r34] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 94
            r14 = 15
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 66
            r1[r41] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 80
            r1[r43] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -117(0xffffffffffffff8b, float:NaN)
            r1[r44] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -62
            r1[r42] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 46
            r1[r46] = r4     // Catch:{ Exception -> 0x068a }
            r1[r45] = r39     // Catch:{ Exception -> 0x068a }
            r4 = 22
            r14 = -21
            r1[r4] = r14     // Catch:{ Exception -> 0x068a }
            r4 = 49
            r14 = 23
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 86
            r14 = 24
            r1[r14] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 25
            r1[r4] = r34     // Catch:{ Exception -> 0x068a }
            r4 = 26
            r15 = -11
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 27
            r15 = -15
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 28
            r1[r4] = r36     // Catch:{ Exception -> 0x068a }
            r4 = 29
            r15 = 75
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 30
            r15 = -10
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 31
            r15 = 92
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 32
            r15 = 50
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r1[r39] = r39     // Catch:{ Exception -> 0x068a }
            r4 = 34
            r1[r4] = r26     // Catch:{ Exception -> 0x068a }
            r4 = 35
            r15 = -98
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 36
            r15 = 118(0x76, float:1.65E-43)
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 37
            r15 = 60
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 38
            r15 = -85
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 39
            r15 = 83
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 40
            r15 = 113(0x71, float:1.58E-43)
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 41
            r15 = 81
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = -79
            r1[r28] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 43
            r15 = -16
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 44
            r15 = 32
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 45
            r1[r4] = r43     // Catch:{ Exception -> 0x068a }
            r4 = 46
            r15 = -35
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 47
            r15 = 51
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 48
            r15 = 81
            r1[r4] = r15     // Catch:{ Exception -> 0x068a }
            r4 = 49
            r1[r4] = r44     // Catch:{ Exception -> 0x068a }
            r4 = 8
            byte[] r15 = new byte[r4]     // Catch:{ Exception -> 0x068a }
            r4 = -44
            r25 = 0
            r15[r25] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -73
            r19 = 1
            r15[r19] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 2
            r15[r4] = r41     // Catch:{ Exception -> 0x068a }
            r4 = 118(0x76, float:1.65E-43)
            r23 = 3
            r15[r23] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -56
            r15[r21] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -81
            r24 = 5
            r15[r24] = r4     // Catch:{ Exception -> 0x068a }
            r4 = 78
            r22 = 6
            r15[r22] = r4     // Catch:{ Exception -> 0x068a }
            r4 = -42
            r18 = 7
            r15[r18] = r4     // Catch:{ Exception -> 0x068a }
            java.lang.String r1 = com.github.catvod.parser.merge.P0.c.e(r1, r15)     // Catch:{ Exception -> 0x068a }
            r5.append(r1)     // Catch:{ Exception -> 0x068a }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x068a }
            r2.setText(r1)     // Catch:{ Exception -> 0x068a }
            r1 = 0
            r7.setOrientation(r1)     // Catch:{ Exception -> 0x068a }
            r7.addView(r13, r10)     // Catch:{ Exception -> 0x068a }
            r7.addView(r2, r12)     // Catch:{ Exception -> 0x068a }
            r8.setOrientation(r1)     // Catch:{ Exception -> 0x068a }
            int r1 = com.github.catvod.parser.merge.P0.c.f(r21)     // Catch:{ Exception -> 0x068a }
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x068a }
            r2 = -2
            r5.<init>(r2, r2)     // Catch:{ Exception -> 0x068a }
            r5.setMargins(r1, r1, r1, r1)     // Catch:{ Exception -> 0x068a }
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x068a }
            r10 = -1
            r4.<init>(r10, r2)     // Catch:{ Exception -> 0x068a }
            android.widget.LinearLayout r2 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x068a }
            android.app.Application r10 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r2.<init>(r10)     // Catch:{ Exception -> 0x068a }
            r10 = 1
            r2.setOrientation(r10)     // Catch:{ Exception -> 0x068a }
            r3.setMargins(r1, r1, r1, r1)     // Catch:{ Exception -> 0x068a }
            r4.setMargins(r1, r1, r1, r1)     // Catch:{ Exception -> 0x068a }
            android.widget.EditText r1 = r11.g     // Catch:{ Exception -> 0x068a }
            if (r1 != 0) goto L_0x048e
            android.widget.EditText r1 = new android.widget.EditText     // Catch:{ Exception -> 0x068a }
            android.app.Application r10 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r1.<init>(r10)     // Catch:{ Exception -> 0x068a }
            r11.g = r1     // Catch:{ Exception -> 0x068a }
            r10 = 27
            byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x068a }
            r12 = -84
            r13 = 0
            r10[r13] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -119(0xffffffffffffff89, float:NaN)
            r13 = 1
            r10[r13] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 106(0x6a, float:1.49E-43)
            r13 = 2
            r10[r13] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -23
            r13 = 3
            r10[r13] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -80
            r10[r21] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 71
            r13 = 5
            r10[r13] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 6
            r10[r12] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -38
            r13 = 7
            r10[r13] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 8
            r10[r12] = r35     // Catch:{ Exception -> 0x068a }
            r10[r30] = r16     // Catch:{ Exception -> 0x068a }
            r12 = 86
            r10[r31] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -86
            r10[r27] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -34
            r10[r29] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 70
            r10[r32] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 114(0x72, float:1.6E-43)
            r10[r34] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -125(0xffffffffffffff83, float:NaN)
            r13 = 15
            r10[r13] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -1
            r10[r41] = r12     // Catch:{ Exception -> 0x068a }
            r10[r43] = r26     // Catch:{ Exception -> 0x068a }
            r12 = 54
            r10[r44] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -118(0xffffffffffffff8a, float:NaN)
            r10[r42] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -117(0xffffffffffffff8b, float:NaN)
            r10[r46] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 63
            r10[r45] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 22
            r13 = 122(0x7a, float:1.71E-43)
            r10[r12] = r13     // Catch:{ Exception -> 0x068a }
            r12 = -54
            r13 = 23
            r10[r13] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -93
            r10[r14] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 25
            r10[r12] = r40     // Catch:{ Exception -> 0x068a }
            r12 = 26
            r13 = 94
            r10[r12] = r13     // Catch:{ Exception -> 0x068a }
            r12 = 8
            byte[] r13 = new byte[r12]     // Catch:{ Exception -> 0x068a }
            r12 = 75
            r15 = 0
            r13[r15] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 1
            r13[r12] = r27     // Catch:{ Exception -> 0x068a }
            r12 = -45
            r15 = 2
            r13[r15] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 15
            r15 = 3
            r13[r15] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 56
            r13[r21] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -42
            r15 = 5
            r13[r15] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 6
            r13[r12] = r16     // Catch:{ Exception -> 0x068a }
            r12 = 100
            r15 = 7
            r13[r15] = r12     // Catch:{ Exception -> 0x068a }
            java.lang.String r10 = com.github.catvod.parser.merge.P0.c.e(r10, r13)     // Catch:{ Exception -> 0x068a }
            r1.setHint(r10)     // Catch:{ Exception -> 0x068a }
            android.widget.EditText r1 = r11.g     // Catch:{ Exception -> 0x068a }
            r10 = 2131335577(0x7f099999, float:1.8290176E38)
            r1.setId(r10)     // Catch:{ Exception -> 0x068a }
            android.widget.EditText r1 = r11.g     // Catch:{ Exception -> 0x068a }
            com.github.catvod.spider.Bili$1 r10 = new com.github.catvod.spider.Bili$1     // Catch:{ Exception -> 0x068a }
            r10.<init>()     // Catch:{ Exception -> 0x068a }
            r1.addTextChangedListener(r10)     // Catch:{ Exception -> 0x068a }
            android.widget.EditText r1 = r11.g     // Catch:{ Exception -> 0x068a }
            com.github.catvod.spider.Bili$2 r10 = new com.github.catvod.spider.Bili$2     // Catch:{ Exception -> 0x068a }
            r10.<init>(r0, r6, r9)     // Catch:{ Exception -> 0x068a }
            r1.setOnKeyListener(r10)     // Catch:{ Exception -> 0x068a }
        L_0x048e:
            r1 = 5
            byte[] r10 = new byte[r1]     // Catch:{ Exception -> 0x068a }
            r1 = 61
            r12 = 0
            r10[r12] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 1
            r10[r1] = r35     // Catch:{ Exception -> 0x068a }
            r1 = 113(0x71, float:1.58E-43)
            r12 = 2
            r10[r12] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -100
            r12 = 3
            r10[r12] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 29
            r10[r21] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 8
            byte[] r12 = new byte[r1]     // Catch:{ Exception -> 0x068a }
            r1 = 89
            r13 = 0
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -71
            r13 = 1
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 31
            r13 = 2
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -15
            r13 = 3
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 104(0x68, float:1.46E-43)
            r12[r21] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 63
            r13 = 5
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -128(0xffffffffffffff80, float:NaN)
            r13 = 6
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 34
            r13 = 7
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            java.lang.String r1 = com.github.catvod.parser.merge.P0.c.e(r10, r12)     // Catch:{ Exception -> 0x068a }
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x068a }
            if (r1 == 0) goto L_0x04e6
            r1 = 3
            int r10 = com.github.catvod.parser.merge.c0.k.m(r1, r0)     // Catch:{ Exception -> 0x068a }
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x068a }
            goto L_0x053f
        L_0x04e6:
            r1 = 7
            byte[] r10 = new byte[r1]     // Catch:{ Exception -> 0x068a }
            r1 = 74
            r12 = 0
            r10[r12] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -81
            r12 = 1
            r10[r12] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 75
            r12 = 2
            r10[r12] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 3
            r10[r1] = r32     // Catch:{ Exception -> 0x068a }
            r1 = -104(0xffffffffffffff98, float:NaN)
            r10[r21] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -16
            r12 = 5
            r10[r12] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -115(0xffffffffffffff8d, float:NaN)
            r12 = 6
            r10[r12] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 8
            byte[] r12 = new byte[r1]     // Catch:{ Exception -> 0x068a }
            r1 = 45
            r13 = 0
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -61
            r13 = 1
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 36
            r13 = 2
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 111(0x6f, float:1.56E-43)
            r13 = 3
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -7
            r12[r21] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -100
            r13 = 5
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = -46
            r13 = 6
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            r1 = 50
            r13 = 7
            r12[r13] = r1     // Catch:{ Exception -> 0x068a }
            java.lang.String r1 = com.github.catvod.parser.merge.P0.c.e(r10, r12)     // Catch:{ Exception -> 0x068a }
            java.lang.String r1 = r1.concat(r0)     // Catch:{ Exception -> 0x068a }
            java.lang.String r1 = com.github.catvod.parser.merge.c0.k.o(r1)     // Catch:{ Exception -> 0x068a }
        L_0x053f:
            android.widget.Button r10 = new android.widget.Button     // Catch:{ Exception -> 0x068a }
            android.app.Application r12 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r10.<init>(r12)     // Catch:{ Exception -> 0x068a }
            r12 = 6
            byte[] r13 = new byte[r12]     // Catch:{ Exception -> 0x068a }
            r12 = 0
            r13[r12] = r38     // Catch:{ Exception -> 0x068a }
            r12 = 51
            r15 = 1
            r13[r15] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 67
            r15 = 2
            r13[r15] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -104(0xffffffffffffff98, float:NaN)
            r15 = 3
            r13[r15] = r12     // Catch:{ Exception -> 0x068a }
            r13[r21] = r40     // Catch:{ Exception -> 0x068a }
            r12 = 5
            r13[r12] = r14     // Catch:{ Exception -> 0x068a }
            r12 = 8
            byte[] r15 = new byte[r12]     // Catch:{ Exception -> 0x068a }
            r12 = -124(0xffffffffffffff84, float:NaN)
            r16 = 0
            r15[r16] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -93
            r16 = 1
            r15[r16] = r12     // Catch:{ Exception -> 0x068a }
            r12 = -33
            r16 = 2
            r15[r16] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 127(0x7f, float:1.78E-43)
            r16 = 3
            r15[r16] = r12     // Catch:{ Exception -> 0x068a }
            r15[r21] = r41     // Catch:{ Exception -> 0x068a }
            r12 = -70
            r16 = 5
            r15[r16] = r12     // Catch:{ Exception -> 0x068a }
            r12 = 6
            r15[r12] = r28     // Catch:{ Exception -> 0x068a }
            r12 = -35
            r16 = 7
            r15[r16] = r12     // Catch:{ Exception -> 0x068a }
            java.lang.String r12 = com.github.catvod.parser.merge.P0.c.e(r13, r15)     // Catch:{ Exception -> 0x068a }
            r10.setText(r12)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.spider.Bili$3 r12 = new com.github.catvod.spider.Bili$3     // Catch:{ Exception -> 0x068a }
            r12.<init>(r0, r6, r9)     // Catch:{ Exception -> 0x068a }
            r10.setOnClickListener(r12)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.parser.merge.W.c r12 = new com.github.catvod.parser.merge.W.c     // Catch:{ Exception -> 0x068a }
            android.app.Application r13 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r12.<init>(r13)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.spider.m r13 = new com.github.catvod.spider.m     // Catch:{ Exception -> 0x068a }
            r15 = 5
            r13.<init>(r11, r12, r15)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.spider.Init.run(r13)     // Catch:{ Exception -> 0x068a }
            boolean r13 = android.text.TextUtils.isEmpty(r48)     // Catch:{ Exception -> 0x068a }
            if (r13 == 0) goto L_0x05b7
            goto L_0x05f9
        L_0x05b7:
            r13 = 1
            byte[] r15 = new byte[r13]     // Catch:{ Exception -> 0x068a }
            r16 = 109(0x6d, float:1.53E-43)
            r19 = 0
            r15[r19] = r16     // Catch:{ Exception -> 0x068a }
            r14 = 8
            byte[] r13 = new byte[r14]     // Catch:{ Exception -> 0x068a }
            r14 = 65
            r13[r19] = r14     // Catch:{ Exception -> 0x068a }
            r14 = -117(0xffffffffffffff8b, float:NaN)
            r19 = 1
            r13[r19] = r14     // Catch:{ Exception -> 0x068a }
            r14 = -95
            r19 = 2
            r13[r19] = r14     // Catch:{ Exception -> 0x068a }
            r14 = -66
            r19 = 3
            r13[r19] = r14     // Catch:{ Exception -> 0x068a }
            r14 = 32
            r13[r21] = r14     // Catch:{ Exception -> 0x068a }
            r14 = -85
            r19 = 5
            r13[r19] = r14     // Catch:{ Exception -> 0x068a }
            r14 = 24
            r16 = 6
            r13[r16] = r14     // Catch:{ Exception -> 0x068a }
            r14 = -50
            r16 = 7
            r13[r16] = r14     // Catch:{ Exception -> 0x068a }
            java.lang.String r13 = com.github.catvod.parser.merge.P0.c.e(r15, r13)     // Catch:{ Exception -> 0x068a }
            r14 = r48
            r14.split(r13)     // Catch:{ Exception -> 0x068a }
        L_0x05f9:
            android.widget.GridView r13 = new android.widget.GridView     // Catch:{ Exception -> 0x068a }
            android.app.Application r14 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r13.<init>(r14)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.parser.merge.A.a r14 = new com.github.catvod.parser.merge.A.a     // Catch:{ Exception -> 0x068a }
            android.app.Application r15 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r16 = r12
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x068a }
            r12.<init>()     // Catch:{ Exception -> 0x068a }
            r14.<init>(r15, r12)     // Catch:{ Exception -> 0x068a }
            r11.f = r14     // Catch:{ Exception -> 0x068a }
            r13.setAdapter(r14)     // Catch:{ Exception -> 0x068a }
            r12 = 2
            r13.setNumColumns(r12)     // Catch:{ Exception -> 0x068a }
            r12 = 8
            r13.setHorizontalSpacing(r12)     // Catch:{ Exception -> 0x068a }
            r13.setVerticalSpacing(r12)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.spider.Bili$5 r12 = new com.github.catvod.spider.Bili$5     // Catch:{ Exception -> 0x068a }
            r12.<init>(r0, r6, r9)     // Catch:{ Exception -> 0x068a }
            r13.setOnItemClickListener(r12)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.spider.Bili$6 r12 = new com.github.catvod.spider.Bili$6     // Catch:{ Exception -> 0x068a }
            r12.<init>()     // Catch:{ Exception -> 0x068a }
            r13.setOnItemSelectedListener(r12)     // Catch:{ Exception -> 0x068a }
            boolean r12 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x068a }
            if (r12 != 0) goto L_0x063e
            android.widget.EditText r12 = r11.g     // Catch:{ Exception -> 0x068a }
            r12.setText(r1)     // Catch:{ Exception -> 0x068a }
        L_0x063e:
            android.widget.EditText r1 = r11.g     // Catch:{ Exception -> 0x068a }
            r8.addView(r1, r5)     // Catch:{ Exception -> 0x068a }
            r2.addView(r8, r4)     // Catch:{ Exception -> 0x068a }
            r2.addView(r10, r4)     // Catch:{ Exception -> 0x068a }
            android.widget.AbsListView$LayoutParams r1 = new android.widget.AbsListView$LayoutParams     // Catch:{ Exception -> 0x068a }
            r4 = 120(0x78, float:1.68E-43)
            int r4 = com.github.catvod.parser.merge.P0.c.f(r4)     // Catch:{ Exception -> 0x068a }
            r10 = -1
            r1.<init>(r10, r4)     // Catch:{ Exception -> 0x068a }
            r2.addView(r13, r1)     // Catch:{ Exception -> 0x068a }
            r2.addView(r7, r3)     // Catch:{ Exception -> 0x068a }
            int r1 = com.github.catvod.parser.merge.P0.c.f(r41)     // Catch:{ Exception -> 0x068a }
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x068a }
            r4 = -2
            r3.<init>(r10, r4)     // Catch:{ Exception -> 0x068a }
            android.widget.ScrollView r7 = new android.widget.ScrollView     // Catch:{ Exception -> 0x068a }
            android.app.Application r4 = com.github.catvod.spider.Init.context()     // Catch:{ Exception -> 0x068a }
            r7.<init>(r4)     // Catch:{ Exception -> 0x068a }
            r3.setMargins(r1, r1, r1, r1)     // Catch:{ Exception -> 0x068a }
            r7.addView(r2, r3)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.parser.merge.a0.a r12 = new com.github.catvod.parser.merge.a0.a     // Catch:{ Exception -> 0x068a }
            r10 = 2
            r1 = r12
            r2 = r49
            r3 = r8
            r4 = r16
            r6 = r51
            r8 = r50
            r9 = r52
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x068a }
            com.github.catvod.spider.Init.run(r12)     // Catch:{ Exception -> 0x068a }
            goto L_0x068e
        L_0x068a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x068e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Bili.A(java.lang.String, java.lang.String, java.util.HashMap):void");
    }

    private void B(b bVar) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c.f(240), c.f(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.parser.merge.c0.k.j(240, bVar.o()));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog show = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new C0079z0(1, this)).setOnDismissListener(new B0(1, this)).show();
            k = show;
            show.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            p.b(c.e(new byte[]{-126, 30, -51, 90, 0, 105, 26, 34, -62, -107, 4, -41, -47, -65, -65, -33, 6, -36, 102, -1, -51, -90, -35, 80, -28, 54, -96, 49, 50, 50, 71, 58, -115, 3, -21, 89, 31, 106}, new byte[]{106, -75, 70, -66, -67, -42, -3, -74}));
        } catch (Exception unused) {
        }
    }

    private void C() {
        ScheduledExecutorService scheduledExecutorService = this.a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new W(1, this));
    }

    public static /* synthetic */ void b(Bili bili, String str) {
        EditText editText;
        Bili bili2 = bili;
        bili.getClass();
        try {
            AlertDialog alertDialog = k;
            if (alertDialog != null && alertDialog.isShowing() && (editText = bili2.g) != null) {
                if (!editText.getText().toString().trim().isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[Token.IF];
                    bArr[0] = -75;
                    bArr[1] = 43;
                    bArr[2] = 75;
                    bArr[3] = 83;
                    bArr[4] = -59;
                    bArr[5] = -121;
                    bArr[6] = 42;
                    bArr[7] = -2;
                    bArr[8] = -87;
                    bArr[9] = 41;
                    bArr[10] = 17;
                    bArr[11] = 66;
                    bArr[12] = -33;
                    bArr[13] = -50;
                    bArr[14] = 96;
                    bArr[15] = -76;
                    bArr[16] = -87;
                    bArr[17] = 113;
                    bArr[18] = 94;
                    bArr[19] = 87;
                    bArr[20] = -33;
                    bArr[21] = -36;
                    bArr[22] = 107;
                    bArr[23] = -96;
                    bArr[24] = -76;
                    bArr[25] = 113;
                    bArr[26] = 92;
                    bArr[27] = 76;
                    bArr[28] = -37;
                    bArr[29] = -110;
                    bArr[30] = 108;
                    bArr[31] = -4;
                    bArr[32] = -87;
                    bArr[33] = 41;
                    bArr[34] = 93;
                    bArr[35] = 74;
                    bArr[36] = -40;
                    bArr[37] = -110;
                    bArr[38] = 116;
                    bArr[39] = -91;
                    bArr[40] = -85;
                    bArr[41] = 0;
                    bArr[42] = 73;
                    bArr[43] = 74;
                    bArr[44] = -46;
                    bArr[45] = -40;
                    bArr[46] = 106;
                    bArr[47] = -2;
                    bArr[48] = -82;
                    bArr[49] = 58;
                    bArr[50] = 94;
                    bArr[51] = 81;
                    bArr[52] = -43;
                    bArr[53] = -43;
                    bArr[54] = 42;
                    bArr[55] = -74;
                    bArr[56] = -72;
                    bArr[57] = 43;
                    bArr[58] = 96;
                    bArr[59] = 80;
                    bArr[60] = -45;
                    bArr[61] = -36;
                    bArr[62] = 119;
                    bArr[63] = -78;
                    bArr[64] = -75;
                    bArr[65] = 0;
                    bArr[66] = 76;
                    bArr[67] = 78;
                    bArr[68] = -41;
                    bArr[69] = -49;
                    bArr[70] = 113;
                    bArr[71] = -114;
                    bArr[72] = -65;
                    bArr[73] = 48;
                    bArr[74] = 71;
                    bArr[75] = 28;
                    bArr[76] = -48;
                    bArr[77] = -46;
                    bArr[78] = 119;
                    bArr[79] = -68;
                    bArr[80] = -68;
                    bArr[81] = 43;
                    bArr[82] = 2;
                    bArr[83] = 73;
                    bArr[84] = -59;
                    bArr[85] = -46;
                    bArr[86] = 107;
                    bArr[87] = -9;
                    bArr[88] = -83;
                    bArr[89] = 62;
                    bArr[90] = 88;
                    bArr[91] = 70;
                    bArr[92] = -23;
                    bArr[93] = -45;
                    bArr[94] = 112;
                    bArr[95] = -68;
                    bArr[96] = -32;
                    bArr[97] = 111;
                    bArr[98] = 25;
                    bArr[99] = 83;
                    bArr[100] = -41;
                    bArr[101] = -38;
                    bArr[102] = 96;
                    bArr[103] = -114;
                    bArr[104] = -82;
                    bArr[105] = 54;
                    bArr[106] = 69;
                    bArr[107] = 70;
                    bArr[108] = -117;
                    bArr[109] = -116;
                    bArr[110] = 53;
                    bArr[111] = -9;
                    bArr[112] = -74;
                    bArr[113] = 58;
                    bArr[114] = 70;
                    bArr[115] = 30;
                    sb.append(c.e(bArr, new byte[]{-35, 95, 63, 35, -74, -67, 5, -47}));
                    sb.append(URLEncoder.encode(str));
                    Response k2 = C0092h.k(sb.toString());
                    List<String> a2 = x.a(k2.body().string());
                    k2.body().close();
                    k2.close();
                    Init.run(new D(bili2, a2, 4));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r17.B(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00ae, code lost:
        com.github.catvod.spider.Init.execute(new com.github.catvod.parser.merge.B.C0045i(r1, r2, 8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00b7, code lost:
        com.github.catvod.spider.Init.execute(new com.github.catvod.parser.merge.B.C(r1, r2, 5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x00ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(com.github.catvod.spider.Bili r17, com.github.catvod.parser.merge.F.b r18) {
        /*
            r1 = r17
            r2 = r18
            r17.getClass()
            r0 = 8
            r3 = 5
            android.app.Activity r4 = com.github.catvod.spider.Init.getActivity()     // Catch:{ Exception -> 0x00ab }
            r5 = 19
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x00ab }
            r6 = 114(0x72, float:1.6E-43)
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = -68
            r8 = 1
            r5[r8] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = -18
            r9 = 2
            r5[r9] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 72
            r10 = 3
            r5[r10] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 58
            r11 = 4
            r5[r11] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 87
            r5[r3] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 76
            r12 = 6
            r5[r12] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = -123(0xffffffffffffff85, float:NaN)
            r13 = 7
            r5[r13] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 115(0x73, float:1.61E-43)
            r5[r0] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 9
            r14 = -70
            r5[r6] = r14     // Catch:{ Exception -> 0x00ab }
            r6 = 10
            r15 = -17
            r5[r6] = r15     // Catch:{ Exception -> 0x00ab }
            r6 = 11
            r15 = 15
            r5[r6] = r15     // Catch:{ Exception -> 0x00ab }
            r6 = 12
            r16 = 118(0x76, float:1.65E-43)
            r5[r6] = r16     // Catch:{ Exception -> 0x00ab }
            r6 = 13
            r16 = 95
            r5[r6] = r16     // Catch:{ Exception -> 0x00ab }
            r6 = 14
            r16 = 80
            r5[r6] = r16     // Catch:{ Exception -> 0x00ab }
            r6 = -100
            r5[r15] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 16
            r15 = 63
            r5[r6] = r15     // Catch:{ Exception -> 0x00ab }
            r6 = 17
            r5[r6] = r14     // Catch:{ Exception -> 0x00ab }
            r14 = 18
            r15 = -19
            r5[r14] = r15     // Catch:{ Exception -> 0x00ab }
            byte[] r14 = new byte[r0]     // Catch:{ Exception -> 0x00ab }
            r14[r7] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = -45
            r14[r8] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = -125(0xffffffffffffff83, float:NaN)
            r14[r9] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 102(0x66, float:1.43E-43)
            r14[r10] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 88
            r14[r11] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 62
            r14[r3] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = 32
            r14[r12] = r6     // Catch:{ Exception -> 0x00ab }
            r6 = -20
            r14[r13] = r6     // Catch:{ Exception -> 0x00ab }
            java.lang.String r5 = com.github.catvod.parser.merge.P0.c.e(r5, r14)     // Catch:{ Exception -> 0x00ab }
            android.content.Intent r5 = x(r5, r2)     // Catch:{ Exception -> 0x00ab }
            r4.startActivity(r5)     // Catch:{ Exception -> 0x00ab }
            com.github.catvod.parser.merge.B.S0 r0 = new com.github.catvod.parser.merge.B.S0
            r0.<init>(r1, r2, r9)
            com.github.catvod.spider.Init.execute(r0)
            goto L_0x00b6
        L_0x00a9:
            r0 = move-exception
            goto L_0x00b7
        L_0x00ab:
            r17.B(r18)     // Catch:{ all -> 0x00a9 }
            com.github.catvod.parser.merge.B.i r3 = new com.github.catvod.parser.merge.B.i
            r3.<init>(r1, r2, r0)
            com.github.catvod.spider.Init.execute(r3)
        L_0x00b6:
            return
        L_0x00b7:
            com.github.catvod.parser.merge.B.C r4 = new com.github.catvod.parser.merge.B.C
            r4.<init>(r1, r2, r3)
            com.github.catvod.spider.Init.execute(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Bili.c(com.github.catvod.spider.Bili, com.github.catvod.parser.merge.F.b):void");
    }

    public static /* synthetic */ void d(Bili bili, HashMap hashMap) {
        bili.getClass();
        SystemClock.sleep(1000);
        bili.A(c.e(new byte[]{-63, 19, -18, -35, 38, -4, -93, 18, -47, 25, -22}, new byte[]{-93, 122, -126, -76, 121, -113, -58, 115}), c.e(new byte[]{-127, -85, 56, -127, 118, 101, -24, 92, -44, -46, 48, -56, 42, 104, Byte.MIN_VALUE}, new byte[]{103, 59, -92, 102, -62, -57, 13, -39}), hashMap);
    }

    public static void e(Bili bili, String str) {
        EditText editText;
        Bili bili2 = bili;
        bili.getClass();
        try {
            String h2 = C0085a.h(c.e(new byte[]{-29, -1, -108, 58, -49}, new byte[]{-109, -115, -5, 66, -74, -55, 65, 115}));
            AlertDialog alertDialog = k;
            if (alertDialog != null && alertDialog.isShowing() && (editText = bili2.g) != null) {
                if (!editText.getText().toString().trim().isEmpty()) {
                    HashMap hashMap = new HashMap();
                    String e2 = c.e(new byte[]{106, 98, 74, -57, 104, 29, 24, 92, 81, 101}, new byte[]{63, 17, 47, -75, 69, 92, Byte.MAX_VALUE, 57});
                    byte[] bArr = new byte[Token.DEC];
                    // fill-array-data instruction
                    bArr[0] = -31;
                    bArr[1] = -7;
                    bArr[2] = 100;
                    bArr[3] = -52;
                    bArr[4] = -27;
                    bArr[5] = -120;
                    bArr[6] = 53;
                    bArr[7] = -78;
                    bArr[8] = -103;
                    bArr[9] = -72;
                    bArr[10] = 46;
                    bArr[11] = -123;
                    bArr[12] = -95;
                    bArr[13] = -77;
                    bArr[14] = 61;
                    bArr[15] = -13;
                    bArr[16] = -56;
                    bArr[17] = -7;
                    bArr[18] = 105;
                    bArr[19] = -42;
                    bArr[20] = -87;
                    bArr[21] = -86;
                    bArr[22] = 0;
                    bArr[23] = -67;
                    bArr[24] = -99;
                    bArr[25] = -90;
                    bArr[26] = 48;
                    bArr[27] = -107;
                    bArr[28] = -78;
                    bArr[29] = -60;
                    bArr[30] = 3;
                    bArr[31] = -12;
                    bArr[32] = -62;
                    bArr[33] = -96;
                    bArr[34] = 42;
                    bArr[35] = -98;
                    bArr[36] = -87;
                    bArr[37] = -100;
                    bArr[38] = 98;
                    bArr[39] = -87;
                    bArr[40] = -123;
                    bArr[41] = -74;
                    bArr[42] = 95;
                    bArr[43] = -43;
                    bArr[44] = -7;
                    bArr[45] = -120;
                    bArr[46] = 49;
                    bArr[47] = -54;
                    bArr[48] = -55;
                    bArr[49] = -12;
                    bArr[50] = 85;
                    bArr[51] = -52;
                    bArr[52] = -3;
                    bArr[53] = -53;
                    bArr[54] = 97;
                    bArr[55] = -82;
                    bArr[56] = -101;
                    bArr[57] = -72;
                    bArr[58] = 45;
                    bArr[59] = -109;
                    bArr[60] = -87;
                    bArr[61] = -52;
                    bArr[62] = 31;
                    bArr[63] = -43;
                    bArr[64] = -8;
                    bArr[65] = -37;
                    bArr[66] = 82;
                    bArr[67] = -119;
                    bArr[68] = -87;
                    bArr[69] = -120;
                    bArr[70] = 61;
                    bArr[71] = -10;
                    bArr[72] = -55;
                    bArr[73] = -74;
                    bArr[74] = 89;
                    bArr[75] = -64;
                    bArr[76] = -22;
                    bArr[77] = -113;
                    bArr[78] = 59;
                    bArr[79] = -76;
                    bArr[80] = -116;
                    bArr[81] = -43;
                    bArr[82] = 118;
                    bArr[83] = -41;
                    bArr[84] = -26;
                    bArr[85] = -119;
                    bArr[86] = 49;
                    bArr[87] = -78;
                    bArr[88] = -99;
                    bArr[89] = -91;
                    bArr[90] = 38;
                    bArr[91] = -117;
                    bArr[92] = -71;
                    bArr[93] = -54;
                    bArr[94] = 100;
                    bArr[95] = -77;
                    bArr[96] = -100;
                    bArr[97] = -74;
                    bArr[98] = 77;
                    bArr[99] = -60;
                    bArr[100] = -17;
                    bArr[101] = -123;
                    bArr[102] = 38;
                    bArr[103] = -12;
                    bArr[104] = -125;
                    bArr[105] = -93;
                    bArr[106] = 45;
                    bArr[107] = -110;
                    bArr[108] = -89;
                    bArr[109] = -41;
                    bArr[110] = 98;
                    hashMap.put(e2, c.e(bArr, new byte[]{-84, -106, 30, -91, -119, -28, 84, -99}));
                    Response m2 = C0092h.m(hashMap, c.e(new byte[]{63, -51, 23, -84, 76, 11, 63, 54, 32, -50, 20, -14, 88, 94, Byte.MAX_VALUE, 126, 59, -36, 77, -65, 80, 92, 63, 122, 56, -44, 19, -80, 90, 69, 117, 54, 36, -36, 2, -82, 92, 89, 47, 113, 59, -124, 25, -76, 25, 85, 99, 36, 46, -51, 69, -77, 74, 69, 96, 108, 35, -124, 5, -75, 77, 84, 118, 118, 47, -97, 18, -31}, new byte[]{87, -71, 99, -36, 63, 49, 16, 25}) + URLEncoder.encode(str), h2);
                    JsonArray asJsonArray = c.x(m2.body().string()).getAsJsonArray().get(1).getAsJsonArray();
                    m2.body().close();
                    m2.close();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    Iterator it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((JsonElement) it.next()).getAsString());
                    }
                    Init.run(new C0028b(bili2, arrayList, 7));
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static /* synthetic */ void f(Bili bili, String str) {
        EditText editText;
        Bili bili2 = bili;
        bili.getClass();
        try {
            AlertDialog alertDialog = k;
            if (alertDialog != null && alertDialog.isShowing() && (editText = bili2.g) != null) {
                if (!editText.getText().toString().trim().isEmpty()) {
                    Response k2 = C0092h.k(c.e(new byte[]{-110, -89, 55, -28, -21, -40, 23, 80, -119, -90, 36, -13, -3, -111, 76, 81, -116, -70, 39, -15, -9, -52, 81, 14, -109, -86, 42, -70, -5, -115, 85, 80, -59, -70, 37, -87, -11, -115, 90, 22, -106, -74, 101, -1, -3, -101, 5}, new byte[]{-6, -45, 67, -108, -104, -30, 56, Byte.MAX_VALUE}) + URLEncoder.encode(str));
                    List<String> a2 = com.github.catvod.parser.merge.C.p.a(k2.body().string());
                    k2.body().close();
                    k2.close();
                    Init.run(new z1(bili2, a2, 4), Context.VERSION_ES6);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void g(Bili bili, List list) {
        bili.getClass();
        L.e(new byte[]{96, 24, -95, -50, -99, -43, -123, -59, 94, 18, -96, -13, -122, -61, -64, -125, 86, 3, -18}, new byte[]{57, 119, -44, -69, -23, -73, -32, -21}, new StringBuilder(), list);
        bili.f.a(list);
    }

    private static File getCache() {
        return com.github.catvod.parser.merge.D0.a.r(c.e(new byte[]{83, 82, 108, 78, -47, 109, -117, 90}, new byte[]{49, 59, 0, 39, -77, 4, -25, 51}));
    }

    public static String getCookie() {
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        if (l == null) {
            l = k.c(com.github.catvod.parser.merge.D0.a.l(getUserCache()));
        }
        String b2 = l.b();
        return !TextUtils.isEmpty(b2) ? b2 : i;
    }

    public static File getUserCache() {
        String str;
        if (!TextUtils.isEmpty(com.github.catvod.parser.merge.D0.a.l(com.github.catvod.parser.merge.D0.a.r(c.e(new byte[]{-112, 86, -63, 112, 35, -46, 22, 37, Byte.MIN_VALUE, 17, -35, 126}, new byte[]{-14, 63, -83, 25, 124, -89, 101, 64}))))) {
            str = c.e(new byte[]{-120, -120, 49, -32, 35, 78, -28, 100, -104, -49, 45, -18}, new byte[]{-22, -31, 93, -119, 124, 59, -105, 1});
        } else {
            String l2 = com.github.catvod.parser.merge.D0.a.l(com.github.catvod.parser.merge.D0.a.r(c.e(new byte[]{-101, -115, -36, 68, 125, 72, 111, -36, -117}, new byte[]{-7, -28, -80, 45, 34, 61, 28, -71})));
            if (!TextUtils.isEmpty(l2)) {
                com.github.catvod.parser.merge.D0.a.t(com.github.catvod.parser.merge.D0.a.r(c.e(new byte[]{10, 98, -61, 37, -59, 46, 13, -34, 26, 37, -33, 43}, new byte[]{104, 11, -81, 76, -102, 91, 126, -69})), l2.getBytes());
            }
            str = c.e(new byte[]{91, -87, 72, -68, 75, -123, 11, 65, 75, -18, 84, -78}, new byte[]{57, -64, 36, -43, 20, -16, 120, 36});
        }
        return com.github.catvod.parser.merge.D0.a.r(str);
    }

    public static void h(Bili bili) {
        bili.getClass();
        File cache = getCache();
        j = "";
        com.github.catvod.parser.merge.D0.a.t(cache, "".getBytes());
        bili.C();
    }

    public static /* synthetic */ void i(Bili bili) {
        Bili bili2 = bili;
        bili.getClass();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(c.e(new byte[]{74, -59, -5, 87, 0, -10, -11}, new byte[]{24, -96, -99, 50, 114, -109, -121, -124}), c.e(new byte[]{73, -30, -87, 7, 95, -1, 114, 49, 86, -31, -86, 89, 31, -13, 109, 117, 64, -8, -13, 20, 67, -88, 114, 108, 64, -8, -74, 88, 75, -96, 51, 123, 83, -9, -79}, new byte[]{33, -106, -35, 119, 44, -59, 93, 30}));
            Response l2 = C0092h.l(c.e(new byte[]{-18, 111, -123, -91, 95, 84, 40, -36, -25, 107, -104, -5, 91, 11, 101, -35, -75, 45, -63, -66, 77, 0, 41, -112, -23, 118, -34, -93, 29, 65, 117, -110, -24, 112, -50, -74, 77, 26, 58, -62}, new byte[]{-122, 27, -15, -43, 44, 110, 7, -13}), hashMap);
            ArrayList a2 = j.a(l2.body().string());
            l2.body().close();
            l2.close();
            if (bili2.f.c() <= 0) {
                Init.run(new X(bili2, a2, 6));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void j(Bili bili, List list) {
        bili.getClass();
        L.e(new byte[]{116, -1, -102, 118, 125, -93, 2, -50, 74, -11, -101, 80, 124, -90, 0, -123, 94, -28, -49, 98, 125, -88, 6, -114, 92, -7, -49, 106, 125, -92, 10, -109, 23}, new byte[]{45, -112, -17, 3, 9, -63, 103, -32}, new StringBuilder(), list);
        bili.f.b(list);
    }

    public static void k(Bili bili) {
        bili.C();
    }

    public static /* synthetic */ void l(Bili bili, ArrayList arrayList) {
        bili.getClass();
        L.d(new byte[]{106, -70, 62, -93, -122, -93, 89, 31, 84, -80, 63, -123, -121, -90, 91, 84, 64, -95, 107, -81, -99, -76, 72, 68, 81, -80, 107, -65, -122, -92, 81, 66, 9}, new byte[]{51, -43, 75, -42, -14, -63, 60, 49}, new StringBuilder(), arrayList);
        bili.f.b(arrayList);
    }

    public static void m(Bili bili, b bVar) {
        bili.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(c.e(new byte[]{123, -31, -77, 41, 92, 75, 106, -19, 99, -12, -76, 42, 95, 30, 55, -74, 61, -9, -82, 53, 70, 19, 44, -82, 122, -69, -92, 54, 66, 94, 61, -19, 99, -12, -76, 42, 95, 30, 55, -74, 62, -7, -88, 62, 70, 31, 106, -75, 118, -9, -24, 40, 93, 18, 42, -90, 118, -70, -73, 54, 67, 29, 122, -77, 97, -10, -88, 61, 74, 46, 46, -89, 106, -88}, new byte[]{19, -107, -57, 89, 47, 113, 69, -62}));
        sb.append(bVar.k());
        String o = h.b(C0092h.F(I.f(new byte[]{-89, 93, 56, -96, 120, 13, -36, -76, -20, 79, 62, -69, 85, 3, -48, -25, -24}, new byte[]{-127, 46, 87, -43, 10, 110, -71, -119}, sb), w())).a().o();
        if (o.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String append : Uri.parse(o).getQuery().split(c.e(new byte[]{-96}, new byte[]{-122, -107, 64, 62, 34, 90, -44, -78}))) {
                sb2.append(append);
                sb2.append(c.e(new byte[]{-4}, new byte[]{-57, -121, 80, 35, -38, 125, -120, 76}));
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                k kVar = l;
                j = sb3;
                kVar.d(sb3);
                Init.execute(new com.github.catvod.parser.merge.F.j(kVar, getUserCache()));
            } else {
                j = sb3;
            }
            p.b(c.e(new byte[]{22, 38, 44, -101, -34, 117, 111, -124, 78, 100, 39, -64, -68, 125, 44, -12, 108, 32, 65, -26, -25, 17, 41, -109}, new byte[]{-2, -115, -89, 114, 89, -8, -119, 18}));
            bili.C();
        }
    }

    public static /* synthetic */ void n(Bili bili, List list) {
        bili.getClass();
        L.e(new byte[]{77, -22, 31, -20, 34, 95, 40, -84, 115, -32, 30, -54, 35, 90, 42, -25, 103, -15, 74, -16, 39, 84, 52, -21, 52, -20, 30, -4, 59, 78, 119}, new byte[]{20, -123, 106, -103, 86, 61, 77, -126}, new StringBuilder(), list);
        bili.f.b(list);
    }

    public static void o(Bili bili, b bVar) {
        bili.getClass();
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        bili.a = newScheduledThreadPool;
        newScheduledThreadPool.scheduleWithFixedDelay(new D(bili, bVar, 5), 1, 1, TimeUnit.SECONDS);
    }

    static void p(Bili bili) {
        bili.getClass();
        SpiderDebug.log(c.e(new byte[]{-60, 72, -57, 64, -32, -1, 22, -25, -50, 78, -33}, new byte[]{-122, 33, -85, 41, -50, -104, 115, -109}));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j.a(com.github.catvod.parser.merge.c0.k.p(c.e(new byte[]{37, -48, -27, 20, -47, 29, 68, -18, 45, -55, -2, 3, -46, 20, 68, -1, 45, -56}, new byte[]{66, -68, -118, 118, -80, 113, 27, -105}), "")));
        bili.f.a(arrayList);
        Init.execute(new com.github.catvod.parser.merge.B.W(5, bili));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x014d, code lost:
        r6.append(r15);
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0135 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object[] proxy(java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {-77, 74, 47} // fill-array
            r2 = 8
            byte[] r3 = new byte[r2]
            r3 = {-46, 35, 75, 101, 93, 32, -21, -9} // fill-array
            java.lang.String r1 = com.github.catvod.parser.merge.P0.c.e(r1, r3)
            java.lang.Object r1 = r15.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            byte[] r3 = new byte[r0]
            r3 = {88, 0, -81} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {59, 105, -53, 59, -22, -113, -90, -3} // fill-array
            java.lang.String r3 = com.github.catvod.parser.merge.P0.c.e(r3, r4)
            java.lang.Object r3 = r15.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            byte[] r5 = new byte[r4]
            r5 = {98, -46} // fill-array
            byte[] r6 = new byte[r2]
            r6 = {19, -68, 77, 78, -64, -74, 0, 33} // fill-array
            java.lang.String r5 = com.github.catvod.parser.merge.P0.c.e(r5, r6)
            java.lang.Object r5 = r15.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 10
            byte[] r6 = new byte[r6]
            r6 = {-20, -97, -54, -112, -5, 68, -40, -59, -4, -120} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {-104, -19, -85, -2, -120, 27, -69, -86} // fill-array
            java.lang.String r6 = com.github.catvod.parser.merge.P0.c.e(r6, r7)
            java.lang.Object r15 = r15.get(r6)
            java.lang.String r15 = (java.lang.String) r15
            boolean r6 = android.text.TextUtils.isEmpty(r15)
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x0075
            byte[] r6 = new byte[r7]
            r9 = 26
            r6[r8] = r9
            byte[] r9 = new byte[r2]
            r9 = {43, -108, -63, -18, 30, 31, -49, 9} // fill-array
            java.lang.String r6 = com.github.catvod.parser.merge.P0.c.e(r6, r9)
            boolean r15 = r15.equals(r6)
            if (r15 == 0) goto L_0x0075
            r15 = 1
            goto L_0x0076
        L_0x0075:
            r15 = 0
        L_0x0076:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r9 = 47
            byte[] r9 = new byte[r9]
            r9 = {-121, -59, 111, 52, -102, 101, 81, -41, -114, -63, 114, 106, -117, 54, 18, -111, -115, -40, 119, 45, -57, 60, 17, -107, -64, -55, 52, 52, -123, 62, 7, -99, -99, -98, 107, 40, -120, 38, 11, -118, -125, -114, 122, 50, -128, 59, 67} // fill-array
            byte[] r10 = new byte[r2]
            r10 = {-17, -79, 27, 68, -23, 95, 126, -8} // fill-array
            com.github.catvod.parser.merge.B.J.d(r9, r10, r6, r1)
            r1 = 5
            byte[] r9 = new byte[r1]
            r9 = {41, -84, -78, 92, 113} // fill-array
            byte[] r10 = new byte[r2]
            r10 = {15, -49, -37, 56, 76, 31, -122, -35} // fill-array
            com.github.catvod.parser.merge.B.J.d(r9, r10, r6, r3)
            r3 = 4
            byte[] r3 = new byte[r3]
            r3 = {-54, -73, -50, 23} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {-20, -58, -96, 42, 58, 102, -24, -82} // fill-array
            com.github.catvod.parser.merge.B.J.d(r3, r9, r6, r5)
            r3 = 19
            byte[] r3 = new byte[r3]
            r3 = {-47, 99, -122, 51, -56, 39, 37, 77, -57, 49, -48, 99, -49, 36, 109, 11, -100, 56, -39} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {-9, 5, -24, 69, -87, 75, 24, 121} // fill-array
            java.lang.String r3 = com.github.catvod.parser.merge.B.I.f(r3, r9, r6)
            java.util.HashMap r6 = w()
            java.lang.String r3 = com.github.catvod.parser.merge.Z.C0092h.F(r3, r6)
            com.github.catvod.parser.merge.F.h r3 = com.github.catvod.parser.merge.F.h.b(r3)
            com.github.catvod.parser.merge.F.b r3 = r3.a()
            com.github.catvod.parser.merge.F.a r3 = r3.d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.util.List r10 = r3.a()
            java.util.Iterator r10 = r10.iterator()
        L_0x00dc:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0112
            java.lang.Object r11 = r10.next()
            com.github.catvod.parser.merge.F.c r11 = (com.github.catvod.parser.merge.F.c) r11
            java.util.HashMap r12 = v()
            java.util.Set r12 = r12.keySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x00f4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00dc
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = r11.g()
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00f4
            java.lang.String r13 = y(r11, r15)
            r9.append(r13)
            goto L_0x00f4
        L_0x0112:
            java.util.List r10 = r3.d()
            java.util.Iterator r10 = r10.iterator()
        L_0x011a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0135
            java.lang.Object r11 = r10.next()
            com.github.catvod.parser.merge.F.c r11 = (com.github.catvod.parser.merge.F.c) r11
            java.lang.String r12 = r11.g()
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x011a
            java.lang.String r15 = y(r11, r15)
            goto L_0x014d
        L_0x0135:
            java.util.List r5 = r3.d()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0150
            java.util.List r5 = r3.d()
            java.lang.Object r5 = r5.get(r8)
            com.github.catvod.parser.merge.F.c r5 = (com.github.catvod.parser.merge.F.c) r5
            java.lang.String r15 = y(r5, r15)
        L_0x014d:
            r6.append(r15)
        L_0x0150:
            java.lang.String r15 = r6.toString()
            java.lang.String r5 = r9.toString()
            java.util.Locale r6 = java.util.Locale.getDefault()
            r9 = 347(0x15b, float:4.86E-43)
            byte[] r9 = new byte[r9]
            r9 = {-34, -42, 55, -66, 2, 33, 94, -108, -116, -24, 93, -126, 81, 48, 14, -38, -118, -17, 19, -118, 24, 118, 28, -113, -107, -20, 73, -115, 17, 119, 92, -118, -123, -76, 85, -54, 18, 104, 28, -96, -81, -41, 52, -103, 74, 60, 94, -103, -49, -14, 9, -119, 86, 56, 93, -101, -121, -71, 71, -126, 79, 53, 93, -117, -33, -71, 18, -120, 76, 99, 94, -120, -121, -4, 93, -98, 67, 42, 91, -62, -111, -8, 15, -97, 79, 56, 9, -107, -110, -1, 93, -56, 18, 104, 2, -38, -62, -29, 20, -109, 24, 42, 80, -112, -121, -10, 6, -74, 77, 58, 82, -116, -117, -12, 9, -57, 0, 44, 65, -106, -40, -10, 23, -97, 69, 99, 87, -103, -111, -13, 93, -119, 65, 49, 86, -107, -125, -95, 10, -118, 70, 99, 1, -56, -45, -86, 71, -66, 99, 10, 123, -43, -81, -53, 35, -44, 90, 42, 87, -38, -62, -17, 30, -118, 71, 100, 17, -117, -106, -6, 19, -109, 65, 123, 19, -107, -121, -1, 14, -101, 114, 43, 86, -117, -121, -11, 19, -101, 86, 48, 92, -106, -90, -18, 21, -101, 86, 48, 92, -106, -33, -71, 55, -82, 7, 42, 96, -38, -62, -10, 14, -108, 96, 44, 85, -98, -121, -23, 51, -109, 79, 60, 14, -38, -78, -49, 66, -119, 113, 123, 19, -120, -112, -12, 1, -109, 78, 60, 64, -59, -64, -18, 21, -108, 24, 52, 67, -99, -123, -95, 3, -101, 81, 49, 9, -120, -112, -12, 1, -109, 78, 60, 9, -111, -111, -12, 1, -100, 15, 54, 93, -43, -122, -2, 10, -101, 76, 61, 9, -54, -46, -86, 86, -40, 28, 83, 15, -88, -121, -23, 14, -107, 70, 121, 87, -115, -112, -6, 19, -109, 77, 55, 14, -38, -78, -49, 66, -119, 113, 123, 19, -117, -106, -6, 21, -114, 31, 123, 99, -84, -46, -56, 69, -60, 40, 124, 64, -14, -57, -24, 109, -58, 13, 9, 86, -118, -117, -12, 3, -60, 40, 101, 28, -75, -78, -33, 89} // fill-array
            byte[] r10 = new byte[r2]
            r10 = {-30, -101, 103, -6, 34, 89, 51, -8} // fill-array
            java.lang.String r9 = com.github.catvod.parser.merge.P0.c.e(r9, r10)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r10 = r3.b()
            r1[r8] = r10
            java.lang.String r10 = r3.c()
            r1[r7] = r10
            java.lang.String r3 = r3.b()
            r1[r4] = r3
            r1[r0] = r15
            r15 = 4
            r1[r15] = r5
            java.lang.String r15 = java.lang.String.format(r6, r9, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r8] = r1
            r1 = 20
            byte[] r1 = new byte[r1]
            r1 = {-44, 3, 4, -75, -20, -23, 102, -31, -36, 28, 26, -10, -31, -21, 116, -3, -98, 11, 25, -75} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {-75, 115, 116, -39, -123, -118, 7, -107} // fill-array
            java.lang.String r1 = com.github.catvod.parser.merge.P0.c.e(r1, r2)
            r0[r7] = r1
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            byte[] r15 = r15.getBytes()
            r1.<init>(r15)
            r0[r4] = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Bili.proxy(java.util.Map):java.lang.Object[]");
    }

    static void q(Bili bili, String str) {
        a aVar = bili.f;
        if (aVar != null) {
            aVar.clear();
        }
        K.e(new byte[]{3, -69, 22, -71, 0, 20, 3, -56, 18, -89, 29, -73, 75, 0, 18, -122}, new byte[]{65, -46, 122, -48, 46, 115, 102, -68}, new StringBuilder(), str);
        try {
            Init.execute(new C0028b(bili, str, 6));
            Init.execute(new z1(bili, str, 3));
            Init.execute(new m(bili, str, 4));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void t() {
        b a2 = h.b(C0092h.F(c.e(new byte[]{-63, -55, -79, 19, -42, -44, 31, -123, -56, -51, -84, 77, -57, -121, 92, -61, -53, -44, -87, 10, -117, -115, 95, -57, -122, -59, -22, 20, -64, -116, 29, -61, -57, -55, -96, 17, -61, -113, 83, -49, -122, -45, -92, 21}, new byte[]{-87, -67, -59, 99, -91, -18, 48, -86}), w())).a();
        this.c = a2.q();
        this.d = a2.r();
        this.e = a2.p();
        if (!this.c && !m) {
            m = true;
            Init.run(new X(this, h.b(C0092h.D(c.e(new byte[]{-23, -4, -116, 110, -75, 66, 89, 61, -15, -23, -117, 109, -74, 23, 4, 102, -81, -22, -111, 114, -81, 26, 31, 126, -24, -90, -101, 113, -85, 87, 14, 61, -15, -23, -117, 109, -74, 23, 4, 102, -84, -28, -105, 121, -81, 22, 89, 101, -28, -22, -41, 111, -76, 27, 25, 118, -28, -89, -97, 123, -88, 29, 4, 115, -11, -19, -57, 109, -87, 13, 4, 113, -28, -75, -107, Byte.MAX_VALUE, -81, 22, 91, Byte.MAX_VALUE, -24, -26, -111}, new byte[]{-127, -120, -8, 30, -58, 120, 118, 18}))).a(), 5));
        }
    }

    private static String u(com.github.catvod.parser.merge.F.c cVar, String str, boolean z) {
        String str2 = cVar.g() + c.e(new byte[]{-51}, new byte[]{-110, 36, -95, 1, -48, 12, 63, 123}) + cVar.c();
        String str3 = cVar.h().split(c.e(new byte[]{8}, new byte[]{39, -96, 53, -54, 84, -51, -26, 7}))[0];
        String b2 = cVar.b();
        if (z) {
            b2 = e.I(b2, 1, (String) null, 0, false);
        }
        return String.format(Locale.getDefault(), c.e(new byte[]{-98, 10, -60, -111, 46, 11, -93, 9, -53, 36, -50, -93, 59, 11, -4, 119, -98, 8, -49, -98, 42, 26, -84, 9, -31, 36, -51, Byte.MIN_VALUE, 49, 17, -89, 19, -42, 107, -61, -97, 48, 11, -89, 19, -42, 31, -39, Byte.MIN_VALUE, 59, 66, -32, 88, -47, 105, -113, -50, 84, 67, -112, 24, -46, 57, -59, -125, 59, 17, -74, 28, -42, 34, -49, -98, 126, 22, -90, 64, Byte.MIN_VALUE, 110, -45, -46, 126, 29, -93, 19, -58, 60, -55, -108, 42, 23, -1, 95, -121, 56, -126, -48, 61, 16, -90, 24, -63, 56, -99, -46, 123, 12, -32, 93, -49, 34, -51, -107, 10, 6, -78, 24, -97, 105, -123, -125, 124, 95, -25, 14, -126, 56, -44, -111, 44, 11, -107, 20, -42, 35, -13, -79, 14, 66, -32, 88, -47, 105, -98, -6, 98, 61, -93, 14, -57, 30, -14, -68, 96, 90, -79, 65, -115, 9, -63, -125, 59, 42, -112, 49, -100, 65, -100, -93, 59, 24, -81, 24, -52, 63, -30, -111, 45, 26, -30, 20, -52, 47, -59, -120, 12, 30, -84, 26, -57, 118, -126, -43, 45, 93, -4, 119, -98, 2, -50, -103, 42, 22, -93, 17, -53, 49, -63, -124, 55, 16, -84, 93, -48, 42, -50, -105, 59, 66, -32, 88, -47, 105, -113, -50, 84, 67, -19, 46, -57, 44, -51, -107, 48, 11, Byte.MIN_VALUE, 28, -47, 46, -98, -6, 98, 80, -112, 24, -46, 57, -59, -125, 59, 17, -74, 28, -42, 34, -49, -98, 96, 117, -2, 82, -29, 47, -63, Byte.MIN_VALUE, 42, 30, -74, 20, -51, 37, -13, -107, 42, 65}, new byte[]{-94, 75, -96, -16, 94, Byte.MAX_VALUE, -62, 125}), new Object[]{str3, str2, cVar.a(), cVar.d(), cVar.h(), str, cVar.k(), b2.replace(c.e(new byte[]{116}, new byte[]{82, 87, -88, -64, 52, -100, -53, -120}), c.e(new byte[]{50, 31, 117, 25, 2}, new byte[]{20, 126, 24, 105, 57, 62, 101, -113})), cVar.j().a(), cVar.j().b()});
    }

    private static HashMap<String, String> v() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(c.e(new byte[]{0, -55, -54, 8, -8}, new byte[]{51, -7, -8, 48, -56, -102, 74, 36}), c.e(new byte[]{74, -20, -19, -32, -126, -9}, new byte[]{123, -43, -33, -48, -78, -57, -25, 57}));
        hashMap.put(c.e(new byte[]{-3, -21, 97, 77, 8}, new byte[]{-50, -37, 83, 126, 58, 55, 74, 89}), c.e(new byte[]{63, -12, 36, 58, -63, 73}, new byte[]{14, -57, 22, 10, -15, 121, 81, 5}));
        hashMap.put(c.e(new byte[]{107, -40, 36, -54, -65}, new byte[]{88, -24, 22, -5, -119, -28, 53, 33}), c.e(new byte[]{-104, -118, 42, 119, 57}, new byte[]{-82, -66, 26, 71, 9, -107, 78, 93}));
        return hashMap;
    }

    private static HashMap w() {
        HashMap hashMap = new HashMap();
        String e2 = c.e(new byte[]{9, -99, -86, 114, 50, -102, -103, 105, 50, -102}, new byte[]{92, -18, -49, 0, 31, -37, -2, 12});
        byte[] bArr = new byte[Token.DEC];
        // fill-array-data instruction
        bArr[0] = 31;
        bArr[1] = -81;
        bArr[2] = -51;
        bArr[3] = -63;
        bArr[4] = 36;
        bArr[5] = -101;
        bArr[6] = 1;
        bArr[7] = 14;
        bArr[8] = 103;
        bArr[9] = -18;
        bArr[10] = -121;
        bArr[11] = -120;
        bArr[12] = 96;
        bArr[13] = -96;
        bArr[14] = 9;
        bArr[15] = 79;
        bArr[16] = 54;
        bArr[17] = -81;
        bArr[18] = -64;
        bArr[19] = -37;
        bArr[20] = 104;
        bArr[21] = -71;
        bArr[22] = 52;
        bArr[23] = 1;
        bArr[24] = 99;
        bArr[25] = -16;
        bArr[26] = -103;
        bArr[27] = -104;
        bArr[28] = 115;
        bArr[29] = -41;
        bArr[30] = 55;
        bArr[31] = 72;
        bArr[32] = 60;
        bArr[33] = -10;
        bArr[34] = -125;
        bArr[35] = -109;
        bArr[36] = 104;
        bArr[37] = -113;
        bArr[38] = 86;
        bArr[39] = 21;
        bArr[40] = 123;
        bArr[41] = -32;
        bArr[42] = -10;
        bArr[43] = -40;
        bArr[44] = 56;
        bArr[45] = -101;
        bArr[46] = 5;
        bArr[47] = 118;
        bArr[48] = 55;
        bArr[49] = -94;
        bArr[50] = -4;
        bArr[51] = -63;
        bArr[52] = 60;
        bArr[53] = -40;
        bArr[54] = 85;
        bArr[55] = 18;
        bArr[56] = 101;
        bArr[57] = -18;
        bArr[58] = -124;
        bArr[59] = -98;
        bArr[60] = 104;
        bArr[61] = -33;
        bArr[62] = 43;
        bArr[63] = 105;
        bArr[64] = 6;
        bArr[65] = -115;
        bArr[66] = -5;
        bArr[67] = -124;
        bArr[68] = 104;
        bArr[69] = -101;
        bArr[70] = 9;
        bArr[71] = 74;
        bArr[72] = 55;
        bArr[73] = -32;
        bArr[74] = -16;
        bArr[75] = -51;
        bArr[76] = 43;
        bArr[77] = -100;
        bArr[78] = 15;
        bArr[79] = 8;
        bArr[80] = 114;
        bArr[81] = -125;
        bArr[82] = -33;
        bArr[83] = -38;
        bArr[84] = 39;
        bArr[85] = -102;
        bArr[86] = 5;
        bArr[87] = 14;
        bArr[88] = 99;
        bArr[89] = -13;
        bArr[90] = -113;
        bArr[91] = -122;
        bArr[92] = 120;
        bArr[93] = -39;
        bArr[94] = 80;
        bArr[95] = 15;
        bArr[96] = 98;
        bArr[97] = -32;
        bArr[98] = -28;
        bArr[99] = -55;
        bArr[100] = 46;
        bArr[101] = -106;
        bArr[102] = 18;
        bArr[103] = 72;
        bArr[104] = 125;
        bArr[105] = -11;
        bArr[106] = -124;
        bArr[107] = -97;
        bArr[108] = 102;
        bArr[109] = -60;
        bArr[110] = 86;
        hashMap.put(e2, c.e(bArr, new byte[]{82, -64, -73, -88, 72, -9, 96, 33}));
        hashMap.put(c.e(new byte[]{-31, -12, -107, -1, 88, -3, 110}, new byte[]{-77, -111, -13, -102, 42, -104, 28, 78}), c.e(new byte[]{-2, 7, 91, -92, 39, -26, 123, 117, -31, 4, 88, -6, 54, -75, 56, 51, -12, 26, 67, -67, 122, -65, 59, 55}, new byte[]{-106, 115, 47, -44, 84, -36, 84, 90}));
        if (j != null) {
            hashMap.put(c.e(new byte[]{90, -67, 7, 123, 104, 59}, new byte[]{57, -46, 104, 16, 1, 94, -31, -75}), j);
        }
        return hashMap;
    }

    private static Intent x(String str, b bVar) {
        Intent intent = new Intent(c.e(new byte[]{122, 90, 113, 67, 33, -88, -75, 42, 114, 90, 97, 84, 32, -75, -1, 101, 120, 64, 124, 94, 32, -17, -121, 77, 94, 99}, new byte[]{27, 52, 21, 49, 78, -63, -47, 4}));
        intent.setClassName(str, c.e(new byte[]{50, 85, -125, -63, 50, -76, 45, 33, 45, 86, -125, -57, 58, -74, 41, 110, 51, 74, -125, -52, 61, -82, 37, 46, 50, 13, -28, -53, 39, -65, 46, 52, 14, 66, -61, -63, 63, -65, 50, 1, 37, 87, -60, -45, 58, -82, 57}, new byte[]{70, 35, -83, -91, 83, -38, 64, 64}));
        intent.setData(Uri.parse(bVar.o()));
        return intent;
    }

    private static String y(com.github.catvod.parser.merge.F.c cVar, boolean z) {
        String format;
        if (cVar.h().startsWith(c.e(new byte[]{67, -83, -76, -54, -27}, new byte[]{53, -60, -48, -81, -118, 14, -39, 85}))) {
            format = String.format(Locale.getDefault(), c.e(new byte[]{-85, -24, 76, -1, -96, -19, 114, 47, -26, -2, 2, -72, -65, -16, 43, 124, -85, -80, 2, -67, -69, -66, 111, 110, -79, -20, 72, -3, -102, -8, 59, 109, -2, -86, 0, -21, -17, -71, 60, 105, -79, -80, 2, -67, -69, -66}, new byte[]{-61, -115, 37, -104, -56, -103, 79, 8}), new Object[]{cVar.f(), cVar.l(), cVar.e(), cVar.i()});
        } else if (!cVar.h().startsWith(c.e(new byte[]{-39, -99, 96, -96, 67}, new byte[]{-72, -24, 4, -55, 44, -22, -99, -123}))) {
            return "";
        } else {
            format = String.format(c.e(new byte[]{-72, -88, 23, -24, -99, -89, 2, 1, -77, -79, 9, -106, -46, -12, 75, 79, -91, -68, 23, -37, -103, -93, 62, 14, -94, -72, 71, -116, -48, -75, 75}, new byte[]{-42, -35, 122, -85, -11, -58, 108, 111}), new Object[]{v().get(cVar.g())});
        }
        return u(cVar, format, z);
    }

    /* access modifiers changed from: private */
    public void z(String str, String str2, HashMap hashMap) {
        dismiss();
        com.github.catvod.parser.merge.c0.k.x(str2, c.e(new byte[]{113, -99, -88, 52, 117, -76, -82}, new byte[]{22, -15, -57, 86, 20, -40, -15, 3}) + str);
        if (hashMap != null) {
            hashMap.put(c.e(new byte[]{-72, -39, 65, -86, 68, 1}, new byte[]{-53, -68, 32, -40, 39, 105, 85, -40}), str2);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        if (str.equals(c.e(new byte[]{20, 51, -49, 10, 87, -95, 93, 121, 22}, new byte[]{94, 114, -99, 89, 18, -32, 15, 58}))) {
            if (Integer.parseInt(str2) > 1) {
                return "";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new z(c.e(new byte[]{-89, -39, 25, -90, 53, 7, 126, 60, -91, -34, 4, -71, 52, 3, 126}, new byte[]{-19, -104, 75, -11, 112, 70, 44, Byte.MAX_VALUE}), c.e(new byte[]{-15, 25, -114, 86, 20, -115, 37, 2, -118, 85, -93, 17}, new byte[]{22, -78, 23, -77, -110, 8, -61, -110}), "", c.e(new byte[]{30, -68, -40, -39, -101, -120, 11, -67, 79, -30, -61, -102, -31, -107, Byte.MAX_VALUE, -24, 122, -78, -93, -110, -97}, new byte[]{-9, 7, 70, 63, 8, 2, -29, 1}), true));
            return m.A(arrayList);
        } else if (str.startsWith(c.e(new byte[]{24, -9, 1, -106, -43, 8, -1, -38, 26, -16, 28, -119, -44, 12, -1}, new byte[]{82, -74, 83, -59, -112, 73, -83, -103}))) {
            if (Integer.parseInt(str2) <= 1) {
                HashMap hashMap2 = new HashMap();
                Init.execute(new C(this, hashMap2, 4));
                for (int i2 = 1200; i2 > 0 && hashMap2.isEmpty(); i2--) {
                    SystemClock.sleep(100);
                }
                if (hashMap2.isEmpty()) {
                    return new Random().nextInt(999999) + "";
                }
                this.h = (String) hashMap2.get(c.e(new byte[]{27, 89, -22, -19, 96, -13}, new byte[]{104, 60, -117, -97, 3, -101, -39, 14}));
            }
            return categoryContent(this.h, c.e(new byte[]{-122}, new byte[]{-73, 0, -105, -38, 30, -90, -109, -28}), true, new HashMap());
        } else if (str.endsWith(c.e(new byte[]{-110, 114, 102, -71, 111}, new byte[]{-67, 9, 22, -34, 18, -108, -4, 113}))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(c.e(new byte[]{112, -119, 51}, new byte[]{29, -32, 87, 76, -1, 124, -60, 18}), str.split(c.e(new byte[]{-99}, new byte[]{-78, -28, -77, -45, -30, 102, 94, -29}))[0]);
            linkedHashMap.put(c.e(new byte[]{-28, 88}, new byte[]{-108, 54, 12, 5, -13, 99, -96, -96}), str2);
            ArrayList arrayList2 = new ArrayList();
            for (g b2 : g.a(h.b(C0092h.F(c.e(new byte[]{113, 26, -52, -34, 62, 61, 31, 50, 120, 30, -47, Byte.MIN_VALUE, 47, 110, 92, 116, 123, 7, -44, -57, 99, 100, 95, 112, 54, 22, -105, -35, 61, 102, 83, 120, 54, 25, -38, -57, 98, 102, 66, 126, 54, 29, -35, -49, 63, 100, 88, 34}, new byte[]{25, 110, -72, -82, 77, 7, 48, 29}) + this.e.a(linkedHashMap), w())).a().g().getAsJsonObject().get(c.e(new byte[]{-85, 5, 91, -123, 14}, new byte[]{-35, 105, 50, -10, 122, 4, 105, -53})))) {
                arrayList2.add(b2.b());
            }
            return m.A(arrayList2);
        } else {
            if (hashMap.containsKey(c.e(new byte[]{-11, -97, -70, -8, 9}, new byte[]{-102, -19, -34, -99, 123, -112, 28, -124}))) {
                str3 = hashMap.get(c.e(new byte[]{-116, 61, 115, 19, 81}, new byte[]{-29, 79, 23, 118, 35, -28, -88, -1}));
            } else {
                str3 = c.e(new byte[]{-25, 95, 52, 38, 88, 42, 96, -73, -8}, new byte[]{-109, 48, 64, 71, 52, 88, 1, -39});
            }
            if (hashMap.containsKey(c.e(new byte[]{-76, 51, -91, -56, 70, -95, 79, -73}, new byte[]{-48, 70, -41, -87, 50, -56, 32, -39}))) {
                str4 = hashMap.get(c.e(new byte[]{124, -45, -126, -124, -125, -40, 85, 118}, new byte[]{24, -90, -16, -27, -9, -79, 58, 24}));
            } else {
                str4 = c.e(new byte[]{84}, new byte[]{100, -115, 115, -61, 26, 65, -79, 65});
            }
            if (hashMap.containsKey(c.e(new byte[]{85, -73, -20}, new byte[]{33, -34, -120, 95, 59, -61, 27, 101}))) {
                StringBuilder e2 = G.e(str, " ");
                e2.append(hashMap.get(c.e(new byte[]{-99, 29, 58}, new byte[]{-23, 116, 94, -114, -79, 112, -57, -39})));
                str = e2.toString();
            }
            StringBuilder sb = new StringBuilder();
            G.h(new byte[]{16, -101, -78, -24, 36, -28, 47, -19, 25, -97, -81, -74, 53, -73, 108, -85, 26, -122, -86, -15, 121, -67, 111, -81, 87, -105, -23, -17, 50, -68, 45, -85, 22, -101, -93, -22, 49, -65, 99, -89, 87, -100, -93, -7, 37, -67, 104, -19, 12, -106, -74, -3, 104, -83, 101, -93, 10, -116, -82, -57, 35, -89, 112, -89, 69, -103, -81, -4, 50, -79, 38, -87, 29, -106, -79, -9, 37, -70, 61}, new byte[]{120, -17, -58, -104, 87, -34, 0, -62}, sb, str);
            J.d(new byte[]{95, 91, -85, -23, -51, 49, -125}, new byte[]{121, 52, -39, -115, -88, 67, -66, 64}, sb, str3);
            J.d(new byte[]{80, -65, 29, -105, -6, 34, -125, -30, 24, -26}, new byte[]{118, -37, 104, -27, -101, 86, -22, -115}, sb, str4);
            h b3 = h.b(C0092h.F(H.c(new byte[]{1, 22, -84, 88, 3, 66}, new byte[]{39, 102, -51, 63, 102, Byte.MAX_VALUE, 93, 43}, sb, str2), w()));
            ArrayList arrayList3 = new ArrayList();
            for (g b4 : g.a(b3.a().l())) {
                arrayList3.add(b4.b());
            }
            return m.A(arrayList3);
        }
    }

    public String detailContent(List<String> list) {
        if (!this.c) {
            t();
        }
        String[] split = list.get(0).split(c.e(new byte[]{-121}, new byte[]{-57, -22, -101, 58, 36, -102, 95, 26}));
        String str = split[0];
        String str2 = split[1];
        b a2 = h.b(C0092h.F(H.c(new byte[]{90, 75, -118, 3, 114, 55, 55, -35, 83, 79, -105, 93, 99, 100, 116, -101, 80, 86, -110, 26, 47, 110, 119, -97, 29, 71, -47, 4, 100, 111, 53, -101, 92, 75, -101, 1, 103, 108, 123, -105, 29, 73, -105, 22, 118, 50, 121, -101, 86, 2}, new byte[]{50, 63, -2, 115, 1, 13, 24, -14}, new StringBuilder(), str2), w())).a();
        z zVar = new z();
        zVar.l(list.get(0));
        zVar.n(a2.j());
        zVar.m(a2.m());
        zVar.g(a2.n());
        zVar.j(a2.e());
        zVar.k(a2.h().a());
        zVar.q((a2.f().longValue() / 60) + c.e(new byte[]{14, -47, -107, 9, 59, 62}, new byte[]{-21, 89, 19, -32, -85, -90, 90, 57}));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        J.d(new byte[]{6, -5, -70, -90, 56, -115, 65, -2, 15, -1, -89, -8, 41, -34, 2, -72, 12, -26, -94, -65, 101, -44, 1, -68, 65, -9, -31, -90, 39, -42, 23, -76, 28, -96, -66, -70, 42, -50, 27, -93, 2, -80, -81, -96, 34, -45, 83}, new byte[]{110, -113, -50, -42, 75, -73, 110, -47}, sb, str2);
        sb.append(c.e(new byte[]{7, 17, -126, -67, 44}, new byte[]{33, 114, -21, -39, 17, 34, -105, -68}));
        sb.append(a2.c());
        b a3 = h.b(C0092h.F(I.f(new byte[]{-33, -73, 116, -22, 45, -20, -77, 107, -97, -88, 108, -74, 112, -29, -80, 125, -51, -2, 60, -79, 115, -85, -10, 38, -60, -9}, new byte[]{-7, -58, 26, -41, 28, -34, -124, 77}, sb), w())).a();
        for (int i2 = 0; i2 < a3.b().size(); i2++) {
            int intValue = a3.b().get(i2).intValue();
            if ((this.c || intValue <= 32) && (this.d || intValue <= 80)) {
                arrayList2.add(a3.b().get(i2));
                arrayList.add(a3.a().get(i2));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.github.catvod.parser.merge.F.e next : a2.i()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(next.b());
            J.d(new byte[]{120}, new byte[]{92, 111, 71, -6, -120, 86, 93, -75}, sb2, str2);
            sb2.append(c.e(new byte[]{-126}, new byte[]{-87, -53, -54, 92, -113, -92, -70, 52}));
            sb2.append(next.a());
            sb2.append(c.e(new byte[]{114}, new byte[]{89, 75, -65, -93, 1, -109, -86, 28}));
            sb2.append(TextUtils.join(c.e(new byte[]{3}, new byte[]{57, -106, -6, 118, -106, -122, -1, 28}), arrayList2));
            sb2.append(c.e(new byte[]{48}, new byte[]{27, 54, 21, -44, -14, -124, 94, 28}));
            sb2.append(TextUtils.join(c.e(new byte[]{105}, new byte[]{83, -5, -102, 102, 26, 101, 85, 106}), arrayList));
            arrayList3.add(sb2.toString());
        }
        ArrayList arrayList4 = new ArrayList();
        int i3 = 4;
        JsonArray asJsonArray = c.x(C0092h.F(H.c(new byte[]{5, 54, -97, 118, 95, -36, 123, -65, 12, 50, -126, 40, 78, -113, 56, -7, 15, 43, -121, 111, 2, -123, 59, -3, 66, 58, -60, 113, 73, -124, 121, -7, 3, 54, -114, 116, 74, -121, 55, -11, 66, 35, -103, 101, 68, -113, 34, -11, 66, 48, -114, 106, 77, -110, 49, -12, 82, 32, -99, 111, 72, -37}, new byte[]{109, 66, -21, 6, 44, -26, 84, -112}, new StringBuilder(), str), w())).getAsJsonObject().getAsJsonArray(c.e(new byte[]{-23, 37, -96, -70}, new byte[]{-115, 68, -44, -37, 57, 18, -123, 67}));
        int i4 = 0;
        while (i4 < asJsonArray.size()) {
            JsonObject asJsonObject = asJsonArray.get(i4).getAsJsonObject();
            arrayList3.add(asJsonObject.get(c.e(new byte[]{-79, 54, 88, -7, -75}, new byte[]{-59, 95, 44, -107, -48, 113, 14, 90})).getAsString() + c.e(new byte[]{-84}, new byte[]{-120, 116, -56, 112, 69, 89, 6, 24}) + asJsonObject.get(c.e(new byte[]{-29, 58, 90}, new byte[]{-126, 83, 62, 97, 11, 36, -19, -32})).getAsBigInteger() + c.e(new byte[]{-52}, new byte[]{-25, 106, -7, -115, 21, -125, 27, 27}) + asJsonObject.get(c.e(new byte[]{25, 86, -37}, new byte[]{122, 63, -65, -82, 68, 17, 79, 67})).getAsBigInteger() + c.e(new byte[]{-77}, new byte[]{-104, -39, -127, 56, 50, -47, 68, -80}) + TextUtils.join(c.e(new byte[]{83}, new byte[]{105, -32, -40, 64, -12, 56, 71, -38}), arrayList2) + c.e(new byte[]{-65}, new byte[]{-108, 60, -1, 40, 12, 88, -87, 17}) + TextUtils.join(c.e(new byte[]{-44}, new byte[]{-18, -98, 80, -21, 108, -74, 100, -105}), arrayList));
            arrayList4.add(asJsonObject.get(c.e(new byte[]{-3, 89, -115, 54, -120}, new byte[]{-119, 48, -7, 90, -19, -48, 16, -71})).getAsString() + c.e(new byte[]{-80}, new byte[]{-108, -13, 82, 54, 123, -59, -108, -127}) + asJsonObject.get(c.e(new byte[]{-104, -78, -87}, new byte[]{-7, -37, -51, 119, -84, 103, 11, 1})).getAsBigInteger() + c.e(new byte[]{99}, new byte[]{72, 74, 7, -102, 46, 50, -86, 61}) + asJsonObject.get(c.e(new byte[]{-99, 29, -25}, new byte[]{-2, 116, -125, -71, 103, -76, 44, -52})).getAsBigInteger() + c.e(new byte[]{-103}, new byte[]{-78, 24, 90, 98, -80, 68, -107, Byte.MIN_VALUE}) + TextUtils.join(c.e(new byte[]{65}, new byte[]{123, -120, 73, -24, 62, 5, 46, -5}), arrayList2) + c.e(new byte[]{-46}, new byte[]{-7, 73, 26, 45, -71, 114, 42, -3}) + TextUtils.join(c.e(new byte[]{-80}, new byte[]{-118, -32, 113, -96, 47, 68, 93, 48}), arrayList));
            i4++;
            i3 = 4;
        }
        byte[] bArr = new byte[i3];
        // fill-array-data instruction
        bArr[0] = 47;
        bArr[1] = -103;
        bArr[2] = -120;
        bArr[3] = 17;
        linkedHashMap.put(c.e(bArr, new byte[]{109, 126, 35, -120, 64, -18, -10, 93}), TextUtils.join(c.e(new byte[]{-54}, new byte[]{-23, -6, 48, -121, -52, 54, 99, 8}), arrayList3));
        linkedHashMap.put(c.e(new byte[]{-121, 83, 102, 98, 76, -19}, new byte[]{96, -56, -34, -121, -55, 94, 67, 51}), TextUtils.join(c.e(new byte[]{-117}, new byte[]{-88, -89, -19, -115, -52, 67, -23, -76}), arrayList4));
        linkedHashMap.put(c.e(new byte[]{-116, -85, -32, -122, -93, -11, -9, 44, 38, -8, -29, -6, 47, -126, -115, 35, 116}, new byte[]{-50, 76, 75, 31, -115, 28, 104, -97}), TextUtils.join(c.e(new byte[]{-85}, new byte[]{-120, 5, -35, 13, 69, -2, 61, -8}), arrayList3));
        linkedHashMap.put(c.e(new byte[]{64, -10, 126, -123, 19, -74, -89, 24, -22, -91, 125, -7, -97, -63, -35, 23, -72, 57, 48, -78, -79, -71, -83, 31, -22, -84, 121, -5, -99, -34, 17}, new byte[]{2, 17, -43, 28, 61, 95, 56, -85}), TextUtils.join(c.e(new byte[]{77}, new byte[]{110, -19, -93, 84, -100, Byte.MAX_VALUE, -110, -36}), arrayList3));
        zVar.o(TextUtils.join(c.e(new byte[]{-62, -14, 98}, new byte[]{-26, -42, 70, 33, -127, 99, 33, 59}), linkedHashMap.keySet()));
        zVar.p(TextUtils.join(c.e(new byte[]{67, -2, -114}, new byte[]{103, -38, -86, -78, -119, 67, -94, -49}), linkedHashMap.values()));
        return m.t(zVar);
    }

    public void dismiss() {
        try {
            AlertDialog alertDialog = k;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            k = null;
            this.g = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String homeContent(boolean z) {
        if (this.b.has(c.e(new byte[]{76, 126, 19, -36}, new byte[]{38, 13, 124, -78, 97, -84, -43, 43}))) {
            return C0092h.D(this.b.get(c.e(new byte[]{87, 86, 19, 1}, new byte[]{61, 37, 124, 111, 55, 99, 34, -109})).getAsString());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0081b(c.e(new byte[]{-63, 113, -90, 50, 74, 87, 70, -67, -61}, new byte[]{-117, 48, -12, 97, 15, 22, 20, -2}), c.e(new byte[]{37, -70, 93, 81, 88, -9, -78, 20, 94, -10, 112, 22}, new byte[]{-62, 17, -60, -76, -34, 114, 84, -124})));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = I.c(new byte[]{-103, -71, 50, 113}, new byte[]{-19, -64, 66, 20, -58, 112, 83, -92}, this.b).split(c.e(new byte[]{32}, new byte[]{3, 88, 12, 126, 58, -50, -53, 75}));
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            String str = split[i2];
            arrayList.add(new C0081b(str));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new com.github.catvod.parser.merge.C.h(c.e(new byte[]{-58, -92, 40, -105, 79}, new byte[]{-87, -42, 76, -14, 61, -32, -25, -23}), c.e(new byte[]{82, -71, 46, -109, 85, 108}, new byte[]{-76, 55, -68, 118, -17, -29, 39, 29}), Arrays.asList(new com.github.catvod.parser.merge.C.g[]{new com.github.catvod.parser.merge.C.g(c.e(new byte[]{82, -62, 81, -36, -102, -86}, new byte[]{-69, 98, -63, 52, 50, 7, -40, -69}), c.e(new byte[]{-8, -49, 62, 6, -21, 110, -75, 3, -25}, new byte[]{-116, -96, 74, 103, -121, 28, -44, 109})), new com.github.catvod.parser.merge.C.g(c.e(new byte[]{123, 62, 60, 12, 65, -116, 25, -87, 3, 68, 47, 99}, new byte[]{-99, -94, -68, -23, -27, 22, -16, 18}), c.e(new byte[]{-101, 83, 16, 69, 48}, new byte[]{-8, 63, 121, 38, 91, 35, 71, 123})), new com.github.catvod.parser.merge.C.g(c.e(new byte[]{119, -37, -1, -69, 23, 75, -89, -110, 45, -94, -57, -34}, new byte[]{-111, 71, Byte.MAX_VALUE, 93, -127, -5, 64, 11}), c.e(new byte[]{-73, 27, -88, -55, -102, -22, -36}, new byte[]{-57, 110, -54, -83, -5, -98, -71, -66})), new com.github.catvod.parser.merge.C.g(c.e(new byte[]{-97, 35, -96, 123, -45, 62, -99, -36, -15, 90, -103, 11}, new byte[]{121, -65, 32, -98, 119, -92, 120, 97}), c.e(new byte[]{35, -73}, new byte[]{71, -38, -90, -38, 12, 0, 80, -13})), new com.github.catvod.parser.merge.C.g(c.e(new byte[]{-35, 29, -30, Byte.MIN_VALUE, 95, 61, -123, 78, -115, 105, -11, -22}, new byte[]{59, -127, 98, 101, -5, -89, 99, -38}), c.e(new byte[]{-1, -82, 68, 22}, new byte[]{-116, -38, 43, 97, -88, 41, 92, -106}))})));
            arrayList2.add(new com.github.catvod.parser.merge.C.h(c.e(new byte[]{-94, -78, 23, -107, 82, -41, -77, 9}, new byte[]{-58, -57, 101, -12, 38, -66, -36, 103}), c.e(new byte[]{102, -7, -12, 124, 100, 110}, new byte[]{Byte.MIN_VALUE, 96, 118, -107, -15, -39, 76, -29}), Arrays.asList(new com.github.catvod.parser.merge.C.g[]{new com.github.catvod.parser.merge.C.g(c.e(new byte[]{97, 62, -23, -28, -57, 43, 110, -86, 6, 82, -44, -70}, new byte[]{-124, -69, 65, 13, 68, -125, -120, 51}), c.e(new byte[]{-55}, new byte[]{-7, 120, 106, 99, 4, 85, -123, -84})), new com.github.catvod.parser.merge.C.g(c.e(new byte[]{-16, 13, -35, -59, -12, 27, -36, -56, 34, -122, -99, -87, -54, 120}, new byte[]{-58, 61, 56, 77, 114, -14, 76, 80}), c.e(new byte[]{-78}, new byte[]{-122, 113, 61, 74, -56, 89, 18, -18})), new com.github.catvod.parser.merge.C.g(c.e(new byte[]{91, -42, -16, -15, 38, 108, -96, 101, -127, 118, 22}, new byte[]{104, -26, -114, -57, 22, -119, 40, -29}), c.e(new byte[]{-104}, new byte[]{-85, -61, 31, -104, 23, 12, -117, -18})), new com.github.catvod.parser.merge.C.g(c.e(new byte[]{92, -53, -20, -21, -7, 31, -125, 43, -124, 107, 10}, new byte[]{109, -5, -110, -40, -55, -6, 11, -83}), c.e(new byte[]{40}, new byte[]{26, 93, -11, 35, 9, -20, 46, 49})), new com.github.catvod.parser.merge.C.g(c.e(new byte[]{-100, -13, -112, 46, 82, -87, -47, 9, 73, 120, -48, 66, 108, -53}, new byte[]{-83, -61, 117, -90, -44, 64, 65, -111}), c.e(new byte[]{-110}, new byte[]{-93, -114, -9, -89, 73, -119, -62, -7}))})));
            linkedHashMap.put(str, arrayList2);
            i2++;
        }
        return m.x(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        String F = C0092h.F(c.e(new byte[]{12, 111, -78, 123, -95, -55, -70, 94, 5, 107, -81, 37, -80, -102, -7, 24, 6, 114, -86, 98, -4, -112, -6, 28, 75, 99, -23, 124, -73, -111, -72, 24, 10, 111, -93, 121, -76, -110, -10, 20, 75, 107, -87, 123, -89, -97, -12, 3, 91, 107, -75, 54, -32, -61}, new byte[]{100, 27, -58, 11, -46, -13, -107, 113}), w());
        SpiderDebug.log(c.e(new byte[]{-22, 44, -64, 18, -57, 9, 61, -90, -51, 19, -59, 31, -116, 14, 17, -92, -58, 49, -55, 21, -99, 65, 56, -72, -57, 43, -106}, new byte[]{-88, 69, -84, 123, -23, 97, 82, -53}) + F);
        h b2 = h.b(F);
        ArrayList arrayList = new ArrayList();
        for (g b3 : g.a(b2.a().g())) {
            arrayList.add(b3.b());
        }
        return m.A(arrayList);
    }

    public void init(android.content.Context context, String str) {
        this.b = c.y(str);
        if (l == null) {
            l = k.c(com.github.catvod.parser.merge.D0.a.l(getUserCache()));
        }
        if (l.b().isEmpty()) {
            String l2 = com.github.catvod.parser.merge.D0.a.l(getCache());
            if (!TextUtils.isEmpty(l2)) {
                k kVar = l;
                j = l2;
                kVar.d(l2);
                Init.execute(new com.github.catvod.parser.merge.F.j(kVar, getUserCache()));
            }
        }
        String c2 = I.c(new byte[]{104, -29, 6, Byte.MIN_VALUE, 47, -66}, new byte[]{11, -116, 105, -21, 70, -37, -64, 78}, this.b);
        j = c2;
        if (c2.startsWith(c.e(new byte[]{-42, 21, -1, 101}, new byte[]{-66, 97, -117, 21, 66, -85, -40, 67}))) {
            j = C0092h.D(j).trim();
        }
        if (TextUtils.isEmpty(j)) {
            j = l.b();
        }
        if (TextUtils.isEmpty(j)) {
            j = i;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        String str4 = str;
        com.github.catvod.parser.merge.d0.h.e(str2);
        String[] split = str2.split(c.e(new byte[]{-18, -43}, new byte[]{-78, -2, 123, -6, 49, -88, -68, -90}));
        char c2 = 0;
        String str5 = split[0];
        String str6 = split[1];
        String[] split2 = split[3].split(c.e(new byte[]{87}, new byte[]{109, -76, 43, 76, -110, 59, 27, 62}));
        String[] split3 = split[2].split(c.e(new byte[]{104}, new byte[]{82, -44, 19, 126, 93, -108, 31, -120}));
        ArrayList arrayList = new ArrayList();
        String concat = c.e(new byte[]{-55, -62, 2, -16, 46, 47, -63, 94, -64, -58, 31, -82, 63, 124, -126, 24, -61, -33, 26, -23, 115, 118, -127, 28, -114, -50, 89, -10, 108, 58, -118, 28, -114, -38, 31, -13, 41, 59, -99, 30, -98, -39, 31, -28, 96}, new byte[]{-95, -74, 118, Byte.MIN_VALUE, 93, 21, -18, 113}).concat(str6);
        int i2 = 0;
        while (i2 < split2.length) {
            arrayList.add(split2[i2]);
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            J.d(new byte[]{85, 113, 12, 11, 71, -109, 69, 64, 76, 116, 10, 82, 24}, new byte[]{106, 21, 99, 54, 37, -6, 41, 41}, sb, str5);
            J.d(new byte[]{-127, 42, 120, -44, 99}, new byte[]{-89, 73, 17, -80, 94, 38, -104, -83}, sb, str6);
            sb.append(c.e(new byte[]{-110, 94, 53, -10}, new byte[]{-76, 47, 91, -53, -94, 66, 107, -49}));
            sb.append(split3[i2]);
            String f2 = I.f(new byte[]{75, 62, -93, 82, 75, -1, 2, 19, 9}, new byte[]{109, 74, -38, 34, 46, -62, 111, 99}, sb);
            if (str4.endsWith(c.e(new byte[]{-61, -127, 118, -87, -108, 4, -23, -121, -76, -5, 121, -5}, new byte[]{42, 30, -59, 65, 32, -84, 12, 37}))) {
                f2 = y.X(I.f(new byte[]{38, 26, 121, -104, -112, 7, 62, 121, 111, 10, 110, -60, -49}, new byte[]{0, 110, 11, -7, -2, 116, 97, 26}, G.d(f2)), "", c.e(new byte[]{95, -34, Byte.MAX_VALUE}, new byte[]{41, -79, 27, 112, 12, 71, 38, -49}), c.e(new byte[]{-10, 36, -114}, new byte[]{-101, 84, -22, 102, -110, 15, 105, -90}))[c2];
            } else if (str4.endsWith(c.e(new byte[]{54, -113, 40, 112, -55, -95, 61, 91, 65, -11, 39, 34, 85, -20, 118, 117, 57, -123, 47, 112, -64, -91, 63, 89, 94, 57}, new byte[]{-33, 16, -101, -104, 125, 9, -40, -7}))) {
                str3 = y.X(I.f(new byte[]{95, -88, 20, -44, -122, 13, -50, -89, 22, -72, 3, -120, -39}, new byte[]{121, -36, 102, -75, -24, 126, -111, -60}, G.d(f2)), "", c.e(new byte[]{-105, -112, 17}, new byte[]{-31, -1, 117, 30, 54, 94, -82, 118}), c.e(new byte[]{-58, 75, 26, -81}, new byte[]{-85, 59, 126, -55, -60, 10, -125, 102}))[0];
                arrayList.add(str3);
                i2++;
                c2 = 0;
            }
            str3 = f2;
            arrayList.add(str3);
            i2++;
            c2 = 0;
        }
        m mVar = new m();
        mVar.E(arrayList);
        mVar.b(concat);
        mVar.c();
        mVar.j(w());
        return mVar.toString();
    }

    public String searchContent(String str, boolean z) {
        if (y.I(str)) {
            return "";
        }
        return categoryContent(str, c.e(new byte[]{-50}, new byte[]{-1, -16, 126, -76, -69, -15, 2, -40}), true, new HashMap());
    }

    public String searchContent(String str, boolean z, String str2) {
        return y.I(str) ? "" : categoryContent(str, str2, true, new HashMap());
    }
}
