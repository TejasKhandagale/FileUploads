/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplayer;


//text11.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,20));
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class TreeViewHelper {

    public TreeViewHelper() {
    }

    public ArrayList<TreeItem> getLabels() {
        ArrayList<TreeItem> label = new ArrayList<TreeItem>();

        Label ac = new Label();
        ac.setText("Action Labels");

        //open_l.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,20));;
        TreeItem action = new TreeItem(ac);

        // TreeItem action = new TreeItem("Action Labels");
        Label open_l = new Label();
        open_l.setText("Open application");
        open_l.setTextFill(Color.VIOLET);
        //open_l.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,20));;
        TreeItem open = new TreeItem(open_l);

        Label create_l = new Label();
        create_l.setText("Create new post");
        create_l.setTextFill(Color.AQUA);
        TreeItem create = new TreeItem(create_l);

        Label search_1 = new Label();
        search_1.setText("Search");
        search_1.setTextFill(Color.BISQUE);
        TreeItem search = new TreeItem(search_1);

        TreeItem scroll = new TreeItem("Scroll");

        Label preview_1 = new Label();
        preview_1.setText("Preview");
        preview_1.setTextFill(Color.BLUE);
        TreeItem preview = new TreeItem(preview_1);

        Label discard_l = new Label();
        discard_l.setText("Discard");
        discard_l.setTextFill(Color.BLUEVIOLET);
        TreeItem discard = new TreeItem(discard_l);

        Label select_l = new Label();
        select_l.setText("Select");
        select_l.setTextFill(Color.BROWN);
        TreeItem select = new TreeItem(select_l);

        Label add_l = new Label();
        add_l.setText("Add");
        add_l.setTextFill(Color.BURLYWOOD);
        TreeItem add = new TreeItem(add_l);

        Label delete_l = new Label();
        delete_l.setText("Delete");
        delete_l.setTextFill(Color.CADETBLUE);
        TreeItem delete = new TreeItem(delete_l);

        TreeItem type = new TreeItem("Type");

        Label move_l = new Label();
        move_l.setText("Move Cursor");
        move_l.setTextFill(Color.CHARTREUSE);
        TreeItem move = new TreeItem(move_l);

        Label cap_photo_l = new Label();
        cap_photo_l.setText("Capture Photo");
        cap_photo_l.setTextFill(Color.CHOCOLATE);
        TreeItem cap_photo = new TreeItem(cap_photo_l);

        Label cap_vid_l = new Label();
        cap_vid_l.setText("Capture Video");
        cap_vid_l.setTextFill(Color.CORAL);
        TreeItem cap_vid = new TreeItem(cap_vid_l);

        Label crop_l = new Label();
        crop_l.setText("Crop Photo");
        crop_l.setTextFill(Color.CORNFLOWERBLUE);
        TreeItem crop = new TreeItem(crop_l);

        TreeItem edit = new TreeItem("Edit");

        Label post_l = new Label();
        post_l.setText("Post");
        post_l.setTextFill(Color.CRIMSON);
        TreeItem post = new TreeItem(post_l);

        Label copy_l = new Label();
        copy_l.setText("Copy");
        copy_l.setTextFill(Color.CYAN);
        TreeItem copy = new TreeItem(copy_l);

        Label paste_l = new Label();
        paste_l.setText("Paste");
        paste_l.setTextFill(Color.DARKBLUE);
        TreeItem paste = new TreeItem(paste_l);

        Label switch_app_l = new Label();
        switch_app_l.setText("Switch Application");
        switch_app_l.setTextFill(Color.DARKCYAN);
        TreeItem switch_app = new TreeItem(switch_app_l);

        Label receive_l = new Label();
        receive_l.setText("Receive Notification");
        receive_l.setTextFill(Color.DARKGOLDENROD);
        TreeItem receive = new TreeItem(receive_l);

        Label ignore_l = new Label();
        ignore_l.setText("Ignore Notification");
        ignore_l.setTextFill(Color.DARKGREEN);
        TreeItem ignore = new TreeItem(ignore_l);

        Label close_l = new Label();
        close_l.setText("Close Application");
        close_l.setTextFill(Color.DARKKHAKI);
        TreeItem close = new TreeItem(close_l);

        action.getChildren().addAll(open, create, search, scroll, preview, discard, select, add, delete, type, move, cap_photo, cap_vid, crop, edit, post, copy, paste, switch_app, receive, ignore, close);

        Label forward_l = new Label();
        forward_l.setText("Forward");
        forward_l.setTextFill(Color.DARKMAGENTA);
        TreeItem forward = new TreeItem(forward_l);

        Label backward_l = new Label();
        backward_l.setText("Backward");
        backward_l.setTextFill(Color.DARKORANGE);
        TreeItem backward = new TreeItem(backward_l);
        scroll.getChildren().addAll(forward, backward);

        Label add_text_l = new Label();
        add_text_l.setText("Add Text");
        add_text_l.setTextFill(Color.DARKOLIVEGREEN);
        TreeItem add_text = new TreeItem(add_text_l);

        Label del_text_1 = new Label();
        del_text_1.setText("Delete Text");
        del_text_1.setTextFill(Color.DARKORCHID);
        TreeItem del_text = new TreeItem(del_text_1);

        Label rep_text_l = new Label();
        rep_text_l.setText("Replace Text");
        rep_text_l.setTextFill(Color.DARKSALMON);
        TreeItem rep_text = new TreeItem(rep_text_l);
        type.getChildren().addAll(add_text, del_text, rep_text);

        Label text_1 = new Label();
        text_1.setText("Text");
        text_1.setTextFill(Color.DARKRED);
        TreeItem text = new TreeItem(text_1);

        Label photo_l = new Label();
        photo_l.setText("Photo");
        photo_l.setTextFill(Color.DARKSEAGREEN);
        TreeItem photo = new TreeItem(photo_l);

        Label video_l = new Label();
        video_l.setText("Video");
        video_l.setTextFill(Color.DARKSLATEBLUE);
        TreeItem video = new TreeItem("Video");

        Label audio_l = new Label();
        audio_l.setText("Audio");
        audio_l.setTextFill(Color.DARKTURQUOISE);
        TreeItem audio = new TreeItem("Audio");
        edit.getChildren().addAll(text, photo, video, audio);

        //verbal labels
        TreeItem verbal = new TreeItem("Verbal Labels");
        TreeItem planning = new TreeItem("Planning");
        TreeItem drafting = new TreeItem("Drafting");
        TreeItem revising = new TreeItem("Revising");
        TreeItem designing = new TreeItem("Designing");
        verbal.getChildren().addAll(planning, drafting, revising, designing);

        TreeItem sdp = new TreeItem("Schema-Driven Planning");
        TreeItem kdp = new TreeItem("Knowledge-Driven Planning");
        TreeItem cp = new TreeItem("Constructive Planning");
        planning.getChildren().addAll(sdp, kdp, cp);

        Label understanding_task_a_l = new Label();
        understanding_task_a_l.setText("Understanding task - Adequate");
        understanding_task_a_l.setTextFill(Color.DARKSLATEGRAY);
        TreeItem understanding_task_a = new TreeItem(understanding_task_a_l);

        Label understanding_task_i_l = new Label();
        understanding_task_i_l.setText("Understanding task - Inadequate");
        understanding_task_i_l.setTextFill(Color.DARKVIOLET);
        TreeItem understanding_task_i = new TreeItem(understanding_task_i_l);

        Label understanding_genre_a_l = new Label();
        understanding_genre_a_l.setText("Understanding genre - Adequate");
        understanding_genre_a_l.setTextFill(Color.DEEPPINK);
        TreeItem understanding_genre_a = new TreeItem(understanding_genre_a_l);

        Label understanding_genre_i_l = new Label();
        understanding_genre_i_l.setText("Understanding genre - Inadequate");
        understanding_genre_i_l.setTextFill(Color.DEEPSKYBLUE);
        TreeItem understanding_genre_i = new TreeItem(understanding_genre_i_l);
        sdp.getChildren().addAll(understanding_task_a, understanding_task_i, understanding_genre_a, understanding_genre_i);

        Label kdp_a_l = new Label();
        kdp_a_l.setText("Knowing Topic - Adequate");
        kdp_a_l.setTextFill(Color.DODGERBLUE);
        TreeItem kdp_a = new TreeItem(kdp_a_l);

        Label kdp_i_l = new Label();
        kdp_i_l.setText("Knowing Topic - Inadequate");
        kdp_i_l.setTextFill(Color.FIREBRICK);
        TreeItem kdp_i = new TreeItem(kdp_i_l);
        kdp.getChildren().addAll(kdp_a, kdp_i);

        Label cp_brt_l = new Label();
        cp_brt_l.setText("Building Represenetation of Task");
        cp_brt_l.setTextFill(Color.FORESTGREEN);
        TreeItem cp_brt = new TreeItem(cp_brt_l);

        TreeItem cp_create_goal = new TreeItem("Creating Goal");

        TreeItem cp_create_subgoal = new TreeItem("Creating Sub-Goal");

        Label cp_link_l = new Label();
        cp_link_l.setText("Linking Goal and Sub-Goal");
        cp_link_l.setTextFill(Color.FUCHSIA);
        TreeItem cp_link = new TreeItem(cp_link_l);

        cp_create_subgoal.getChildren().add(cp_link);
        cp_create_goal.getChildren().add(cp_create_subgoal);

        Label cp_devising_plan_l = new Label();
        cp_devising_plan_l.setText("Devising Plan");
        cp_devising_plan_l.setTextFill(Color.GAINSBORO);
        TreeItem cp_devising_plan = new TreeItem(cp_devising_plan_l);

        Label cp_integrateGP_l = new Label();
        cp_integrateGP_l.setText("Integrating Goals and Plans");
        cp_integrateGP_l.setTextFill(Color.GOLD);
        TreeItem cp_integrateGP = new TreeItem(cp_integrateGP_l);

        Label cp_intension_l = new Label();
        cp_intension_l.setText("Setting Intension");
        cp_intension_l.setTextFill(Color.GREENYELLOW);
        TreeItem cp_intension = new TreeItem(cp_intension_l);

        Label cp_progress_l = new Label();
        cp_progress_l.setText("Monitoring Progress on Goals");
        cp_progress_l.setTextFill(Color.GREEN);
        TreeItem cp_progress = new TreeItem(cp_progress_l);

        Label cp_consolidate_l = new Label();
        cp_consolidate_l.setText("Consolidating Plan");
        cp_consolidate_l.setTextFill(Color.GOLDENROD);
        TreeItem cp_consolidate = new TreeItem(cp_consolidate_l);

        TreeItem cp_Create_abstract_goal = new TreeItem("Creating Abstract Goal");

        Label cp_creategoal_pointer_word_l = new Label();
        cp_creategoal_pointer_word_l.setText("Using a Pointer Word");
        cp_creategoal_pointer_word_l.setTextFill(Color.HOTPINK);
        TreeItem cp_creategoal_pointer_word = new TreeItem(cp_creategoal_pointer_word_l);

        Label cp_creategoal_how_to_l = new Label();
        cp_creategoal_how_to_l.setText("Creating a How-to");
        cp_creategoal_how_to_l.setTextFill(Color.HONEYDEW);
        TreeItem cp_creategoal_how_to = new TreeItem(cp_creategoal_how_to_l);
        cp_Create_abstract_goal.getChildren().addAll(cp_creategoal_pointer_word, cp_creategoal_how_to);

        Label cp_resolveconflict_l = new Label();
        cp_resolveconflict_l.setText("Resolving Conflict");
        cp_resolveconflict_l.setTextFill(Color.INDIANRED);
        TreeItem cp_resolveconflict = new TreeItem();
        cp.getChildren().addAll(cp_brt, cp_create_goal, cp_devising_plan, cp_integrateGP, cp_intension, cp_progress, cp_consolidate, cp_Create_abstract_goal, cp_resolveconflict);

        TreeItem invoke = new TreeItem("Invoking Pre-Text");

        Label describe_pre_l = new Label();
        describe_pre_l.setText("Describing Pre-Text");
        describe_pre_l.setTextFill(Color.INDIGO);

        Label eval_pre_l = new Label();
        eval_pre_l.setText("Evaluating Pre-Text");
        eval_pre_l.setTextFill(Color.KHAKI);

        Label revise_pre_l = new Label();
        revise_pre_l.setText("Revising Pre-Text");
        revise_pre_l.setTextFill(Color.LAWNGREEN);
        invoke.getChildren().addAll(new TreeItem(describe_pre_l), new TreeItem(eval_pre_l), new TreeItem(revise_pre_l));

        TreeItem translate = new TreeItem("Translating Pre-Text");

        Label produce_text_l = new Label();
        produce_text_l.setText("Producing text from Pre-Text");
        produce_text_l.setTextFill(Color.LEMONCHIFFON);

        Label evaluate_pretext_l = new Label();
        evaluate_pretext_l.setText("Evaluating Pre-Text to Text Produced So Far");
        evaluate_pretext_l.setTextFill(Color.LIGHTBLUE);
        translate.getChildren().addAll(new TreeItem(produce_text_l), new TreeItem(evaluate_pretext_l));

        TreeItem developing = new TreeItem("Developing Prose");
        TreeItem content = new TreeItem("Content-Based");
        TreeItem discourse = new TreeItem("Discourse-Based");

        Label translate_content_prob_l = new Label();
        translate_content_prob_l.setText("Translating a Content Problem");
        translate_content_prob_l.setTextFill(Color.LIGHTCORAL);
        content.getChildren().add(new TreeItem(translate_content_prob_l));

        Label translate_rhetorical_l = new Label();
        translate_rhetorical_l.setText("Translating a Rhetorical Problem");
        translate_rhetorical_l.setTextFill(Color.LIGHTCYAN);
        discourse.getChildren().add(new TreeItem(translate_rhetorical_l));

        developing.getChildren().addAll(content, discourse);
        drafting.getChildren().addAll(invoke, translate, developing);

        TreeItem review = new TreeItem("Reviewing");
        TreeItem evaluate = new TreeItem("Evaluate Text Produced Against Plan");

        Label change_text_l = new Label();
        change_text_l.setText("Change to Text");
        change_text_l.setTextFill(Color.LIGHTGOLDENRODYELLOW);

        Label change_plan_l = new Label();
        change_plan_l.setText("Change to Plan");
        change_plan_l.setTextFill(Color.LIGHTPINK);

        Label no_change_l = new Label();
        no_change_l.setText("No Change");
        no_change_l.setTextFill(Color.LIGHTSALMON);

        evaluate.getChildren().addAll(new TreeItem(change_text_l), new TreeItem(change_plan_l), new TreeItem(no_change_l));
        review.getChildren().addAll(evaluate);
        TreeItem changing_form = new TreeItem("Changing Form");

        Label spelling_l = new Label();
        spelling_l.setText("Spelling");
        spelling_l.setTextFill(Color.LIGHTSEAGREEN);

        Label tense_l = new Label();
        tense_l.setText("Tense");
        tense_l.setTextFill(Color.LIGHTSKYBLUE);

        Label number_l = new Label();
        number_l.setText("Number");
        number_l.setTextFill(Color.LIGHTSTEELBLUE);

        Label modal_l = new Label();
        modal_l.setText("Modality");
        modal_l.setTextFill(Color.LIMEGREEN);

        Label abbr_l = new Label();
        abbr_l.setText("Abbreviation");
        abbr_l.setTextFill(Color.MAGENTA);

        Label punctation_l = new Label();
        punctation_l.setText("Punctuation");
        punctation_l.setTextFill(Color.MAROON);

        Label format_l = new Label();
        format_l.setText("Format");
        format_l.setTextFill(Color.MEDIUMAQUAMARINE);

        changing_form.getChildren().addAll(new TreeItem(), new TreeItem(spelling_l), new TreeItem(tense_l), new TreeItem(number_l), new TreeItem(abbr_l), new TreeItem(punctation_l), new TreeItem(format_l));

        TreeItem preserving_meaning = new TreeItem("Preserving Meaning Change");

        Label p_ad_l = new Label("Preserving Meaning Change - Addition");
        p_ad_l.setTextFill(Color.MEDIUMBLUE);

        Label p_de_l = new Label("Preserving Meaning Change - Deletion");
        p_de_l.setTextFill(Color.MEDIUMORCHID);

        Label p_sub_l = new Label("Preserving Meaning Change - Substitution");
        p_sub_l.setTextFill(Color.MEDIUMPURPLE);

        Label p_per_l = new Label("Preserving Meaning Change - Permutation");
        p_per_l.setTextFill(Color.MEDIUMSLATEBLUE);

        Label p_dis_l = new Label("Preserving Meaning Change - Distribution");
        p_dis_l.setTextFill(Color.MEDIUMSPRINGGREEN);

        Label p_con_l = new Label("Preserving Meaning Change - Consolidation");
        p_con_l.setTextFill(Color.MEDIUMTURQUOISE);

        preserving_meaning.getChildren().addAll(new TreeItem(p_ad_l), new TreeItem(p_de_l), new TreeItem(p_sub_l), new TreeItem(p_per_l), new TreeItem(p_dis_l), new TreeItem(p_con_l));

        TreeItem micro_structural_change = new TreeItem("Micro-Structural Change");

        Label mi_ad_l = new Label("Micro-Structural Change - Addition");
        mi_ad_l.setTextFill(Color.MEDIUMVIOLETRED);

        Label mi_de_l = new Label("Micro-Structural Change - Deletion");
        mi_de_l.setTextFill(Color.MIDNIGHTBLUE);

        Label mi_sub_l = new Label("Micro-Structural Change - Substitution");
        mi_sub_l.setTextFill(Color.MISTYROSE);

        Label mi_per_l = new Label("Micro-Structural Change - Permutation");
        mi_per_l.setTextFill(Color.MOCCASIN);

        Label mi_dis_l = new Label("Micro-Structural Change - Distribution");
        mi_dis_l.setTextFill(Color.NAVAJOWHITE);

        Label mi_con_l = new Label("Micro-Structural Change - Consolidation");
        mi_con_l.setTextFill(Color.OLIVE);

        micro_structural_change.getChildren().addAll(new TreeItem(mi_ad_l), new TreeItem(mi_de_l), new TreeItem(mi_sub_l), new TreeItem(mi_per_l), new TreeItem(mi_dis_l), new TreeItem(mi_con_l));

        TreeItem macro_structural_change = new TreeItem("Macro-Structural Change");

        Label ma_ad_l = new Label("Macro-Structural Change - Addition");
        ma_ad_l.setTextFill(Color.OLIVEDRAB);

        Label ma_de_l = new Label("Macro-Structural Change - Deletion");
        ma_de_l.setTextFill(Color.ORANGE);

        Label ma_sub_l = new Label("Macro-Structural Change - Substitution");
        ma_sub_l.setTextFill(Color.ORANGERED);

        Label ma_per_l = new Label("Macro-Structural Change - Permutation");
        ma_per_l.setTextFill(Color.ORCHID);

        Label ma_dis_l = new Label("Macro-Structural Change - Distribution");
        ma_dis_l.setTextFill(Color.PALEGREEN);

        Label ma_con_l = new Label("Macro-Structural Change - Consolidation");
        ma_con_l.setTextFill(Color.PALEVIOLETRED);

        macro_structural_change.getChildren().addAll(new TreeItem(ma_ad_l), new TreeItem(ma_de_l), new TreeItem(ma_sub_l), new TreeItem(ma_per_l), new TreeItem(ma_dis_l), new TreeItem(ma_con_l));

        revising.getChildren().addAll(review, changing_form, preserving_meaning, micro_structural_change, macro_structural_change);

        Label select_mode_l = new Label("Selecting mode");
        select_mode_l.setTextFill(Color.PERU);
        TreeItem select_mode = new TreeItem(select_mode_l);

        Label arrange_order_l = new Label("Arranging order");
        arrange_order_l.setTextFill(Color.PINK);
        TreeItem arrange_order = new TreeItem(arrange_order_l);

        TreeItem foreground_modes = new TreeItem("Foregrounding Modes");

        Label word_specific_l = new Label("Word-Specific");
        word_specific_l.setTextFill(Color.PLUM);

        Label img_specific_l = new Label("Image-Specific");
        img_specific_l.setTextFill(Color.PURPLE);

        Label duo_spec_l = new Label("Duo-Specific");
        duo_spec_l.setTextFill(Color.RED);

        Label word_add_img_add_l = new Label("Word-AdditiveImage-Additive");
        word_add_img_add_l.setTextFill(Color.ROSYBROWN);

        Label para_cm_l = new Label("Parallel Combination");
        para_cm_l.setTextFill(Color.ROYALBLUE);

        Label montage_cm_l = new Label("Montage Combination");
        montage_cm_l.setTextFill(Color.SANDYBROWN);

        Label interdependent_cm_l = new Label("Interdependent Combination");
        interdependent_cm_l.setTextFill(Color.SLATEBLUE);

        foreground_modes.getChildren().addAll(new TreeItem(word_specific_l), new TreeItem(img_specific_l), new TreeItem(duo_spec_l), new TreeItem(word_add_img_add_l), new TreeItem(para_cm_l), new TreeItem(montage_cm_l), new TreeItem(interdependent_cm_l));

        TreeItem construct_read_path = new TreeItem("Constructing a Reading Path");

        Label temp_l = new Label("Temporal");
        temp_l.setTextFill(Color.SPRINGGREEN);

        Label seq_l = new Label("Sequential");
        seq_l.setTextFill(Color.STEELBLUE);

        Label hier_l = new Label("Hierarchical");
        hier_l.setTextFill(Color.TAN);

        Label tropical_l = new Label("Topical");
        tropical_l.setTextFill(Color.TEAL);

        Label task_oriented_l = new Label("Task-Oriented");
        task_oriented_l.setTextFill(Color.TOMATO);

        Label geopraphical_l = new Label("Geographical");
        geopraphical_l.setTextFill(Color.VIOLET);

        construct_read_path.getChildren().addAll(new TreeItem(temp_l), new TreeItem(seq_l), new TreeItem(hier_l), new TreeItem(tropical_l), new TreeItem(task_oriented_l), new TreeItem(geopraphical_l));
        designing.getChildren().addAll(select_mode, arrange_order, foreground_modes, construct_read_path);

        label.add(action);
        label.add(verbal);

        return label;
    }

    public TreeItem getTreeViewItem(TreeItem item, String value) {
        //System.out.println(item.getValue().getClass());
       // System.out.println("hihi:" + item.getValue());
        String s = item.getValue().toString();
        String[] ss = s.split("'");
        
//        System.out.println("ss length:" + ss.length);
//        for(int i = 0;i<ss.length;i++)
//        {
//            System.out.println(ss[i]);
//        }
        //System.out.println("Done");
        item.setExpanded(true);
        String str = "";
        if (ss.length > 1) {
            str = ss[1];
        } else {
            str = ss[0];
        }
                   
       // System.out.println(str);
        String v = str.replaceAll("'", "");

        if (item != null && v.equals(value)) {
            return item;
        }
        TreeItem temp = null;

        for (Object child : item.getChildren()) {
            temp = getTreeViewItem((TreeItem) child, value);
            if (temp != null) {
                return temp;
            }
        }

        return null;
    }

}